package br.com.hebrom.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "tb_documento")
public class Documento {

    @Id
    @Column(name = "id_documento")
    @GeneratedValue(generator = "seq_documento")
    private Long id;

    @Column(name = "cd_entidade")
    private Long codigoEntidade;

    @Column(name = "tx_documento")
    private String documento;

    @ManyToOne
    @JoinColumn(name = "id_entidade", insertable = false, updatable = false)
    private Entidade entidade;

}
