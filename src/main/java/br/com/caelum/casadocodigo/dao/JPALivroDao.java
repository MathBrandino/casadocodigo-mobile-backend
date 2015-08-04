package br.com.caelum.casadocodigo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.casadocodigo.modelo.Livro;

@Repository
public class JPALivroDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Livro> listarLivros(int indicePrimeiroLivro, int qtdLivros) {
		
		//select distinct l from Livro as l inner join fetch l.autores
		return entityManager.createQuery("from Livro")
				.setFirstResult(indicePrimeiroLivro)
				.setMaxResults(qtdLivros)
				.getResultList();
				
	}
}
