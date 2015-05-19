package dao;

import javax.ejb.Stateless;

@Stateless
public class SimpleSessionBean {

	private String message = "If you don't see this, it didn't work!";

	public String getMessage() {
		return this.message;
	}
}