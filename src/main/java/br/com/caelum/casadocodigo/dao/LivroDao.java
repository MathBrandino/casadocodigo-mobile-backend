package br.com.caelum.casadocodigo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.casadocodigo.modelo.Livro;

@Repository
public class LivroDao {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Livro> listarLivros(int indicePrimeiroLivro, int qtdLivros) {
		return entityManager.createQuery("from Livro", Livro.class)
				.setFirstResult(indicePrimeiroLivro)
				.setMaxResults(qtdLivros)
				.getResultList();
	}
}
