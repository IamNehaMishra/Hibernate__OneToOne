package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country c1= new Country();
		c1.setId(1);
		c1.setName("India");
		c1.setPopulation("145 Crores");
		
		PrimeMinister minister = new PrimeMinister();
		minister.setId(1);
		minister.setName("Narendra Modi");
		minister.setAge(72);
		
		c1.setPrimeminister(minister);
		
		et.begin();
		em.persist(minister);
		em.persist(c1);
		et.commit();
		
		
	}
}
