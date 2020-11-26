package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.domain.Visitante;

public interface VisitanteService {

    public List<Visitante> adquirirTodos();

    public Visitante salvar(Visitante entidadeDTO);

}
