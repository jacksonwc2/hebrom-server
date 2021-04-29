package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Evento;
import br.com.hebrom.generic.EventoDTO;
import br.com.hebrom.repository.EventoDTORepository;
import br.com.hebrom.repository.EventoRepository;
import br.com.hebrom.service.EventoService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class EventoServiceImpl implements EventoService {

    @Lazy
    @Autowired
    private EventoRepository eventoRepository;

    @Lazy
    @Autowired
    private EventoDTORepository eventoDTORepository;

    @Override
    public List<EventoDTO> adquirirTodos(String pesquisa, Long categoria, List<Long> entidades, List<Long> localizacoes, String dataInicio,
            String dataFim) {
        return ModelMapperUtil.mapList(eventoDTORepository.adquirirTodos(pesquisa, categoria, entidades, localizacoes, dataInicio, dataFim),
                EventoDTO.class);
    }

    @Override
    public EventoDTO adquirirPorId(Long codigoLocalizacao) {
        return ModelMapperUtil.convert(eventoRepository.findById(codigoLocalizacao).orElse(null), EventoDTO.class);
    }

    @Override
    public EventoDTO salvar(EventoDTO eventoDTO) {

        Evento evento = eventoRepository.save(ModelMapperUtil.convert(eventoDTO, Evento.class));

        return ModelMapperUtil.convert(evento, EventoDTO.class);
    }

    @Override
    public EventoDTO deletar(Long codigoEvento) {
        Evento evento = null;

        if (codigoEvento != null) {
            evento = eventoRepository.findById(codigoEvento).get();
        }

        eventoRepository.delete(evento);

        return ModelMapperUtil.convert(evento, EventoDTO.class);
    }

}
