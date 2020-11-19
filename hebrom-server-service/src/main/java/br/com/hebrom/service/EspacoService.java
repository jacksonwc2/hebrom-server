package br.com.hebrom.service;

import java.util.List;

import br.com.hebrom.generic.CategoriaDTO;

public interface EspacoService {

    public List<CategoriaDTO> adquirirTodos();

    public CategoriaDTO adquirirPorId(Long codigoCategoria);

    public CategoriaDTO salvar(CategoriaDTO categoriaDTO);

    public CategoriaDTO deletar(Long codigoCategoria);
}
