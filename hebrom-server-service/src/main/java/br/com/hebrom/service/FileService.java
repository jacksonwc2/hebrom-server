package br.com.hebrom.service;

import org.springframework.web.multipart.MultipartFile;

import br.com.hebrom.generic.StringDTO;

public interface FileService {

    public StringDTO upload(MultipartFile[] files);

}
