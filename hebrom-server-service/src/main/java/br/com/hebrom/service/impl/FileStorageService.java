package br.com.hebrom.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import br.com.hebrom.config.FileStorageProperties;

@Service
public class FileStorageService {

    private final Path fileStorageLocation;

    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) throws Exception {

        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new Exception("Diretório não criado.", ex);
        }
    }

    public String storeFile(MultipartFile file, String name) throws Exception {
        String fileName = name != null ? name : StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new Exception("Desculpe! Nome do arquivo contém sequência de caminho inválida " + fileName);
            }

            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
            throw new Exception("Não foi possível armazenar o arquivo " + fileName + ". Por favor, tente novamente!", ex);
        }
    }

    public Resource loadFileAsResource(String fileName) throws Exception {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                throw new Exception("Arquivo não encontrado " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new Exception("Arquivo não encontrado " + fileName, ex);
        }
    }

    public URI pathImage(String fileName) throws Exception {
        Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
        return filePath.toUri();
    }
}
