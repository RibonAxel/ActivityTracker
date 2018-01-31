package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.User;

public class UserDAO {

	private static final String JPA_UNIT_NAME = "ActivityTracker";
	private static EntityManager entityManager;

	protected EntityManager getEntityManager() {
		if (entityManager == null) {
			entityManager = Persistence.createEntityManagerFactory(JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}

	@SuppressWarnings("unchecked")
	public List<String> getPseudos() {
		List<String> pseudoList = getEntityManager().createQuery("SELECT u.pseudo FROM User u").getResultList();
		return pseudoList;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUser(){
		List<User> userList = getEntityManager().createQuery("SELECT u FROM User u").getResultList();
		return userList;
	}

}


