package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.EventoDTO;

public interface EventoService {

    public List<EventoDTO> adquirirTodos();

    public EventoDTO adquirirPorId(Long codigoEvento);

    public EventoDTO salvar(EventoDTO localizacaoDTO);

    public EventoDTO deletar(Long codigoLocalizacao);
}
