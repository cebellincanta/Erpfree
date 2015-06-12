package br.com.erp.dao.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.erp.dao.jpa.JpaUtils;
import br.com.erp.entidades.basic.Empresa;

@RepositoryRestResource(collectionResourceRel = "empresa", path = "empresa")
public class EmpresaDAO {
	
	@PersistenceContext
	EntityManager em = JpaUtils.getInstancia().getEmf().createEntityManager();
	
	UtilsCrud utilsCrud = new UtilsCrud(em);
	
	
	public void save(Empresa empresa){
		utilsCrud.save(empresa);
	}
	
	public void delete(Empresa empresa){
        empresa = em.find(Empresa.class, empresa.getId());
        utilsCrud.delete(empresa);
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List list(String namedQuery){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas = utilsCrud.list(namedQuery);
        return empresas;
    }
	


}
