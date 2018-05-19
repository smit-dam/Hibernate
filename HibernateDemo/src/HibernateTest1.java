import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest1 {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserName("Ram");
		
		Vehicles vehicle1 = new Vehicles();
		vehicle1.setVehicleName("TATA");
		Vehicles vehicle2 = new Vehicles();
		vehicle2.setVehicleName("Suzuki");
		
		
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(user); ///note that here we have used persist() method and not save() method
		//Note : here we are not saving vehicle object like user, because we have marked it as Cascade persist.
		session.getTransaction().commit();
		session.close();
	}
}
