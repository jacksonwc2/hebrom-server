package br.com.hebrom.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.hebrom.domain.Acervo;
import br.com.hebrom.domain.AcervoFiles;
import br.com.hebrom.generic.AcervoDTO;
import br.com.hebrom.repository.AcervoFilesRepository;
import br.com.hebrom.repository.AcervoRepository;
import br.com.hebrom.service.AcervoService;
import br.com.hebrom.util.ModelMapperUtil;

@Service
public class AcervoServiceImpl implements AcervoService {

    @Lazy
    @Autowired
    private AcervoRepository entidadeRepository;

    @Lazy
    @Autowired
    private AcervoFilesRepository acervoFilesRepository;

    @Override
    public List<AcervoDTO> adquirirTodos() {
        List<AcervoDTO> ret = ModelMapperUtil.mapList(entidadeRepository.findAll(), AcervoDTO.class);
        ret.forEach(
                x -> x.setFiles(acervoFilesRepository.getAllByCodigoAcervo(x.getId()).stream().map(y -> y.getUrl()).collect(Collectors.toList())));

        return ret;
    }

    @Override
    public AcervoDTO adquirirPorId(Long codigoEntidade) {
        AcervoDTO ret = ModelMapperUtil.convert(entidadeRepository.findById(codigoEntidade).orElse(null), AcervoDTO.class);
        ret.setFiles(acervoFilesRepository.getAllByCodigoAcervo(ret.getId()).stream().map(y -> y.getUrl()).collect(Collectors.toList()));

        return ret;
    }

    @Override
    public AcervoDTO salvar(AcervoDTO entidadeDTO) {

        Acervo entidade = entidadeRepository.save(ModelMapperUtil.convert(entidadeDTO, Acervo.class));

        if (entidadeDTO.getId() != null) {
            List<AcervoFiles> files = acervoFilesRepository.getAllByCodigoAcervo(entidadeDTO.getId());

            files.stream().filter(x -> !entidadeDTO.getFiles().contains(x.getUrl())).forEach(y -> acervoFilesRepository.delete(y));
            entidadeDTO.getFiles().removeIf(x -> entidadeDTO.getFiles().contains(x));
        }

        entidadeDTO.getFiles().forEach(x -> acervoFilesRepository.save(new AcervoFiles(null, x, entidade.getId())));

        return ModelMapperUtil.convert(entidadeRepository.save(entidade), AcervoDTO.class);
    }

    @Override
    public AcervoDTO deletar(Long codigoEntidade) {
        Acervo entidade = null;

        if (codigoEntidade != null) {
            entidade = entidadeRepository.findById(codigoEntidade).get();
        }

        acervoFilesRepository.deleteAllByCodigoAcervo(codigoEntidade);
        entidadeRepository.delete(entidade);

        return ModelMapperUtil.convert(entidade, AcervoDTO.class);
    }

}
