package cruzeirao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import cruzeirao.model.EntityModel;

public abstract class DAOImpl <T extends EntityModel> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<T> classe;
    
    public DAOImpl(Class<T> classe) {
    	this.classe = classe;
    	emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}

	public T save(T entity) {
		T saved = null;

		getEntityManager().getTransaction().begin();
		saved = getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();

		closeEntityManager();
		
		return saved;
	}


	public void remove(T entity) {
		getEntityManager().getTransaction().begin();
		getEntityManager().remove(entity);
		getEntityManager().getTransaction().commit();
		
		closeEntityManager();
	}
	
	public T getById(long pk) {
		T ret;
		
		try {
			ret = getEntityManager().find(classe, pk);			
		} catch (NoResultException e) {
			ret = null;
		}
		closeEntityManager();
		
		return ret;
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		List<T> ret = getEntityManager().createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
		
		closeEntityManager();
		
		return ret;
	}

	public EntityManager getEntityManager() { 
		if(em == null)
			em = emf.createEntityManager();
  
		return em;
	}
	
	public void closeEntityManager(){
		if(em != null)
			em.close();
		
		em = null;
	}
}