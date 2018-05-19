import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddedObjectDemo {

	public static void main(String[] args) {
		
		StudentWithEmbeddedAddress stud1 = new StudentWithEmbeddedAddress();
		StudentAddress stud1Add = new StudentAddress();
		
		stud1Add.setAdd1("5-601");
		stud1Add.setAdd2("Amarante");
		stud1Add.setCity("Navi Mumbai");
		stud1Add.setPinCode("410218");
		stud1.setRollNo(2);
		stud1.setHomeAdd(stud1Add);
		stud1.setStudName("Smitesh Damdoo");

		//
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(stud1);
		session.getTransaction().commit();
		session.close();

	}

}
