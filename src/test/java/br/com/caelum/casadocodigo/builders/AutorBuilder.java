package br.com.caelum.casadocodigo.builders;

import br.com.caelum.casadocodigo.modelo.Autor;

public class AutorBuilder {

	private Autor autor;

	public AutorBuilder novoAutor() {
		this.autor = new Autor();
		return this;
	}

	public Autor constroiAutor() {
		return this.autor;
	}

	public AutorBuilder setId(int id) {
		this.autor.setId(id);
		return this;
	}

	public AutorBuilder setNome(String nome) {
		this.autor.setNome(nome);
		return this;
	}

	public AutorBuilder setInformacoes(String informacoes) {
		this.autor.setInformacoes(informacoes);
		return this;
	}

	public AutorBuilder setImagemUrl(String imagemUrl) {
		this.autor.setImagemUrl(imagemUrl);
		return this;
	}
}
