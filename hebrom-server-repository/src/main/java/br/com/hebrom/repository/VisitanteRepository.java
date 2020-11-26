package br.com.hebrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Visitante;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {

}