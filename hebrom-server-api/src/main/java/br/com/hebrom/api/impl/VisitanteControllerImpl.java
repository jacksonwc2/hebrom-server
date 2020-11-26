package br.com.hebrom.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.VisitanteController;
import br.com.hebrom.domain.Visitante;
import br.com.hebrom.service.VisitanteService;

@RestController
public class VisitanteControllerImpl implements VisitanteController {

    @Lazy
    @Autowired
    private VisitanteService entidadeService;

    @Override
    public List<Visitante> adquirirTodos() {
        return entidadeService.adquirirTodos();
    }

    @Override
    public Visitante salvar(@RequestBody Visitante entidadeDTO) {
        return entidadeService.salvar(entidadeDTO);
    }

}
