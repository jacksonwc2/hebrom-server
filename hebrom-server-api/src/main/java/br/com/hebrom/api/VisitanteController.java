package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.domain.Visitante;

@RequestMapping("/visitanteService")
public interface VisitanteController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Visitante> adquirirTodos();

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Visitante salvar(Visitante entidadeDTO);

}
