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
public class DocumentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String documento;

}