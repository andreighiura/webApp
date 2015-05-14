package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entities.Item;

public class ItemsDAO {

	public void insert(Item item, EntityManager em) {

		em.persist(item);

	}

	public List<Item> selectAll(EntityManager em) {

		@SuppressWarnings("unchecked")
		List<Item> list = em.createQuery("from Item").getResultList();

		return list;
	}

	public List<Item> getPosesions(EntityManager em, String userName) {
		/*
		 * String sql =
		 * "SELECT item.* FROM item INNER JOIN user on user.userID=item.userID";
		 * 
		 * @SuppressWarnings("unchecked") List<Item> list = (List<Item>)
		 * conn.createSQLQuery(sql) .addEntity("entities.Item").list();//
		 * .setParameter("userName", // "2") .list();
		 * 
		 * for (Object i : list) { System.out.print(((Item) i).toString() +
		 * "\n"); } return list; }
		 */
		@SuppressWarnings("unchecked")
		List<Item> list = em
				.createQuery("from Item i WHERE i.user.userName=(:userName)")
				.setParameter(":userName", userName).getResultList();
		return list;
	}
}
