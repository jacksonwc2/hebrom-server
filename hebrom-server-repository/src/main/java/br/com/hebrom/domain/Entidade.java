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
@Table(name = "tb_entidade")
public class Entidade {

	@Id
	@Column(name = "id_entidade")
	@GeneratedValue(generator = "seq_entidade")
	private Long id;

	@Column(name = "tx_nomefantasia")
	private String nomeFantasia;
	
	@Column(name = "tx_razaosocial")
	private String razaoSocial;
	
}
