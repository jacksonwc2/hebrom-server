package br.com.hebrom.repository.custom.impl;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<EventoRepositoryDTO> adquirirTodos(String pesquisa, Long categoria, List<Long> entidades, List<Long> localizacoes, String dataInicio,
            String dataFim) {

        String query = "select evento.id_evento as id, evento.cd_categoria as categoria, evento.cd_entidade as entidade, evento.cd_localizacao as localizacao, to_char(dt_inicio, 'dd/MM/yyyy') as inicio, to_char(dt_final, 'dd/MM/yyyy') as final, evento.tx_titulo as titulo, evento.tx_descricao as descricao, evento.tx_banner as banner, entidade.tx_nomefantasia as descricaoentidade, categoria.tx_descricao as descricaocategoria, localizacao.tx_urimaps as urilocalizacao, localizacao.tx_descricao as descricaolocalizacao, localizacao.tx_observacao as obslocalizacao from tb_evento evento inner join tb_entidade entidade on cd_entidade = id_entidade inner join tb_categoria categoria on cd_categoria = id_categoria inner join tb_localizacao localizacao on evento.cd_localizacao = id_localizacao";

        String where = "";

        if (pesquisa != null && !pesquisa.isEmpty()) {
            where += addWhere("lower(evento.tx_titulo) like '%" + pesquisa.toLowerCase() + "%'", where);
        }

        if (categoria != null) {
            where += addWhere("id_categoria = " + categoria, where);
        }

        if (dataInicio != null) {
            where += addWhere("dt_inicio >= '" + dataInicio + "'", where);
        }

        if (dataFim != null) {
            where += addWhere("dt_final <= '" + dataFim + "'", where);
        }

        if (entidades != null && !entidades.isEmpty()) {
            where += addWhere("evento.cd_entidade in ( " + entidades.stream().map(Object::toString).collect(Collectors.joining(",")) + ")", where);
        }

        if (localizacoes != null && !localizacoes.isEmpty()) {
            where += addWhere("evento.cd_localizacao in ( " + localizacoes.stream().map(Object::toString).collect(Collectors.joining(",")) + ")",
                    where);
        }

        return (List<EventoRepositoryDTO>) entityManager.createNativeQuery(query + where, EventoRepositoryDTO.class).getResultList();
    }

    private String addWhere(String condicao, String whereAtual) {
        return (whereAtual != null && !whereAtual.isEmpty() ? " AND " : " WHERE ") + condicao;
    }

}