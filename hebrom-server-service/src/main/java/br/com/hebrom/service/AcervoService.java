package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.AcervoDTO;

public interface AcervoService {

    public List<AcervoDTO> adquirirTodos();

    public AcervoDTO adquirirPorId(Long codigoEntidade);

    public AcervoDTO salvar(AcervoDTO entidadeDTO);

    public AcervoDTO deletar(Long codigoEntidade);
}
