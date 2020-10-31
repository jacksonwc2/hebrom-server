package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.EntidadeDTO;

public interface EntidadeService {

    public List<EntidadeDTO> adquirirTodos();

    public EntidadeDTO adquirirPorId(Long codigoEntidade);

    public EntidadeDTO salvar(EntidadeDTO entidadeDTO);

    public EntidadeDTO deletar(Long codigoEntidade);
}
