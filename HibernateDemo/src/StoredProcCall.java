import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoredProcCall {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Query qry = session.getNamedQuery("xyz").setParameter("rno", 16);
		student s = (student)(qry.list()).get(0);
		System.out.println("Rno" + s.getRno() + " Name " + s.getSname());
	}
}
