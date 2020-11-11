package br.com.hebrom.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "tb_evento")
public class Evento {

    @Id
    @Column(name = "id_evento")
    @GeneratedValue(generator = "seq_evento")
    private Long id;

    @Column(name = "cd_categoria")
    private Long codigoCategoria;

    @Column(name = "cd_entidade")
    private Long codigoEntidade;

    @Column(name = "cd_localizacao")
    private Long codigoLocalizacao;

    @Column(name = "dt_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;

    @Column(name = "dt_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFinal;

    @Column(name = "tx_titulo")
    private String titulo;

    @Column(name = "tx_descricao")
    private String descricao;

    @Column(name = "tx_banner")
    private String banner;

}
