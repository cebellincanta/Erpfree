package br.com.erp.dao.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UtilsCrud {
    @Autowired
	private final EntityManager manager;
    
    public UtilsCrud(EntityManager em){
        this.manager = em;
    }
    
    public void save(Object object){
        
        try{
          manager.getTransaction().begin();  
          if(manager.contains(object)){
              this.update(object);
          }else{
              manager.persist(object);
          }
          manager.getTransaction().commit();
        }catch(Exception ex){
            
        }finally{
            
        }
       
        
    }
    
    public void delete(Object object){
        manager.getTransaction().begin();
        manager.remove(object);
        manager.getTransaction().commit();
    }
    
    public void update(Object object){
        manager.getTransaction().begin();
        manager.merge(object);
        manager.getTransaction().commit();
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Object findById(Class clazz, Long id){
        manager.getTransaction().begin();
        Object obj =  manager.find(clazz, id);
        manager.getTransaction().commit();
        return  obj;
    }
    
        
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List list(String namedQuery){
        List<Object> objects = new ArrayList<Object>();
        objects = manager.createNamedQuery(namedQuery).getResultList();
    return objects;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List findByLikeParam(String namedQuery,String field, String param){
        List<Object> objects = new ArrayList<Object>();
        objects = manager.createNamedQuery(namedQuery).setParameter(field, "%"+param+"%").getResultList();
    return objects;
    }
    
    public Object findByParam(String namedQuery,String field, String param){
       Object object;
       object = manager.createNamedQuery(namedQuery).setParameter(field, param).getSingleResult();
    return object;
    }

}
