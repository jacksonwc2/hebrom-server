package br.com.hebrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.generic.EventoRepositoryDTO;
import br.com.hebrom.repository.custom.EventoDTORepositoryCustom;

@Repository
public interface EventoDTORepository extends JpaRepository<EventoRepositoryDTO, Long>, EventoDTORepositoryCustom {

}