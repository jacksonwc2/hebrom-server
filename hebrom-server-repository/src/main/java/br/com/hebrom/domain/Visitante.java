package br.com.hebrom.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "tb_visitante")
public class Visitante {

    @Id
    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "tx_idade")
    private String idade;

    @Column(name = "tx_telefone")
    private String telefone;

    @Column(name = "tx_email")
    private String email;
}
