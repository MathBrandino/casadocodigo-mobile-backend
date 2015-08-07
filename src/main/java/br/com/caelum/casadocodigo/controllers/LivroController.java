package br.com.caelum.casadocodigo.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Acervo> listaLivros(int indicePrimeiroLivro, int qtdLivros, HttpServletResponse res) {
		
		Acervo acervo = new Acervo();
		acervo.setLivros(dao.listarLivros(indicePrimeiroLivro, qtdLivros));
		
		return new ResponseEntity<Acervo>(acervo, HttpStatus.OK);
	}
}
