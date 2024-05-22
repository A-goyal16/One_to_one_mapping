package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverClass
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mapping");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country c=new Country();
		c.setId(1);
		c.setName("India");
		c.setPopulation("145 crore");
		
		PrimeMinister pm=new PrimeMinister();
		pm.setPid(1);
		pm.setName("Narendra modi");
		pm.setAge(72);
		
		c.setPm(pm);
		
		et.begin();
		em.persist(pm);
		em.persist(c);
		et.commit();
		
	}
	
	
}
