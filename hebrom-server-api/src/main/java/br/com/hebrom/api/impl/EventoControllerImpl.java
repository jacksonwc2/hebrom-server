package br.com.hebrom.api.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.hebrom.api.EventoController;
import br.com.hebrom.generic.EventoDTO;
import br.com.hebrom.service.EventoService;

@RestController
public class EventoControllerImpl implements EventoController {

    @Lazy
    @Autowired
    private EventoService eventoService;

    @Override
    public List<EventoDTO> adquirirTodos(String pesquisa, Long categoria, String entidades, String localizacoes, String dataInicio, String dataFim) {

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Long>>() {
        }.getType();

        List<Long> listaEntidades = entidades != null ? gson.fromJson(entidades, listType) : null;
        List<Long> listaLocalizacoes = gson.fromJson(localizacoes, listType) != null ? gson.fromJson(localizacoes, listType) : null;

        return eventoService.adquirirTodos(pesquisa, categoria, listaEntidades, listaLocalizacoes, dataInicio, dataFim);
    }

    @Override
    public EventoDTO adquirirPorId(@PathVariable(value = "codigoEvento", required = false) Long codigoEvento) {
        return eventoService.adquirirPorId(codigoEvento);
    }

    @Override
    public EventoDTO salvar(@RequestBody EventoDTO eventoDTO) {
        return eventoService.salvar(eventoDTO);
    }

    @Override
    public EventoDTO deletar(@PathVariable(value = "codigoEvento", required = false) Long codigoEvento) {
        return eventoService.deletar(codigoEvento);
    }

}
