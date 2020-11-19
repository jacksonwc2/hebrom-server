package br.com.hebrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Acervo;

@Repository
public interface AcervoRepository extends JpaRepository<Acervo, Long> {

}