package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import resources.EMF;
import dao.ItemsDAO;
import dao.UserDAO;
import entities.Item;
import entities.User;

@Path("users")
public class Service {
	private ItemsDAO itemDAO;
	private UserDAO userDAO;
	private EntityManagerFactory emf;

	public Service() {
		this.emf = EMF.emf;
		itemDAO = new ItemsDAO();
		userDAO = new UserDAO();

	}

	public EntityManager createConnection() {
		return emf.createEntityManager();
	}

	public void insertItem(Item item) {

		EntityManager em = null;

		try {

			em = this.createConnection();

			EntityTransaction t = em.getTransaction();
			t.begin();
			itemDAO.insert(item, em);
			t.commit();
		} finally {
			em.close();
		}
	}

	public void insertTestData() {

		EntityManager em = null;

		try {

			em = this.createConnection();

			EntityTransaction t = em.getTransaction();
			t.begin();
			for (int i = 0; i < 10; i++) {

				User user = new User(" user " + Integer.toString(100 - i),
						Integer.toString(i));
				userDAO.insert(user, em);
				Item item = new Item("mouse_" + i, user);
				itemDAO.insert(item, em);

			}
			t.commit();
		} finally {

			em.close();
		}
	}

	public void insertUsers(List<User> users) {

		EntityManager em = null;

		try {

			em = this.createConnection();

			EntityTransaction t = em.getTransaction();
			t.begin();
			userDAO.insert(users, em);
			t.commit();
		} finally {
			em.close();
		}
	}

	public void insertUser(User user) {

		EntityManager em = null;

		try {

			em = this.createConnection();

			EntityTransaction t = em.getTransaction();
			t.begin();
			userDAO.insert(user, em);
			t.commit();
		} finally {
			em.close();
		}
	}

	@GET
	@Path("getUsers")
	@Produces("text/xml")
	public String selectAllUsers() {
		String s = "";
		EntityManager em = null;

		try {

			em = this.createConnection();

			for (User u : userDAO.selectAll(em)) {
				s += u.toString();

			}
		} finally {

			em.close();
		}
		return s;
	}

	public String selectAllItemsString() {
		String s = "";
		EntityManager em = null;

		try {

			em = this.createConnection();
			for (Item u : itemDAO.selectAll(em)) {
				s += u.toString();

			}
		} finally {

			em.close();
		}
		return s;
	}

	public List<Item> selectAllItems() {
		List<Item> s;
		EntityManager em = null;

		try {

			em = this.createConnection();
			s = itemDAO.selectAll(em);

		} finally {

			em.close();
		}
		return s;
	}

	public String getPosesions(String userName) {

		String s = "";
		EntityManager em = null;

		try {

			em = this.createConnection();

			for (Item i : itemDAO.getPosesions(em, userName)) {

				s += i.toString();
			}
		}

		finally {
			em.close();
		}
		return s;
	}

}
