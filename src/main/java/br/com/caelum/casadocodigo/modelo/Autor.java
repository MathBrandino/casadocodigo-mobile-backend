package br.com.caelum.casadocodigo.modelo;

public class Autor {

	private int id;
	private String nomeAutor;
	private String detalhesAutor;
	private String imagemAutor;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getDetalhesAutor() {
		return detalhesAutor;
	}
	public void setDetalhesAutor(String detalhesAutor) {
		this.detalhesAutor = detalhesAutor;
	}
	public String getImagemAutor() {
		return imagemAutor;
	}
	public void setImagemAutor(String imagemAutor) {
		this.imagemAutor = imagemAutor;
	}
}
