package br.com.hebrom.retrieve;

import java.io.Serializable;

import lombok.Data;

@Data
public class AutenticacaoRetrieveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    private String token;

}