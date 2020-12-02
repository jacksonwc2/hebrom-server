package br.com.hebrom.generic;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String login;

    private String senha;

    private Boolean flagEditar;

    private Boolean flagExcluir;

    private Boolean flagCadastrar;

}