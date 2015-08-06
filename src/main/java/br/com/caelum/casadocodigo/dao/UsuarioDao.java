package br.com.caelum.casadocodigo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.casadocodigo.modelo.Usuario;

@Repository
public class UsuarioDao {

	@PersistenceContext
	private EntityManager entityManager;

	public boolean isUsuario(Usuario usuario) {
		if(entityManager.find(Usuario.class, usuario.getEmail()) != null){
			return true;
		}
		return false;
	}

	public void registraUsuario(Usuario usuario) {
		entityManager.persist(usuario);
	}
}
