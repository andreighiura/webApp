package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import service.Service;

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
	@Produces("MediaType.APPLICATION_JSON")
	public String getUsers() {
		String s = "";
		Service svc = new Service();
		s = svc.selectAllUsers();
		return s;
	}
}
