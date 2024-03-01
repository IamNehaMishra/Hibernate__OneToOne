package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Neha");
		p1.setAge(24);
		
		Adhar adhar = new Adhar();
		adhar.setId(1);
		adhar.setAdharnum("1234");
		adhar.setAddress("Bangalore");
		
		p1.setAdhar(adhar);
		et.begin();
		em.persist(adhar);
		em.persist(p1);
		et.commit();
	}
}
