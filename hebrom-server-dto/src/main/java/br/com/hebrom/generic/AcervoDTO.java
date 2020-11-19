package br.com.hebrom.generic;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcervoDTO {

    private Long id;

    private String nome;

    private String descricao;

    private String codigoCategoria;

    private String codigoEspaco;

    private Boolean flagAtivo;

    private String codigoAcervoStatus;

    private Date dataCadastro;

    private List<String> files;

}
