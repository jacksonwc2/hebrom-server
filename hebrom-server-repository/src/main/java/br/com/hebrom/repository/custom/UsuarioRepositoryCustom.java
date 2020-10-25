package br.com.hebrom.repository.custom;

import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Usuario;
import br.com.hebrom.payload.AutenticacaoPayloadDTO;

@Repository
public interface UsuarioRepositoryCustom {

    Usuario realizarLogin(AutenticacaoPayloadDTO autenticacaoDTO);

}