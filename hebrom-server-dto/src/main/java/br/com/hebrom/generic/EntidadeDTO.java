package br.com.hebrom.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EntidadeDTO {

    private Long id;

    private String nomeFantasia;

    private String razaoSocial;

}
