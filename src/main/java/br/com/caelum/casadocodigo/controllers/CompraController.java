package br.com.caelum.casadocodigo.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.caelum.casadocodigo.dao.CompraDao;
import br.com.caelum.casadocodigo.modelo.Compra;

public class CompraController {

	@Autowired
	private CompraDao compraDao;

	@ResponseBody
	@RequestMapping("/listarLivrosHib")
	public void registraCompra(@RequestBody String json) {
		
		ObjectMapper om = new ObjectMapper();
		Compra compra = null;
		
		try {
			compra = om.readValue(json, Compra.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		compraDao.registraCompra(compra);
	}

}
