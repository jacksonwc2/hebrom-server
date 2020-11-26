package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Visitante;
import br.com.hebrom.repository.VisitanteRepository;
import br.com.hebrom.service.VisitanteService;

@Service
public class VisitanteServiceImpl implements VisitanteService {

    @Lazy
    @Autowired
    private VisitanteRepository entidadeRepository;

    @Override
    public List<Visitante> adquirirTodos() {

        return entidadeRepository.findAll();
    }

    @Override
    public Visitante salvar(Visitante entidadeDTO) {

        return entidadeRepository.save(entidadeDTO);
    }

}
