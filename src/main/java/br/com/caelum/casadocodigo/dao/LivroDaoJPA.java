package br.com.caelum.casadocodigo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.casadocodigo.modelo.Livro;

@Repository
public class LivroDaoJPA {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Livro> listarLivros() {
		
		return entityManager.createQuery("Select * from livro;", Livro.class).getResultList();
	}

}
