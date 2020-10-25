package br.com.hebrom.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "tb_localizacao")
public class Localizacao {

    @Id
    @Column(name = "id_localizacao")
    @GeneratedValue(generator = "seq_localizacao")
    private Long id;

    @Column(name = "tx_descricao")
    private String descricao;

    @Column(name = "tx_observacao")
    private String observacao;

    @Column(name = "tx_urimaps")
    private String uriMaps;

}
