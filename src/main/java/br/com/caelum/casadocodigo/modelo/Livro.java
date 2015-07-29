package br.com.caelum.casadocodigo.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Livro {

	private int id;
	private String nomeLivro;
	private String descricaoLivro;
	private Calendar dataPublicacao;
    private int numeroPaginas;
    private BigDecimal valorFisico;
    private BigDecimal valorVirtual; 
    private BigDecimal valorVirtualComFisico;
    private String ISBN;
    private String imagemUrl;
    private List<Autor> autores = new ArrayList<Autor>();	
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getDescricaoLivro() {
		return descricaoLivro;
	}
	public void setDescricaoLivro(String descricaoLivro) {
		this.descricaoLivro = descricaoLivro;
	}
	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public BigDecimal getValorFisico() {
		return valorFisico;
	}
	public void setValorFisico(BigDecimal valorFisico) {
		this.valorFisico = valorFisico;
	}
	public BigDecimal getValorVirtual() {
		return valorVirtual;
	}
	public void setValorVirtual(BigDecimal valorVirtual) {
		this.valorVirtual = valorVirtual;
	}
	public BigDecimal getValorVirtualComFisico() {
		return valorVirtualComFisico;
	}
	public void setValorVirtualComFisico(BigDecimal valorVirtualComFisico) {
		this.valorVirtualComFisico = valorVirtualComFisico;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getImagemUrl() {
		return imagemUrl;
	}
	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public void addAutor(Autor autor) {
		this.autores.add(autor);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result
				+ ((dataPublicacao == null) ? 0 : dataPublicacao.hashCode());
		result = prime * result
				+ ((descricaoLivro == null) ? 0 : descricaoLivro.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((imagemUrl == null) ? 0 : imagemUrl.hashCode());
		result = prime * result
				+ ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
		result = prime * result + numeroPaginas;
		result = prime * result
				+ ((valorFisico == null) ? 0 : valorFisico.hashCode());
		result = prime * result
				+ ((valorVirtual == null) ? 0 : valorVirtual.hashCode());
		result = prime
				* result
				+ ((valorVirtualComFisico == null) ? 0 : valorVirtualComFisico
						.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (dataPublicacao == null) {
			if (other.dataPublicacao != null)
				return false;
		} else if (!dataPublicacao.equals(other.dataPublicacao))
			return false;
		if (descricaoLivro == null) {
			if (other.descricaoLivro != null)
				return false;
		} else if (!descricaoLivro.equals(other.descricaoLivro))
			return false;
		if (id != other.id)
			return false;
		if (imagemUrl == null) {
			if (other.imagemUrl != null)
				return false;
		} else if (!imagemUrl.equals(other.imagemUrl))
			return false;
		if (nomeLivro == null) {
			if (other.nomeLivro != null)
				return false;
		} else if (!nomeLivro.equals(other.nomeLivro))
			return false;
		if (numeroPaginas != other.numeroPaginas)
			return false;
		if (valorFisico == null) {
			if (other.valorFisico != null)
				return false;
		} else if (!valorFisico.equals(other.valorFisico))
			return false;
		if (valorVirtual == null) {
			if (other.valorVirtual != null)
				return false;
		} else if (!valorVirtual.equals(other.valorVirtual))
			return false;
		if (valorVirtualComFisico == null) {
			if (other.valorVirtualComFisico != null)
				return false;
		} else if (!valorVirtualComFisico.equals(other.valorVirtualComFisico))
			return false;
		return true;
	}
}
