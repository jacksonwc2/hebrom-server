package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.EventoDTO;

public interface EventoService {

    public List<EventoDTO> adquirirTodos(String pesquisa, Long categoria, List<Long> entidades, List<Long> localizacoes, String dataInicio,
            String dataFim);

    public EventoDTO adquirirPorId(Long codigoEvento);

    public EventoDTO salvar(EventoDTO localizacaoDTO);

    public EventoDTO deletar(Long codigoLocalizacao);
}
