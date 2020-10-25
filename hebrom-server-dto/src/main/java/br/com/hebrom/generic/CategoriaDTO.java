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
public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String descricao;

    private String observacao;
}