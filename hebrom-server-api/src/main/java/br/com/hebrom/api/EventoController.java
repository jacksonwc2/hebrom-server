package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.generic.EventoDTO;

@RequestMapping("/eventoService")
public interface EventoController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventoDTO> adquirirTodos();

    @RequestMapping(value = "/adquirir/{codigoEvento}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public EventoDTO adquirirPorId(Long codigoEvento);

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public EventoDTO salvar(EventoDTO eventoDTO);

    @RequestMapping(value = "/deletar/{codigoEvento}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public EventoDTO deletar(Long codigoEvento);
}
