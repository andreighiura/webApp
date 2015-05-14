package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class User implements Serializable {

	private static final long serialVersionUID = 4264275756764372958L;

	String userName;
	@Id
	String userID;

	public User(String name, String id) {
		this.userName = name;
		this.userID = id;
	}

	public User() {
	}

	public String toString() {
		return this.userName + "   id:  " + this.userID + "\n";
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
}
