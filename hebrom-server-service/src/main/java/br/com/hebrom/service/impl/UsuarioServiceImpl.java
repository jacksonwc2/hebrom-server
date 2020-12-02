package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Usuario;
import br.com.hebrom.repository.UsuarioRepository;
import br.com.hebrom.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Lazy
    @Autowired
    private UsuarioRepository entidadeRepository;

    @Override
    public List<Usuario> adquirirTodos() {

        return entidadeRepository.findAll();
    }

    @Override
    public Usuario salvar(Usuario entidadeDTO) {

        return entidadeRepository.save(entidadeDTO);
    }

}
