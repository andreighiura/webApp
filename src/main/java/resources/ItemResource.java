package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import service.Service;
import dao.SimpleSessionBean;
import entities.Item;

@Path("item")
public class ItemResource {
	SimpleSessionBean ssb;

	@GET
	@Path("getItems")
	@Produces({ MediaType.APPLICATION_XML })
	public List<Item> getItems() {

		Service svc = new Service();
		return svc.selectAllItems();
	}

	@GET
	@Path("getMess")
	public String message() {
		return ssb.getMessage();
	}
}
