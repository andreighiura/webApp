package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Item;

public class ItemsDAO {
	@PersistenceContext
	private EntityManager em;

	public void insert(Item item) {

		em.persist(item);

	}

	public List<Item> selectAll() {

		@SuppressWarnings("unchecked")
		List<Item> list = em.createQuery("from Item").getResultList();

		return list;
	}

	public List<Item> getPosesions(String userName) {
		@SuppressWarnings("unchecked")
		List<Item> list = em
				.createQuery("from Item i WHERE i.user.userName=(:userName)")
				.setParameter(":userName", userName).getResultList();
		return list;
	}

}
