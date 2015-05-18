package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import service.Service;
import entities.Item;

@Path("item")
public class ItemResource {

	@GET
	@Path("getItems")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Item> getItems() {

		Service svc = new Service();
		return svc.selectAllItems();
	}
}
