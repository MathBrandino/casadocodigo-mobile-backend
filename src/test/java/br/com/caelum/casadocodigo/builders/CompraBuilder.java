package br.com.caelum.casadocodigo.builders;

import br.com.caelum.casadocodigo.modelo.Compra;
import br.com.caelum.casadocodigo.modelo.Item;
import br.com.caelum.casadocodigo.modelo.Usuario;

public class CompraBuilder {

	private Compra compra;
	
	public CompraBuilder setId(int id){
		this.compra.setId(id);
		return this;
	}
	
	public CompraBuilder addItem(Item item){
		compra.addItem(item);
		return this;
	}

	public CompraBuilder setUsuario(Usuario usuario) {
		this.compra.setUsuario(usuario);
		return this;
	}
	
	public CompraBuilder novaCompra(){
		this.compra = new Compra();
		return this;
	}
	
	public Compra build(){
		return this.compra;
	}
	
}
