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
public class EventoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long codigoCategoria;

    private Long codigoEntidade;

    private Long codigoLocalizacao;

    private String dataInicio;

    private String dataFinal;

    private String titulo;

    private String descricao;

    private String banner;

    private String descricaoEntidade;

    private String descricaoCategoria;

    private String uriLocalizacao;

    private String descricaoLocalizacao;

    private String obsLocalizacao;

}