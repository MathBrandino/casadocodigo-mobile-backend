package br.com.caelum.casadocodigo.builders;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.caelum.casadocodigo.modelo.Autor;
import br.com.caelum.casadocodigo.modelo.Livro;

public class LivroBuilder {

	Livro livro;

	public LivroBuilder novoLivro() {
		this.livro = new Livro();
		return this;
	}

	public Livro constroiLivro() {
		return this.livro;
	}

	public LivroBuilder setId(int id) {
		livro.setId(id);
		return this;
	}

	public LivroBuilder setTitulo(String titulo) {
		this.livro.setTitulo(titulo);
		return this;
	}

	public LivroBuilder setDescricao(String descricao) {
		this.livro.setDescricao(descricao);
		return this;
	}

	public LivroBuilder setDataPublicacao(String dataPublicacao) {
		Calendar data = Calendar.getInstance();
		try {
			Date parse = new SimpleDateFormat("yyyy/MM/dd").parse(dataPublicacao);
			data.setTime(parse);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		this.livro.setDataPublicacao(data);
		return this;
	}

	public LivroBuilder setNumeroPaginas(int numeroPaginas) {
		this.livro.setNumeroPaginas(numeroPaginas);
		return this;
	}

	public LivroBuilder setValorFisico(String valorFisico) {
		BigDecimal bigDecimal = new BigDecimal(valorFisico);
		this.livro.setValorFisico(bigDecimal);
		return this;
	}

	public LivroBuilder setValorVirtual(String valorVirtual) {
		BigDecimal bigDecimal = new BigDecimal(valorVirtual);
		this.livro.setValorVirtual(bigDecimal);
		return this;
	}

	public LivroBuilder setValorVirtualComFisico(String valorVirtualComFisico) {
		BigDecimal bigDecimal = new BigDecimal(valorVirtualComFisico);
		this.livro.setValorVirtualComFisico(bigDecimal);
		return this;
	}

	public LivroBuilder setIsbn(String iSBN) {
		this.livro.setIsbn(iSBN);
		return this;
	}

	public LivroBuilder setImagemUrl(String imagemUrl) {
		this.livro.setImagemUrl(imagemUrl);
		return this;
	}

	public LivroBuilder addAutor(Autor autor) {
		this.livro.addAutor(autor);
		return this;
	}
}
