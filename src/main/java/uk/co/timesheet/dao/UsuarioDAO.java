package uk.co.timesheet.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.co.timesheet.model.Usuario;

@Repository
@Transactional
public class UsuarioDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void saveUser(Usuario usuario) {
		em.persist(usuario);
	}

	public Usuario isLogado(String email, String passw) {
		Usuario user = this.findByName(email);
		System.out.println("isLogado no DAO email"+email+" pass: "+passw);
		System.out.println("isLogado no DAO user "+user.getEmail());
		System.out.println("isLogado no DAO passw "+user.getPassw());
		if (user!=null) 
			if(user.getPassw().equals(passw)) {
				System.out.println("achei usuario");
				return user;
			}else
				System.out.println("senha errada");
		return null;
	}
	
	private Usuario findByName(String email) {
		TypedQuery<Usuario> query = em.createQuery("select u from Usuario u where u.email = :email", Usuario.class);
		query.setParameter("email", email);
		try {
			return query.getSingleResult();
		}
		catch(NoResultException e){
			return null;
		}
	}
}
