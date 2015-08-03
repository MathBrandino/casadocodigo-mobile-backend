package br.com.caelum.casadocodigo.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.casadocodigo.dao.CompraDao;
import br.com.caelum.casadocodigo.modelo.Compra;
import br.com.caelum.casadocodigo.modelo.Usuario;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class CompraController {

	@Autowired
	private CompraDao dao;

	@ResponseBody
	@RequestMapping(
			name="/registrarCompra", 
			method=RequestMethod.POST, 
			headers="Accept=application/json")
	public void registraCompra(@RequestBody String json) {
		
		ObjectMapper om = new ObjectMapper();
		Compra compra = null;
		
		try {
			compra = om.readValue(json, Compra.class);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		dao.registraCompra(compra);
	}
	
	@ResponseBody
	@RequestMapping("/listarCompras")
	public List<Compra> listaCompras(Usuario usuario) {
		
		List<Compra> compras = dao.listaCompras(usuario);
		return compras;
	}
}
