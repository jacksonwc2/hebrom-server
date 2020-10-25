package br.com.hebrom.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.CategoriaController;
import br.com.hebrom.generic.CategoriaDTO;
import br.com.hebrom.service.CategoriaService;

@RestController
public class CategoriaControllerImpl implements CategoriaController {

    @Lazy
    @Autowired
    private CategoriaService categoriaService;

    @Override
    public List<CategoriaDTO> adquirirTodos() {
        return categoriaService.adquirirTodos();
    }

    @Override
    public CategoriaDTO adquirirPorId(@PathVariable(value = "codigoCategoria", required = false) Long codigoCategoria) {
        return categoriaService.adquirirPorId(codigoCategoria);
    }

    @Override
    public CategoriaDTO salvar(@RequestBody CategoriaDTO CategoriaDTO) {
        return categoriaService.salvar(CategoriaDTO);
    }

    @Override
    public CategoriaDTO deletar(@PathVariable(value = "codigoCategoria", required = false) Long codigoCategoria) {
        return categoriaService.deletar(codigoCategoria);
    }

}
