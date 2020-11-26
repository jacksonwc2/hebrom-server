package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.AcervoDTO;

public interface AcervoService {

    public List<AcervoDTO> adquirirTodos(Long codigoCategoria, Long codigoEspaco, String nome);

    public AcervoDTO adquirirPorId(Long codigoEntidade);

    public AcervoDTO salvar(AcervoDTO entidadeDTO);

    public AcervoDTO deletar(Long codigoEntidade);
}
