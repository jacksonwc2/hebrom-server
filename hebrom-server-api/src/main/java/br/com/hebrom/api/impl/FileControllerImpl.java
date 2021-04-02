package br.com.hebrom.api.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.hebrom.api.FileController;
import br.com.hebrom.generic.StringDTO;
import br.com.hebrom.service.FileService;
import br.com.hebrom.service.impl.FileStorageService;

@RestController
public class FileControllerImpl implements FileController {

    @Lazy
    @Autowired
    private FileService uploadService;

    @Autowired
    private FileStorageService fileStorageService;

    @Override
    public StringDTO uploads(@RequestPart("filename") MultipartFile[] files) {

        return uploadService.upload(files);
    }

    @Override
    public void downloadFile(@PathVariable String fileName, HttpServletResponse response) {
        try {
            InputStream in = new FileInputStream(new File(fileStorageService.pathImage(fileName)));
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            IOUtils.copy(in, response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
