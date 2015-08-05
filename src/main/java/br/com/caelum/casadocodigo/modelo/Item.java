package br.com.caelum.casadocodigo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.caelum.casadocodigo.enums.TipoLivro;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idLivro")
	private Livro livro;
	
	@ManyToOne
	@JoinColumn(name = "idCompra")
	@JsonBackReference
	private Compra compra;
	
	private TipoLivro formatoLivro;
	
	public TipoLivro getFormatoLivro() {
		return formatoLivro;
	}
	public void setFormatoLivro(TipoLivro formatoLivro) {
		this.formatoLivro = formatoLivro;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
