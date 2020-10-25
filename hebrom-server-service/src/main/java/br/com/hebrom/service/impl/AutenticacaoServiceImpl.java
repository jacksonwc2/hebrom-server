package br.com.hebrom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Usuario;
import br.com.hebrom.payload.AutenticacaoPayloadDTO;
import br.com.hebrom.repository.UsuarioRepository;
import br.com.hebrom.retrieve.AutenticacaoRetrieveDTO;
import br.com.hebrom.service.AutenticacaoService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class AutenticacaoServiceImpl implements AutenticacaoService {

    @Lazy
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public AutenticacaoRetrieveDTO realizarLogin(AutenticacaoPayloadDTO autenticacaoDTO) throws Exception {

        Usuario usuario = usuarioRepository.realizarLogin(autenticacaoDTO);

        if (usuario == null) {
            throw new Exception("Login inválido");
        }

        return ModelMapperUtil.convert(usuario, AutenticacaoRetrieveDTO.class);
    }

}