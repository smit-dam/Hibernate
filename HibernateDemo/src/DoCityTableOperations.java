
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DoCityTableOperations {

	public static void main(String[] args) throws HibernateException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Query query = session.getNamedQuery("getCityByName").setParameter("inputName", "Delhi");
		List<City> cities = query.getResultList();
		
		Iterator<City> itr = cities.iterator();
		while(itr.hasNext()){
			City c = itr.next();
			System.out.println(c);
		}
		session.close();
	}
}