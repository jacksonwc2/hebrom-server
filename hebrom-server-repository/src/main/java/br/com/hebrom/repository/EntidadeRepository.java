package br.com.hebrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Entidade;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Long> {

}