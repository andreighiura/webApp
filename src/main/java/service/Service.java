package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import dao.ItemsDAO;
import dao.UserDAO;
import entities.Item;
import entities.User;

@Stateless
@ManagedBean(name = "service")
public class Service {

	@Inject
	private ItemsDAO itemDAO;
	@Inject
	private UserDAO userDAO;

	public void insertItem(Item item) {

		itemDAO.insert(item);
	}

	public void insertTestData() {
		for (int i = 0; i < 10; i++) {

			User user = new User(" user " + Integer.toString(100 - i),
					Integer.toString(i));
			userDAO.insert(user);
			Item item = new Item("mouse_" + i, user);
			itemDAO.insert(item);
		}
	}

	public void insertUsers(List<User> users) {

		userDAO.insert(users);
	}

	public void insertUser(User user) {
		userDAO.insert(user);
	}

	public String selectAllUsersString() {
		String s = "";

		for (User u : userDAO.selectAll()) {
			s += u.toString();

		}

		return s;
	}

	public List<User> selectAllUsers() {

		List<User> s = null;

		s = userDAO.selectAll();

		return s;
	}

	public String selectAllItemsString() {
		String s = "";

		for (Item u : itemDAO.selectAll()) {
			s += u.toString();
		}

		return s;
	}

	public List<Item> selectAllItems() {
		List<Item> s;
		s = itemDAO.selectAll();
		return s;
	}

	public String getPosesions(String usrName) {

		String s = "";

		for (Item i : itemDAO.getPosesions(usrName)) {

			s += i.toString();
		}

		return s;
	}

	public String getMess() {
		return userDAO.getMess();
	}

}
