package br.com.hebrom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hebrom.generic.EventoRepositoryDTO;

@Repository
public interface EventoDTORepository extends JpaRepository<EventoRepositoryDTO, Long> {

    @Query(value = "select id_evento as \"id\", tb_evento.cd_categoria as \"categoria\", tb_evento.cd_entidade as \"entidade\", tb_evento.cd_localizacao as \"localizacao\", to_char(dt_inicio, 'dd/MM/yyyy') as \"inicio\", to_char(dt_final, 'dd/MM/yyyy') as \"final\", tx_titulo as \"titulo\", tx_descricao as \"descricao\", tx_banner as \"banner\", tb_entidade.tx_nomefantasia as \"descricaoentidade\" from tb_evento inner join tb_entidade on cd_entidade = id_entidade;", nativeQuery = true)
    public List<EventoRepositoryDTO> adquirirTodos();

}