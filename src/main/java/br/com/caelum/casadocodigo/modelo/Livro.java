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
}
