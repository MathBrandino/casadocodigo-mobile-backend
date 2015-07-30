package br.com.caelum.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.casadocodigo.dao.LivroDaoJPA;
import br.com.caelum.casadocodigo.modelo.Acervo;

@Controller
public class LivroControllerHibernate {
	
	@Autowired
	private LivroDaoJPA livroDaoJpa;

	@ResponseBody
	@RequestMapping("/listarLivrosHib")
	public Acervo listarLivros() {
		Acervo livros = new Acervo();
		livros.setLivros(livroDaoJpa.listarLivros());
		return livros;
	}
}
