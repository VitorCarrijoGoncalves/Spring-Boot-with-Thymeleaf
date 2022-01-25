package br.com.oab.votacaoCsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.oab.votacaoCsec.models.Sessao;
import br.com.oab.votacaoCsec.service.SessaoService;

@Controller
public class SessaoController {
	
	@Autowired
	SessaoService sessaoService;
	
	@RequestMapping(value = "/sessoes", method = RequestMethod.GET)
	public ModelAndView getSessoes() {
		ModelAndView mv = new ModelAndView("sessoes");
		List<Sessao> sessoes = sessaoService.findAll();
		mv.addObject("sessoes", sessoes);
		return mv;
	}
	
	@RequestMapping(value = "/sessoes/{id}", method = RequestMethod.GET)
	public ModelAndView getSessaoDetails (@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("sessaoDetails");
		Sessao sessao = sessaoService.findById(id);
		mv.addObject("sessao", sessao);
		return mv;
	}
}
