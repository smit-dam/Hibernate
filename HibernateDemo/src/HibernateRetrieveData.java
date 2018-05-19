import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateRetrieveData {

	public static void main(String[] args) {
		MyStudent ms = new MyStudent();
		MyStudent ms1 = new MyStudent();
		ms.setUserName("Monali");
		ms.setAge(12);
		ms.setEnrolDate(new Date());
		
		ms1.setUserName("Sonali");
		ms1.setAge(15);
		ms1.setEnrolDate(new Date());
		
		
/*		Create SessionFactory. SessionFactory is only one object for an application. So by using hibernate.cfg.xml we will be creating the 
 * 		session factory.
 * 		Create Session from a SessionFactory. Session need to be created every-time whenever you want to do db ops like save,retrieve,etc.
		Use the created Session to do db ops like save the Model Object,etc.
		configure() method reads the configuration file to understand what db config needs to made.
		buildSessionFactory() method returns the SessionFactory object.
		use SessionFactory object to open the Session using openSession() method.
		Do the db operations inside the transaction of the session.
		
*/		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(ms);
		session.save(ms1);
		session.getTransaction().commit();
		session.close();
		
		MyStudent retrivedStudent = new MyStudent();
		session = sf.openSession();
		retrivedStudent= session.get(MyStudent.class, 2);
		System.out.println("Student ID = " + retrivedStudent.getUserId());
		System.out.println("Student Age = " + retrivedStudent.getAge());
		System.out.println("Enroll Date = " + retrivedStudent.getEnrolDate());
		System.out.println("Student Name = " + retrivedStudent.getUserName());
	}
}
