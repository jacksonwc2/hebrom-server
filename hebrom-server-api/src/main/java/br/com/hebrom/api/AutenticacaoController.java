package br.com.hebrom.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hebrom.payload.AutenticacaoPayloadDTO;
import br.com.hebrom.retrieve.AutenticacaoRetrieveDTO;

@RequestMapping("/autenticacao")
public interface AutenticacaoController {

    @PostMapping(value = "/login", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<AutenticacaoRetrieveDTO> realizarLogin(AutenticacaoPayloadDTO autenticacaoDTO) throws Exception;

}
