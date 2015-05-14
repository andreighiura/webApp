

@Path("user")
public class UserResource {
	
	@GET
	//@Path("getter")
	@Produces("text/xml")
	public String getUser (){
		return "<customer>\n"
    + "<id>123</id>\n"
    + "<firstName>Joseph</firstName>\n"
    + "<middleName>William</middleName>\n"
    + "<lastName>Graystone</lastName>\n"
    + "</customer>\n";
		
	}
}
