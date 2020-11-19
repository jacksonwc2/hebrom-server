package br.com.hebrom.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public List<String> upload(MultipartFile[] files) {

        List<String> ret = new ArrayList<>();

        for (MultipartFile multipartFile : files) {
            try {
                ret.add(fileStorageService.storeFile(multipartFile,
                        DateUtil.toString(new Date(), DateUtil.DD_MM_YYYY_HH_MM_SS_IMAGE) + multipartFile.getOriginalFilename()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return ret;
    }
}
