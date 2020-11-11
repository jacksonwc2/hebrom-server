package br.com.hebrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}