package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.generic.CategoriaDTO;

@RequestMapping("/espacoService")
public interface EspacoController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoriaDTO> adquirirTodos();

    @RequestMapping(value = "/adquirir/{codigoCategoria}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoriaDTO adquirirPorId(Long codigoCategoria);

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoriaDTO salvar(CategoriaDTO categoriaDTO);

    @RequestMapping(value = "/deletar/{codigoCategoria}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoriaDTO deletar(Long codigoCategoria);
}
