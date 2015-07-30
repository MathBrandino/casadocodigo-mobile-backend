package br.com.caelum.casadocodigo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Acervo {

	private List<Livro> livros = new ArrayList<Livro>();

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void addLivro(Livro livro){
		this.getLivros().add(livro);
	}
}
