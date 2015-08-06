package br.com.caelum.casadocodigo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.casadocodigo.dao.CompraDao;
import br.com.caelum.casadocodigo.modelo.Compra;
import br.com.caelum.casadocodigo.modelo.Usuario;

@Controller
public class CompraController {

	@Autowired
	private CompraDao dao;

	@ResponseBody
	@RequestMapping(
			value = "/registrarCompra", 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void registraCompra(@RequestBody Compra compra) {
		System.out.println("passou aqui1");
		System.out.println(compra.getItens().get(0).getId());
		dao.registraCompra(compra);
		
	}
	
	@ResponseBody
	@RequestMapping(
			value="/listarCompras",
			method= RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Compra> listaCompras(Usuario usuario) {
		List<Compra> compras = dao.listaCompras(usuario);
		return compras;
	}
}
