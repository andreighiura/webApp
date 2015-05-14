package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entities.User;

public class UserDAO {
	public void insert(User user, EntityManager em) {

		em.persist(user);

	}

	public void insert(List<User> users, EntityManager em) {
		for (User u : users) {
			insert(u, em);
		}
	}

	public List<User> selectAll(EntityManager em) {
		System.out.print("getting records from table users \n");

		@SuppressWarnings("unchecked")
		List<User> list = em.createQuery("from User").getResultList();
		return list;
	}
}
