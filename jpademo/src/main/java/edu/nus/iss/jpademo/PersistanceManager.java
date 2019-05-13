package edu.nus.iss.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistanceManager {
	INSTANCE;

	private EntityManagerFactory emFactory;

	private PersistanceManager() {
		        emFactory = Persistence.createEntityManagerFactory("jpademo");
		    }

	public EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}

	public void close() {
		emFactory.close();
	}

}
