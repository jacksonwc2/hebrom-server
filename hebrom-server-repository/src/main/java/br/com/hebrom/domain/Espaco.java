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
@Table(name = "tb_espaco")
public class Espaco {

    @Id
    @Column(name = "id_espaco")
    @GeneratedValue(generator = "seq_espaco")
    private Long id;

    @Column(name = "tx_descricao")
    private String descricao;
}
