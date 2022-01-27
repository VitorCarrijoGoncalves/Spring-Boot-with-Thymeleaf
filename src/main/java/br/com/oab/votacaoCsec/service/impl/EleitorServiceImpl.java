package br.com.oab.votacaoCsec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.oab.votacaoCsec.models.Eleitor;
import br.com.oab.votacaoCsec.repository.EleitorRepository;
import br.com.oab.votacaoCsec.service.EleitorService;

public class EleitorServiceImpl implements EleitorService {

	@Autowired
	EleitorRepository eleitorRepository;

	@Override
	public List<Eleitor> findAll() {
		return eleitorRepository.findAll();
	}

	@Override
	public Eleitor findById(long id) {
		return eleitorRepository.findById(id).get();
	}

	@Override
	public Eleitor save(Eleitor eleitor) {
		return eleitorRepository.save(eleitor);
	}

}
