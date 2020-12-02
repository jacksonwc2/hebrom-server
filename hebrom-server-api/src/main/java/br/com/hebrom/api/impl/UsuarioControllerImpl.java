package br.com.hebrom.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.UsuarioController;
import br.com.hebrom.domain.Usuario;
import br.com.hebrom.service.UsuarioService;

@RestController
public class UsuarioControllerImpl implements UsuarioController {

    @Lazy
    @Autowired
    private UsuarioService entidadeService;

    @Override
    public List<Usuario> adquirirTodos() {
        return entidadeService.adquirirTodos();
    }

    @Override
    public Usuario salvar(@RequestBody Usuario entidadeDTO) {
        return entidadeService.salvar(entidadeDTO);
    }

}
