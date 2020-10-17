package br.com.hebrom.service;

import br.com.hebrom.payload.AutenticacaoPayloadDTO;
import br.com.hebrom.retrieve.AutenticacaoRetrieveDTO;

public interface AutenticacaoService {

    public abstract AutenticacaoRetrieveDTO realizarLogin(AutenticacaoPayloadDTO autenticacaoDTO) throws Exception;

}