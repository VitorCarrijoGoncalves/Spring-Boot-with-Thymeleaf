package br.com.oab.votacaoCsec.service;

import java.util.List;

import br.com.oab.votacaoCsec.models.Eleitor;

public interface EleitorService {
	
	List<Eleitor> findAll();
	
	Eleitor findById (long id);
	
	Eleitor save (Eleitor eleitor);

}
