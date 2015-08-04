package br.com.caelum.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.casadocodigo.dao.LivroDao;
import br.com.caelum.casadocodigo.modelo.Acervo;

@Controller
public class LivroController {
	
	@Autowired
	private LivroDao dao;

	@ResponseBody
	@RequestMapping(
			value = "/listarLivros",
			method = RequestMethod.GET)
	public Acervo listaLivros(int indicePrimeiroLivro, int qtdLivros) {
		Acervo acervo = new Acervo();
		acervo.setLivros(dao.listarLivros(indicePrimeiroLivro, qtdLivros));
		return acervo;
	}
}
