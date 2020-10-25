package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.LocalizacaoDTO;

public interface LocalizacaoService {

    public List<LocalizacaoDTO> adquirirTodos();

    public LocalizacaoDTO adquirirPorId(Long codigoLocalizacao);

    public LocalizacaoDTO salvar(LocalizacaoDTO localizacaoDTO);

    public LocalizacaoDTO deletar(Long codigoLocalizacao);
}
