package br.com.caelum.casadocodigo.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="compra")
public class Compra {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "compra", cascade = CascadeType.ALL)
	@JsonManagedReference
 	private List<Item> itens = new ArrayList<Item>();

	@ManyToOne
	@JoinColumn(name = "emailUsuario")
	private Usuario usuario;
	
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
