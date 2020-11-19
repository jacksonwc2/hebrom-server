package br.com.hebrom.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Component
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_acervofiles")
public class AcervoFiles {

    @Id
    @Column(name = "id_acervofiles")
    @GeneratedValue(generator = "seq_acervofiles")
    private Long id;

    @Column(name = "tx_url")
    private String url;

    @Column(name = "cd_acervo")
    private Long codigoAcervo;

}
