package br.com.caelum.casadocodigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.casadocodigo.modelo.Autor;
import br.com.caelum.casadocodigo.modelo.Livro;

public class LivroDao {

	private Connection connection;
	
	public LivroDao(Connection connection) {
		this.connection = connection;
	}
	
	public List<Livro> listarLivros() {
		String sql = "SELECT l.*, a.* FROM livroAutor la "
				+ "JOIN autor a ON a.id = la.idAutor "
				+ "JOIN livro l ON l.id = la.idLivro;";
		ArrayList<Livro> livros = new ArrayList<Livro>();
		Livro l = null;
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			int idLivroAtual = 0;
			
			while (rs.next()) {
								
				if(idLivroAtual != rs.getInt("id") ) {
					
					idLivroAtual = rs.getInt("id");
					l = new Livro();
					l.setId(rs.getInt("id"));
					l.setNomeLivro(rs.getString("nomeLivro"));
					l.setDescricaoLivro(rs.getString("descricaoLivro"));
					Calendar dataPublicacao = Calendar.getInstance();
					dataPublicacao.setTimeInMillis(rs.getDate("dataPublicacao").getTime());
					l.setDataPublicacao(dataPublicacao);
					l.setNumeroPaginas(rs.getInt("numeroPaginas"));
					l.setValorFisico(rs.getBigDecimal("valorFisico"));
					l.setValorVirtual(rs.getBigDecimal("valorVirtual"));
					l.setValorVirtualComFisico(rs.getBigDecimal("valorVirtualComFisico"));
					l.setISBN(rs.getString("isbn"));
					l.setImagemUrl(rs.getString("imagemUrl"));
					livros.add(l);
				}
				
				Autor a = new Autor();
				a.setId(rs.getInt("idAutor"));
				a.setNomeAutor(rs.getString("nomeAutor"));
				a.setDetalhesAutor(rs.getString("detalhesAutor"));
				a.setImagemAutor(rs.getString("imagemAutor"));
				
				l.addAutor(a);
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
