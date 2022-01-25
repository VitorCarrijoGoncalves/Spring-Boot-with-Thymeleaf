package br.com.oab.votacaoCsec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oab.votacaoCsec.models.Eleitor;

public interface EleitorRepository extends JpaRepository<Eleitor, Long> {

}
