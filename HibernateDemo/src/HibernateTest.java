import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateTest {

	public static void main(String[] args) throws HibernateException {		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		student s = new student();
/*		s.setRno(16);
		s.setSname("Narayan");
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		System.out.println("Completed");
		
		session.close();
*/		
//		session = sf.openSession();
		session.beginTransaction();
		s = (student)session.get(student.class, 16);
		session.getTransaction().commit();
		System.out.println("Name is  " + s.getSname());
				
	}

}
