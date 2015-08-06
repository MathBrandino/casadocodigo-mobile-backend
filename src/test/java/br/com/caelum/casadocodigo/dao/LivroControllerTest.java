package br.com.caelum.casadocodigo.dao;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.caelum.casadocodigo.conf.AppWebConfiguration;
import br.com.caelum.casadocodigo.conf.DataSourceConfigurationTest;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppWebConfiguration.class, DataSourceConfigurationTest.class})
@ActiveProfiles("test")
public class LivroControllerTest {

	private MockMvc mock;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setUp() {
		mock = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void deveListarLivrosEmJSON() throws Exception {

		ResultActions result = mock
				.perform(get("/listarLivros")
						.param("indicePrimeiroLivro", "0")
						.param("qtdLivros", "1")
						.contentType(MediaType.APPLICATION_JSON_VALUE));
		result.andExpect(status().isOk());
		System.out.println(result.andReturn().getResponse(). getContentAsString());
	}
	
}
