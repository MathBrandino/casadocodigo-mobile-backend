package br.com.caelum.casadocodigo.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.caelum.casadocodigo.dao.LivroDaoJPA;
import br.com.caelum.casadocodigo.modelo.Acervo;

@Controller
public class LivroControllerHibernate {
	
	@Autowired
	private LivroDaoJPA livroDaoJpa;

	@ResponseBody
	@RequestMapping("/listarLivrosHib")
	public Acervo listaLivros(int indicePrimeiroLivro, int qtdLivros, HttpServletResponse resp) {
		ObjectMapper om = new ObjectMapper();
		Acervo acervo = new Acervo();
		acervo.setLivros(livroDaoJpa.listarLivros(indicePrimeiroLivro, qtdLivros));
		return acervo;
	}
}
