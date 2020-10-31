package br.com.hebrom.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.EntidadeController;
import br.com.hebrom.generic.EntidadeDTO;
import br.com.hebrom.service.EntidadeService;

@RestController
public class EntidadeControllerImpl implements EntidadeController {

    @Lazy
    @Autowired
    private EntidadeService entidadeService;

    @Override
    public List<EntidadeDTO> adquirirTodos() {
        return entidadeService.adquirirTodos();
    }

    @Override
    public EntidadeDTO adquirirPorId(@PathVariable(value = "codigoEntidade", required = false) Long codigoEntidade) {
        return entidadeService.adquirirPorId(codigoEntidade);
    }

    @Override
    public EntidadeDTO salvar(@RequestBody EntidadeDTO entidadeDTO) {
        return entidadeService.salvar(entidadeDTO);
    }

    @Override
    public EntidadeDTO deletar(@PathVariable(value = "codigoEntidade", required = false) Long codigoEntidade) {
        return entidadeService.deletar(codigoEntidade);
    }

}
