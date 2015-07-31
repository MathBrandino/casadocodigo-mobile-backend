package br.com.caelum.casadocodigo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.casadocodigo.modelo.Compra;

@Repository
public class CompraDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public void registraCompra(Compra compra) {
		entityManager.persist(compra);
	}

}
