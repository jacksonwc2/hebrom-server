package br.com.hebrom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Espaco;
import br.com.hebrom.generic.CategoriaDTO;
import br.com.hebrom.repository.EspacoRepository;
import br.com.hebrom.service.EspacoService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class EspacoServiceImpl implements EspacoService {

    @Lazy
    @Autowired
    private EspacoRepository categoriaRepository;

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

        Espaco categoria = new Espaco();

        if (categoriaDTO != null && categoriaDTO.getId() != null) {
            categoria = categoriaRepository.findById(categoriaDTO.getId()).get();
        }

        categoria.setDescricao(categoriaDTO.getDescricao());

        return ModelMapperUtil.convert(categoriaRepository.save(categoria), CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO deletar(Long codigoCategoria) {
        Espaco categoria = null;

        if (codigoCategoria != null) {
            categoria = categoriaRepository.findById(codigoCategoria).get();
        }

        categoriaRepository.delete(categoria);

        return ModelMapperUtil.convert(categoria, CategoriaDTO.class);
    }

}
