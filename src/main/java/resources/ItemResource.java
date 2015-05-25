package resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import service.Service;
import entities.Item;

@Path("item")
public class ItemResource {
	@Inject
	private Service svc;

	@GET
	@Produces("text/plain")
	public String getMess() {
		return svc.getMess();
	}

	@GET
	@Path("getItems")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Item> getItems() {
		return svc.selectAllItems();
	}

}
