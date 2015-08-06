package br.com.caelum.casadocodigo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Repository;

import br.com.caelum.casadocodigo.modelo.Compra;
import br.com.caelum.casadocodigo.modelo.Usuario;

@Repository
public class CompraDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public void registraCompra(Compra compra) {
		entityManager.persist(compra);
	}

	@SuppressWarnings("unchecked")
	public List<Compra> listaCompras(Usuario usuario) throws JpaObjectRetrievalFailureException {
		
		Query query = entityManager
				.createQuery("from Compra as c where c.usuario = :usuarioInformado");
		query.setParameter("usuarioInformado", usuario);
		return query.getResultList();
	}
}
