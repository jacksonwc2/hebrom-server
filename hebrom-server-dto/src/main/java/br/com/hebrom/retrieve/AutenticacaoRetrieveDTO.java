package br.com.hebrom.retrieve;

import java.io.Serializable;

import lombok.Data;

@Data
public class AutenticacaoRetrieveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String login;

    private String senha;

}