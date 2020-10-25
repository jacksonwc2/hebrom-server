package br.com.hebrom.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "tb_empresa")
public class Empresa {

	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(generator = "seq_empresa")
	private Long id;

	@Column(name = "tx_nome")
	private String nome;
}
