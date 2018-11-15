package fr.orsys.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.orsys.mvc.dto.User;

@Repository
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void persist(User user) {
		em.persist(user);
	}
	
	public List<User> findAll() {
		return em.createQuery("SELECT u FROM User u").getResultList();
	}
	
	public User findUserByLoginPassword(String login, String password) {
		try {
			User user = (User) em.createQuery("SELECT u FROM User u WHERE u.login=:login_ AND u.password=:password_")
					.setParameter("login_", login)
					.setParameter("password_", password)
					.getSingleResult();
			return user;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public void deleteUser(User user) {
		em.remove(user);
	}
}
