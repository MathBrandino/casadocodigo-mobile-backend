package br.com.caelum.casadocodigo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.caelum.casadocodigo.enums.TipoLivro;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne
	private Livro livro;
	private TipoLivro tipoLivroVendido;
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public TipoLivro getTipoLivroVendido() {
		return tipoLivroVendido;
	}
	public void setTipoLivroVendido(TipoLivro tipoLivroVendido) {
		this.tipoLivroVendido = tipoLivroVendido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
