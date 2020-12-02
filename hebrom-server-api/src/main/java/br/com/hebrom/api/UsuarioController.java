package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.domain.Usuario;

@RequestMapping("/usuarioService")
public interface UsuarioController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> adquirirTodos();

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario salvar(Usuario entidadeDTO);

}
