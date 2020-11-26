package br.com.hebrom.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hebrom.api.AcervoController;
import br.com.hebrom.generic.AcervoDTO;
import br.com.hebrom.service.AcervoService;

@RestController
public class AcervoControllerImpl implements AcervoController {

    @Lazy
    @Autowired
    private AcervoService entidadeService;

    @Override
    public List<AcervoDTO> adquirirTodos(@Param("codigoCategoria") Long codigoCategoria, @Param("codigoEspaco") Long codigoEspaco,
            @Param("nome") String nome) {
        return entidadeService.adquirirTodos(codigoCategoria, codigoEspaco, nome);
    }

    @Override
    public AcervoDTO adquirirPorId(@PathVariable(value = "codigoEntidade", required = false) Long codigoEntidade) {
        return entidadeService.adquirirPorId(codigoEntidade);
    }

    @Override
    public AcervoDTO salvar(@RequestBody AcervoDTO entidadeDTO) {
        return entidadeService.salvar(entidadeDTO);
    }

    @Override
    public AcervoDTO deletar(@PathVariable(value = "codigoEntidade", required = false) Long codigoEntidade) {
        return entidadeService.deletar(codigoEntidade);
    }

}
