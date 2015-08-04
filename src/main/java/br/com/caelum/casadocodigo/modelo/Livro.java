package br.com.caelum.casadocodigo.modelo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="livro")
public class Livro {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(length=500)
	private String nomeLivro;
	
	@Column(length=5000)
	private String descricaoLivro;
	
	@Temporal(value=TemporalType.DATE)
	private Calendar dataPublicacao;
	private int numeroPaginas;
	
	@Column(name="valorFisico")
	private BigDecimal valorFisico;
	
	@Column(name="valorVirtual")
	private BigDecimal valorVirtual;
	
	@Column(name="valorVirtualComFisico")
	private BigDecimal valorVirtualComFisico;
	private String isbn;
	private String imagemUrl;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="livroAutor", 
		joinColumns=@JoinColumn(name="idLivro"),
	    inverseJoinColumns=@JoinColumn(name="idAutor"))  
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

	public String getDataPublicacao() {
		return new SimpleDateFormat("MM/yyyy").format(dataPublicacao.getTime());
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String iSBN) {
		isbn = iSBN;
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
