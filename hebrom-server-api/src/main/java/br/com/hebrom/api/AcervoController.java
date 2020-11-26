package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.generic.AcervoDTO;

@RequestMapping("/acervoService")
public interface AcervoController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AcervoDTO> adquirirTodos(Long codigoCategoria, Long codigoEspaco, String nome);

    @RequestMapping(value = "/adquirir/{codigoEntidade}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AcervoDTO adquirirPorId(Long codigoEntidade);

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public AcervoDTO salvar(AcervoDTO entidadeDTO);

    @RequestMapping(value = "/deletar/{codigoEntidade}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AcervoDTO deletar(Long codigoEntidade);
}
