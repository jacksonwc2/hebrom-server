package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Categoria;
import br.com.hebrom.generic.CategoriaDTO;
import br.com.hebrom.repository.CategoriaRepository;
import br.com.hebrom.service.CategoriaService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Lazy
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDTO> adquirirTodos() {
        return ModelMapperUtil.mapList(categoriaRepository.findAll(), CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO adquirirPorId(Long codigoCategoria) {
        return ModelMapperUtil.convert(categoriaRepository.findById(codigoCategoria).orElse(null), CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO salvar(CategoriaDTO categoriaDTO) {

        Categoria categoria = new Categoria();

        if (categoriaDTO != null && categoriaDTO.getId() != null) {
            categoria = categoriaRepository.findById(categoriaDTO.getId()).get();
        }

        categoria.setDescricao(categoriaDTO.getDescricao());
        categoria.setObservacao(categoriaDTO.getObservacao());

        return ModelMapperUtil.convert(categoriaRepository.save(categoria), CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO deletar(Long codigoCategoria) {
        Categoria categoria = null;

        if (codigoCategoria != null) {
            categoria = categoriaRepository.findById(codigoCategoria).get();
        }

        categoriaRepository.delete(categoria);

        return ModelMapperUtil.convert(categoria, CategoriaDTO.class);
    }

}
