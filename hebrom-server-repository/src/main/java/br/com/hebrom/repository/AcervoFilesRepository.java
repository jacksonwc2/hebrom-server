package br.com.hebrom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.AcervoFiles;

@Repository
public interface AcervoFilesRepository extends JpaRepository<AcervoFiles, Long> {

    List<AcervoFiles> getAllByCodigoAcervo(Long codigoAcervo);

    void deleteAllByCodigoAcervo(Long codigoAcervo);
}