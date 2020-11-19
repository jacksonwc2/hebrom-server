package br.com.hebrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hebrom.domain.Espaco;

@Repository
public interface EspacoRepository extends JpaRepository<Espaco, Long> {

}