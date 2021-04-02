package br.com.hebrom.api;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import br.com.hebrom.generic.StringDTO;

@RequestMapping("/fileService")
public interface FileController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public abstract StringDTO uploads(MultipartFile[] files);

    @GetMapping("/files/{fileName:.+}")
    public abstract void downloadFile(String fileName, HttpServletResponse response);

}
