package br.com.hebrom.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.hebrom.service.FileService;
import br.com.hebrom.util.DateUtil;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileStorageService fileStorageService;

    @Override
    public String upload(MultipartFile[] files) {

        String fileName = "";

        for (MultipartFile multipartFile : files) {
            try {
                fileName = fileStorageService.storeFile(multipartFile,
                        DateUtil.toString(new Date(), DateUtil.DD_MM_YYYY_HH_MM_SS_IMAGE) + multipartFile.getOriginalFilename());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return fileName;
    }
}
