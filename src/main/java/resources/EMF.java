package resources;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

	public final static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("pers");
	

}
