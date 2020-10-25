package br.com.hebrom.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "tb_evento")
public class Usuario {

	@Id
	@Column(name = "id_evento")
	@GeneratedValue(generator = "seq_evento")
	private Long id;

	@Column(name = "cd_empresa")
	private Long codigoEmpresa;

	@Column(name = "cd_categoria")
	private Long codigoCategoria;

	@Column(name = "tx_titulo")
	private String titulo;

	@Column(name = "tx_descricao")
	private String descricao;

	@Column(name = "tx_localizacao")
	private String localizacao;

	@Column(name = "dt_evento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEvento;

	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Column(name = "tx_banner")
	private String banner;
	
}
