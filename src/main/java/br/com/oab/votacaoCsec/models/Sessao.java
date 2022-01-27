package br.com.oab.votacaoCsec.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Sessao")
public class Sessao {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;
	
	@NotNull
	@Getter
	@Setter
	private String pauta;
	
	@NotNull
	@Getter
	@Setter
	private String tema;
	
	@NotNull
	@Getter
	@Setter
	private Long numeroProcesso;

	@NotNull
	@Getter
	@Setter
	private String camara;
	
	@NotNull
	@Getter
	@Setter
	private String tipoPartes;
	
	@NotNull
	@Getter
	@Setter
	private String relatorConselheiro;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Getter
	@Setter
	private LocalDate dataSessao;

}
