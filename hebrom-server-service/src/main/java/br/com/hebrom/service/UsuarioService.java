package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.domain.Usuario;

public interface UsuarioService {

    public List<Usuario> adquirirTodos();

    public Usuario salvar(Usuario entidadeDTO);

}
