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
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(generator = "seq_usuario")
    private Long id;

    @Column(name = "tx_login")
    private String login;

    @Column(name = "tx_senha")
    private String senha;

    @Column(name = "fl_editar")
    private Boolean flagEditar;

    @Column(name = "fl_excluir")
    private Boolean flagExcluir;

    @Column(name = "fl_cadastrar")
    private Boolean flagCadastrar;

}
