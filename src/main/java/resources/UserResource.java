package resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import service.Service;
import entities.User;

@Path("user")
public class UserResource {
	@Inject
	private Service svc;

	@GET
	@Path("getUsers")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<User> getUsers() {
		return svc.selectAllUsers();
	}
}
