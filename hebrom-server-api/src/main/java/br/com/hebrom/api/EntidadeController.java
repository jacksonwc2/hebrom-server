package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.generic.EntidadeDTO;

@RequestMapping("/entidadeService")
public interface EntidadeController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EntidadeDTO> adquirirTodos();

    @RequestMapping(value = "/adquirir/{codigoEntidade}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadeDTO adquirirPorId(Long codigoEntidade);

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadeDTO salvar(EntidadeDTO entidadeDTO);

    @RequestMapping(value = "/deletar/{codigoEntidade}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public EntidadeDTO deletar(Long codigoEntidade);
}
