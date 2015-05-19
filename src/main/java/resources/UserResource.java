package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import service.Service;
import entities.User;

@Path("user")
public class UserResource {

	@GET
	@Path("getTest")
	@Produces("text/xml")
	public String getUser() {
		return "<customer>\n" + "<id>123</id>\n"
				+ "<firstName>Joseph</firstName>\n"
				+ "<middleName>William</middleName>\n"
				+ "<lastName>Graystone</lastName>\n" + "</customer>\n";

	}

	@GET
	@Path("getUsers")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<User> getUsers() {
		Service svc = new Service();
		return svc.selectAllUsers();
	}
}
