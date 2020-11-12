package br.com.hebrom.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    public String upload(MultipartFile[] files);

}
