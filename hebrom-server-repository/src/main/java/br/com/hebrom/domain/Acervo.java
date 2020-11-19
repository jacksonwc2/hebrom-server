package br.com.hebrom.domain;

import java.util.Date;

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
@Table(name = "tb_acervo")
public class Acervo {

    @Id
    @Column(name = "id_acervo")
    @GeneratedValue(generator = "seq_acervo")
    private Long id;

    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "tx_descricao")
    private String descricao;

    @Column(name = "cd_categoria")
    private String codigoCategoria;

    @Column(name = "cd_espaco")
    private String codigoEspaco;

    @Column(name = "fl_ativo")
    private Boolean flagAtivo;

    @Column(name = "cd_acervostatus")
    private String codigoAcervoStatus;

    @Column(name = "dt_cadastro")
    private Date dataCadastro;

}
