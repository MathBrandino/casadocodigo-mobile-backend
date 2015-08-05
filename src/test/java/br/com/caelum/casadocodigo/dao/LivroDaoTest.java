package br.com.caelum.casadocodigo.dao;

import org.springframework.

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.caelum.casadocodigo.modelo.Livro;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/simple-job-launcher-context.xml",
                                    "/jobs/skipSampleJob.xml" })
public class LivroDaoTest {

	private LivroDao dao;
	
	@Test
	public void naoDeveListarLivrosConformeOBanco() {
		
		dao = new LivroDao();
		
		List<Livro> listaDeLivrosDoBanco = dao.listarLivros(0, 2);
		List<Livro> listaEsperada = new ArrayList<Livro>();
		Assert.assertEquals(listaEsperada, listaDeLivrosDoBanco);
	}
}
