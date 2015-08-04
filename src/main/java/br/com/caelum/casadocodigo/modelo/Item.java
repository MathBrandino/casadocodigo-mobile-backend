package br.com.caelum.casadocodigo.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.caelum.casadocodigo.enums.TipoLivro;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="item")
public class Item implements Serializable {
	
	/**	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "idLivro")
	private Livro livro;
	
	@Id
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
}
