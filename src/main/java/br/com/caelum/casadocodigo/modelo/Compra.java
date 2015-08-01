package br.com.caelum.casadocodigo.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compra")
public class Compra {

	@Id @GeneratedValue
	private int id;
	@ManyToOne
	private Usuario usuario;
	@OneToMany
	@JoinColumn(name="idCompra", referencedColumnName="id")
	private List<Item> itens = new ArrayList<Item>();

	public List <Item> getItens() {
		return itens;
	}

	public void setItens(List <Item> itens) {
		this.itens = itens;
	}
	
	public void addItem(Item item){
		itens.add(item);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
