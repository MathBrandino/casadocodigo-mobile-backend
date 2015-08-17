package br.com.caelum.casadocodigo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.caelum.casadocodigo.resources.EntryPoint;

@Controller
@RequestMapping("/")
public class EntryPointResourceController {

	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE )
	public HttpEntity<EntryPoint> options(HttpServletRequest req) {
		
		String url = req.getRequestURL().toString();
		Link listarLivros = new Link(url + "livros", "listarLivros");
		Link listarCompras = new Link(url + "compras", "listarCompras");
		Link registrarCompras = new Link(url + "compras", "registrarCompras");
		
		EntryPoint resource = new EntryPoint();
		resource.add(listarLivros);
		resource.add(listarCompras);
		resource.add(registrarCompras);
		
		return new HttpEntity<EntryPoint>(resource);
	}
}
