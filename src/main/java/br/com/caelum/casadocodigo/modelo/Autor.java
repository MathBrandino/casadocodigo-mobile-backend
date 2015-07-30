package br.com.caelum.casadocodigo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@GeneratedValue
	private int idAutor;
	private String nomeAutor;
	private String detalhesAutor;
	private String imagemAutor;

	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int id) {
		this.idAutor = id;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((detalhesAutor == null) ? 0 : detalhesAutor.hashCode());
		result = prime * result + idAutor;
		result = prime * result
				+ ((imagemAutor == null) ? 0 : imagemAutor.hashCode());
		result = prime * result
				+ ((nomeAutor == null) ? 0 : nomeAutor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (detalhesAutor == null) {
			if (other.detalhesAutor != null)
				return false;
		} else if (!detalhesAutor.equals(other.detalhesAutor))
			return false;
		if (idAutor != other.idAutor)
			return false;
		if (imagemAutor == null) {
			if (other.imagemAutor != null)
				return false;
		} else if (!imagemAutor.equals(other.imagemAutor))
			return false;
		if (nomeAutor == null) {
			if (other.nomeAutor != null)
				return false;
		} else if (!nomeAutor.equals(other.nomeAutor))
			return false;
		return true;
	}
}
