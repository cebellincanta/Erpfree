package br.com.erp.dao.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaUtils {
	
	private static JpaUtils instancia = new JpaUtils();

    public static JpaUtils getInstancia() {
        return instancia;
    }
    @Autowired
    private EntityManagerFactory emf;

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public JpaUtils() {
        emf = Persistence.createEntityManagerFactory("sistemavirtualis");
    }

}
