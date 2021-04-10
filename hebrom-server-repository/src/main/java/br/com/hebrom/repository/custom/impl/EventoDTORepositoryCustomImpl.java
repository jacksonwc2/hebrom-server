package br.com.hebrom.repository.custom.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.hebrom.generic.EventoRepositoryDTO;
import br.com.hebrom.repository.custom.EventoDTORepositoryCustom;

@Repository
@Transactional
public class EventoDTORepositoryCustomImpl implements EventoDTORepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<EventoRepositoryDTO> adquirirTodos(String pesquisa, Long categoria) {

        String query = "select evento.id_evento as id, evento.cd_categoria as categoria, evento.cd_entidade as entidade, evento.cd_localizacao as localizacao, to_char(dt_inicio, 'dd/MM/yyyy') as inicio, to_char(dt_final, 'dd/MM/yyyy') as final, evento.tx_titulo as titulo, evento.tx_descricao as descricao, evento.tx_banner as banner, entidade.tx_nomefantasia as descricaoentidade, categoria.tx_descricao as descricaocategoria, localizacao.tx_urimaps as urilocalizacao, localizacao.tx_descricao as descricaolocalizacao, localizacao.tx_observacao as obslocalizacao from tb_evento evento inner join tb_entidade entidade on cd_entidade = id_entidade inner join tb_categoria categoria on cd_categoria = id_categoria inner join tb_localizacao localizacao on evento.cd_localizacao = id_localizacao";

        if ((pesquisa != null && !pesquisa.isEmpty()) || categoria != null) {
            query += " where ";

            if ((pesquisa != null && !pesquisa.isEmpty())) {
                query += "lower(evento.tx_titulo) like '%" + pesquisa.toLowerCase() + "%'";

                if (categoria != null) {
                    query += " and ";
                }
            }

            if (categoria != null) {
                query += "id_categoria = " + categoria;
            }

        }

        return (List<EventoRepositoryDTO>) entityManager.createNativeQuery(query, EventoRepositoryDTO.class).getResultList();
    }

}