package br.com.caelum.casadocodigo.builders;

import br.com.caelum.casadocodigo.enums.TipoLivro;
import br.com.caelum.casadocodigo.modelo.Item;
import br.com.caelum.casadocodigo.modelo.Livro;

public class ItemBuilder {

	private Item item;
	
	public ItemBuilder novoItem(){
		item = new Item();
		return this;
	}
	
	public Item build(){
		return this.item;
	}
	
	public ItemBuilder setLivro(Livro livro){
		this.item.setLivro(livro);
		return this;
	}
	
	public ItemBuilder setTipoLivro(TipoLivro tipoLivro){
		this.item.setFormatoLivro(tipoLivro);
		return this;
	}
	
}
