package br.com.caelum.casadocodigo.dao;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonParser;

import br.com.caelum.casadocodigo.conf.AppWebConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = AppWebConfiguration.class)
public class CompraControllerTest {

	private MockMvc mock;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setUp() {
		mock = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void deveCadastrarCompraRecebidaComoJSON() throws Exception {
		
		String json = "{\"itens\":[{\"livro\":{\"id\":1},\"formatoLivro\":\"FISICO\"},{\"livro\":{\"id\":2},\"formatoLivro\":\"VIRTUAL\"}],\"usuario\":\"casalmeid@gmail.com\"}";
		
		ResultActions result = mock
				.perform(post("/registrarCompra")
						.content(json.getBytes())
						.contentType(MediaType.APPLICATION_JSON_VALUE));
		result.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
//	@Test
//	public void deveListarComprasJaEfetuadasDoUsuario() throws Exception {
//
//		ResultActions result = mock
//				.perform(get("/listarCompras")
//						.param("email", "rafael.rollo@caelum.com.br")
//						.contentType(MediaType.APPLICATION_JSON_VALUE));
//		result.andExpect(MockMvcResultMatchers.status().isOk());
//		System.out.println(result.andReturn().getResponse().getContentAsString());
//	}


	
}
