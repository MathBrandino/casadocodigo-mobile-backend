package br.com.caelum.casadocodigo.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.casadocodigo.modelo.Acervo;
import br.com.caelum.casadocodigo.modelo.Autor;
import br.com.caelum.casadocodigo.modelo.Livro;

public class LivroDaoTest {

	@Test
	public void deveRetornarListaComLivroCadastrado() {

		Acervo acervoEsperado = new Acervo();
		Livro livro = new Livro();
		Autor autor = new Autor();

		livro.setId(1);
		livro.setNomeLivro("Jogos Android: Crie um game do zero usando classes nativas");
		livro.setDescricaoLivro("195, 300, 800 milhões de dólares!!! Essas são as cifras por trás dos jogos Angry Birds, Candy Crush e Clash of Clans. Quer pensar em cifras menores? Que tal 120 mil reais por dia? Foi o que Flappy Bird chegou a faturar. Pois é, já pensou em trabalhar com algo criativo, divertido e recompensador? Desenvolver jogos pode ser assim.   Neste livro, Felipe Torres mostra como criar um jogo do zero sem usar frameworks e discute as vantagens e desvantagens dessa abordagem usada pelo criador de Flappy Bird. Usando a linguagem Java, você vai desenvolver um jogo para Android e entender de fato como funciona a criação de jogos através da óptica do desenvolvedor e terá mais confiança e informação para decidir os caminhos do que esperamos. Seja o novo jogo viral do mercado!");
		Calendar dataPublicacao = Calendar.getInstance();
		try {
			Date parse = new SimpleDateFormat("yyyy/MM/dd").parse("2015/07/04");
			dataPublicacao.setTime(parse);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		livro.setDataPublicacao(dataPublicacao);
		livro.setNumeroPaginas(96);
		livro.setValorFisico(new BigDecimal("59.90"));
		livro.setValorVirtual(new BigDecimal("39.90"));
		livro.setValorVirtualComFisico(new BigDecimal("79.90"));
		livro.setIsbn("978-85-5519-013-1");
		livro.setImagemUrl("http://cdn.shopify.com/s/files/1/0155/7645/products/games-android-miniature.png");

		autor.setIdAutor(1);
		autor.setNomeAutor("Felipe Torres");
		autor.setDetalhesAutor("Felipe Torres é Bacharel em Ciência da Computação pelo IME-USP e atua como instrutor e desenvolvedor Android há mais de 5 anos na Caelum. Apaixonado por programação de jogos, criou sua versão de Carmen Sandiego, que teve mais de 100.000 downloads no Google Play Store. Além disso, participa ativamente de diversas comunidades como o GUJ, onde foca no ensino e solução de dúvidas e o Android Open Source Project, com contribuições no código-fonte do sistema Android.");
		autor.setImagemAutor("http://cdn.shopify.com/s/files/1/0155/7645/files/felipe-torres_medium.png");
		livro.addAutor(autor);
		acervoEsperado.addLivro(livro);

		try {
			Connection connection = new ConnectionFactory().getConnection();
			Acervo acervoAtual = new Acervo(); 
			acervoAtual.setLivros(new LivroDao(connection)
					.listarLivros());
			
			devemSerAcervosIguais(acervoEsperado, acervoAtual);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void devemSerAcervosIguais(Acervo acervoEsperado, Acervo acervoAtual) {

		assertEquals(acervoEsperado.getLivros().size(), acervoAtual.getLivros().size());
		for (int indice = 0; indice < acervoAtual.getLivros().size(); indice++) {
			devemSerLivrosIguais(acervoEsperado.getLivros().get(indice),
					acervoAtual.getLivros().get(indice));
		}
	}

	private void devemSerLivrosIguais(Livro livroEsperado, Livro livroAtual) {
		assertEquals(livroEsperado.getId(), livroAtual.getId());
		assertEquals(livroEsperado.getNomeLivro(), livroAtual.getNomeLivro());
		assertEquals(livroEsperado.getDescricaoLivro(),
				livroAtual.getDescricaoLivro());
		assertEquals(livroEsperado.getDataPublicacao(),
				livroAtual.getDataPublicacao());
		assertEquals(livroEsperado.getNumeroPaginas(),
				livroAtual.getNumeroPaginas());
		assertEquals(livroEsperado.getValorFisico(),
				livroAtual.getValorFisico());
		assertEquals(livroEsperado.getValorVirtual(),
				livroAtual.getValorVirtual());
		assertEquals(livroEsperado.getValorVirtualComFisico(),
				livroAtual.getValorVirtualComFisico());
		assertEquals(livroEsperado.getIsbn(), livroAtual.getIsbn());
		assertEquals(livroEsperado.getImagemUrl(), livroAtual.getImagemUrl());

		devemSerListasDeAutoresIguais(livroEsperado.getAutores(),
				livroAtual.getAutores());
	}

	private void devemSerListasDeAutoresIguais(List<Autor> autoresEsperados,
			List<Autor> autoresAtuais) {
		assertEquals(autoresEsperados.size(), autoresAtuais.size());
		for (int indice = 0; indice < autoresEsperados.size(); indice++) {
			devemSerAutoresIguais(autoresEsperados.get(indice),
					autoresAtuais.get(indice));
		}
	}

	private void devemSerAutoresIguais(Autor autorEsperado, Autor autorAtual) {
		assertEquals(autorEsperado.getIdAutor(), autorAtual.getIdAutor());
		assertEquals(autorEsperado.getNomeAutor(), autorAtual.getNomeAutor());
		assertEquals(autorEsperado.getDetalhesAutor(),
				autorAtual.getDetalhesAutor());
		assertEquals(autorEsperado.getImagemAutor(),
				autorAtual.getImagemAutor());
	}
}
