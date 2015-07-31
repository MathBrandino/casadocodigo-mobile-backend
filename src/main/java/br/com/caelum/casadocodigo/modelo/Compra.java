package br.com.caelum.casadocodigo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Usuario usuario;
	
	private List <Item> itens = new ArrayList<Item>();

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
