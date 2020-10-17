package br.com.hebrom.service.impl;

import org.springframework.stereotype.Service;

import br.com.hebrom.payload.AutenticacaoPayloadDTO;
import br.com.hebrom.retrieve.AutenticacaoRetrieveDTO;
import br.com.hebrom.service.AutenticacaoService;

@Service
public class AutenticacaoServiceImpl implements AutenticacaoService {

    @Override
    public AutenticacaoRetrieveDTO realizarLogin(AutenticacaoPayloadDTO autenticacaoDTO) throws Exception {

        if (!autenticacaoDTO.getUsuario().equals("admin")) {
            throw new Exception("Errooou");
        }

        AutenticacaoRetrieveDTO autenticacaoRetrieveDTO = new AutenticacaoRetrieveDTO();
        autenticacaoRetrieveDTO.setNome("Jackson");
        autenticacaoRetrieveDTO.setToken("Token");

        return autenticacaoRetrieveDTO;
    }

}