package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.User;

public class UserDAO {

	@PersistenceContext
	private EntityManager em;

	public void insert(User user) {

		em.persist(user);

	}

	public void insert(List<User> users) {
		for (User u : users) {
			insert(u);
		}
	}

	public List<User> selectAll() {

		List<User> list = em.createQuery("SELECT u from User u", User.class)
				.getResultList();
		return list;
	}

	public String getMess() {
		return em.toString();
	}
}
