package br.com.caelum.casadocodigo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="autor")
public class Autor {

	@Id
	@GeneratedValue
	@JsonProperty("idAutor")
	private int id;
	
	@JsonProperty("nomeAutor")
	private String nome;
	
	@Column(length=5000)
	@JsonProperty("detalhesAutor")
	private String informacoes;
	
	@JsonProperty("imagemAutor")
	private String imagemUrl;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	public String getImagemUrl() {
		return imagemUrl;
	}
	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((informacoes == null) ? 0 : informacoes.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((imagemUrl == null) ? 0 : imagemUrl.hashCode());
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (informacoes == null) {
			if (other.informacoes != null)
				return false;
		} else if (!informacoes.equals(other.informacoes))
			return false;
		if (id != other.id)
			return false;
		if (imagemUrl == null) {
			if (other.imagemUrl != null)
				return false;
		} else if (!imagemUrl.equals(other.imagemUrl))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
