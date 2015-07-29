package br.com.caelum.casadocodigo.controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.casadocodigo.dao.ConnectionFactory;
import br.com.caelum.casadocodigo.dao.LivroDao;
import br.com.caelum.casadocodigo.modelo.Livro;

@Controller
public class LivroController {

	@ResponseBody
	@RequestMapping("/listarLivros")
	public List<Livro> listarLivros() {
		
		List<Livro> livros = null;
		try(Connection connection = new ConnectionFactory().getConnection()) {
			livros = new LivroDao(connection).listarLivros();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return livros;
	}
}
