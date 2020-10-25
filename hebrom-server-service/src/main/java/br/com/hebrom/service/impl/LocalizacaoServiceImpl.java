package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Localizacao;
import br.com.hebrom.generic.LocalizacaoDTO;
import br.com.hebrom.repository.LocalizacaoRepository;
import br.com.hebrom.service.LocalizacaoService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class LocalizacaoServiceImpl implements LocalizacaoService {

    @Lazy
    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    @Override
    public List<LocalizacaoDTO> adquirirTodos() {
        return ModelMapperUtil.mapList(localizacaoRepository.findAll(), LocalizacaoDTO.class);
    }

    @Override
    public LocalizacaoDTO adquirirPorId(Long codigoLocalizacao) {
        return ModelMapperUtil.convert(localizacaoRepository.findById(codigoLocalizacao).orElse(null), LocalizacaoDTO.class);
    }

    @Override
    public LocalizacaoDTO salvar(LocalizacaoDTO localizacaoDTO) {

        Localizacao localizacao = new Localizacao();

        if (localizacaoDTO != null && localizacaoDTO.getId() != null) {
            localizacao = localizacaoRepository.findById(localizacaoDTO.getId()).get();
        }

        localizacao.setDescricao(localizacaoDTO.getDescricao());
        localizacao.setObservacao(localizacaoDTO.getObservacao());
        localizacao.setUriMaps(localizacaoDTO.getUriMaps());

        return ModelMapperUtil.convert(localizacaoRepository.save(localizacao), LocalizacaoDTO.class);
    }

    @Override
    public LocalizacaoDTO deletar(Long codigoLocalizacao) {
        Localizacao localizacao = null;

        if (codigoLocalizacao != null) {
            localizacao = localizacaoRepository.findById(codigoLocalizacao).get();
        }

        localizacaoRepository.delete(localizacao);

        return ModelMapperUtil.convert(localizacao, LocalizacaoDTO.class);
    }

}
