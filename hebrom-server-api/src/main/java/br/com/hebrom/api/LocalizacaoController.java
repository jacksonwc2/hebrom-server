package br.com.hebrom.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hebrom.generic.LocalizacaoDTO;

@RequestMapping("/localizacaoService")
public interface LocalizacaoController {

    @RequestMapping(value = "/adquirirTodos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LocalizacaoDTO> adquirirTodos();

    @RequestMapping(value = "/adquirir/{codigoLocalizacao}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LocalizacaoDTO adquirirPorId(Long codigoLocalizacao);

    @RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public LocalizacaoDTO salvar(LocalizacaoDTO localizacaoDTO);

    @RequestMapping(value = "/deletar/{codigoLocalizacao}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public LocalizacaoDTO deletar(Long codigoLocalizacao);
}
