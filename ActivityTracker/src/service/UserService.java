package service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import dao.UserDAO;
import model.User;

@Path("/users")
public class UserService {
	
	UserDAO udao = new UserDAO();
	
	/*
	@GET
	public String getPseudos() {
		
		List<String> pseudos = udao.getPseudos();
		String resultat = "Test des pseudos :";
		
		for (int i = 0; i<pseudos.size();i++) {
			resultat += pseudos.get(i) + "";
		}
	
		return resultat;
	}
	*/
	
	@GET
	public Response getUser() {
		
		List<User> users = udao.getUser();
		
		return Response
				.status(402)
				.entity((users.get(0)).toJSON())
				.build();
	}	
	
}