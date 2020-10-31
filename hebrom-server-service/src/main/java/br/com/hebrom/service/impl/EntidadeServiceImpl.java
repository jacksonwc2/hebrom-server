package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Entidade;
import br.com.hebrom.generic.EntidadeDTO;
import br.com.hebrom.repository.EntidadeRepository;
import br.com.hebrom.service.EntidadeService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class EntidadeServiceImpl implements EntidadeService {

    @Lazy
    @Autowired
    private EntidadeRepository entidadeRepository;

    @Override
    public List<EntidadeDTO> adquirirTodos() {
        return ModelMapperUtil.mapList(entidadeRepository.findAll(), EntidadeDTO.class);
    }

    @Override
    public EntidadeDTO adquirirPorId(Long codigoEntidade) {
        return ModelMapperUtil.convert(entidadeRepository.findById(codigoEntidade).orElse(null), EntidadeDTO.class);
    }

    @Override
    public EntidadeDTO salvar(EntidadeDTO entidadeDTO) {

        Entidade entidade = entidadeRepository.save(ModelMapperUtil.convert(entidadeDTO, Entidade.class));

        return ModelMapperUtil.convert(entidadeRepository.save(entidade), EntidadeDTO.class);
    }

    @Override
    public EntidadeDTO deletar(Long codigoEntidade) {
        Entidade entidade = null;

        if (codigoEntidade != null) {
            entidade = entidadeRepository.findById(codigoEntidade).get();
        }

        entidadeRepository.delete(entidade);

        return ModelMapperUtil.convert(entidade, EntidadeDTO.class);
    }

}
