package br.com.hebrom.generic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EventoRepositoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "categoria")
    private Long codigoCategoria;

    @Column(name = "entidade")
    private Long codigoEntidade;

    @Column(name = "localizacao")
    private Long codigoLocalizacao;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "banner")
    private String banner;

    @Column(name = "descricaoentidade")
    private String descricaoEntidade;

    @Column(name = "descricaocategoria")
    private String descricaoCategoria;

    @Column(name = "urilocalizacao")
    private String uriLocalizacao;

    @Column(name = "descricaolocalizacao")
    private String descricaoLocalizacao;

    @Column(name = "obslocalizacao")
    private String obsLocalizacao;

    @Column(name = "inicio")
    private String dataInicio;

    @Column(name = "final")
    private String dataFinal;

}