package br.com.hebrom.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.AutenticacaoController;
import br.com.hebrom.payload.AutenticacaoPayloadDTO;
import br.com.hebrom.retrieve.AutenticacaoRetrieveDTO;
import br.com.hebrom.service.AutenticacaoService;

@RestController
public class AutenticacaoControllerImpl implements AutenticacaoController {

    @Lazy
    @Autowired
    private AutenticacaoService autenticacaoService;

    public ResponseEntity<AutenticacaoRetrieveDTO> realizarLogin(@RequestBody AutenticacaoPayloadDTO autenticacaoDTO) throws Exception {

        return ResponseEntity.ok(autenticacaoService.realizarLogin(autenticacaoDTO));
    }

}