package br.com.hebrom.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.LocalizacaoController;
import br.com.hebrom.generic.LocalizacaoDTO;
import br.com.hebrom.service.LocalizacaoService;

@RestController
public class LocalizacaoControllerImpl implements LocalizacaoController {

    @Lazy
    @Autowired
    private LocalizacaoService localizacaoService;

    @Override
    public List<LocalizacaoDTO> adquirirTodos() {
        return localizacaoService.adquirirTodos();
    }

    @Override
    public LocalizacaoDTO adquirirPorId(@PathVariable(value = "codigoLocalizacao", required = false) Long codigoLocalizacao) {
        return localizacaoService.adquirirPorId(codigoLocalizacao);
    }

    @Override
    public LocalizacaoDTO salvar(@RequestBody LocalizacaoDTO localizacaoDTO) {
        return localizacaoService.salvar(localizacaoDTO);
    }

    @Override
    public LocalizacaoDTO deletar(@PathVariable(value = "codigoLocalizacao", required = false) Long codigoLocalizacao) {
        return localizacaoService.deletar(codigoLocalizacao);
    }

}
