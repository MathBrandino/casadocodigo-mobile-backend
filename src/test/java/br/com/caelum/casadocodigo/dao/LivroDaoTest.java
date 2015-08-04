package br.com.caelum.casadocodigo.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LivroDaoTest {

	private LivroDao dao;
	
	@Autowired
	public LivroDaoTest(LivroDao dao) {
		this.dao = dao;
	}

	@Test
	public void deveListarLivrosConformeOBanco() {
		
	}
}
