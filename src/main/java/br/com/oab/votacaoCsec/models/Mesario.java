package br.com.oab.votacaoCsec.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Mesario")
public class Mesario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;

	@NotNull
	@Getter
	@Setter
	private String nome;

	@NotNull
	@Getter
	@Setter
	private String login;

	@NotNull
	@Getter
	@Setter
	private String senha;

}
