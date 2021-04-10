package br.com.hebrom.repository.custom;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.hebrom.generic.EventoRepositoryDTO;

@Repository
public interface EventoDTORepositoryCustom {

    public List<EventoRepositoryDTO> adquirirTodos(String pesquisa, Long categoria);

}