package br.com.hebrom.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    public List<String> upload(MultipartFile[] files);

}
