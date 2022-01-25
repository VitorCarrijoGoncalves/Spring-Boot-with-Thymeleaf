package br.com.oab.votacaoCsec.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Sessao")
public class Sessao {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String pauta;
	
	@NotNull
	private String tema;
	
	@NotNull
	private Long numeroProcesso;

	@NotNull
	private String camara;
	
	@NotNull
	private String tipoPartes;
	
	@NotNull
	private String relatorConselheiro;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataSessao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPauta() {
		return pauta;
	}

	public void setPauta(String pauta) {
		this.pauta = pauta;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Long getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(Long numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getTipoPartes() {
		return tipoPartes;
	}

	public void setTipoPartes(String tipoPartes) {
		this.tipoPartes = tipoPartes;
	}

	public String getRelatorConselheiro() {
		return relatorConselheiro;
	}

	public void setRelatorConselheiro(String relatorConselheiro) {
		this.relatorConselheiro = relatorConselheiro;
	}

	public LocalDate getDataSessao() {
		return dataSessao;
	}

	public void setDataSessao(LocalDate dataSessao) {
		this.dataSessao = dataSessao;
	}

}
