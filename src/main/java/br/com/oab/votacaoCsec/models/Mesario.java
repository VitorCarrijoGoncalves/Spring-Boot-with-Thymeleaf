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
	
	@Getter
	@Setter
	@NotNull
	private String nome;
	
	@Getter
	@Setter
	@NotNull
	private String login;
	
	@Getter
	@Setter
	@NotNull
	private String senha;

}
