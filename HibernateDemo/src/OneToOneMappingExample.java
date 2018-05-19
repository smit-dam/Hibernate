import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/// One to Many example is Mother table and Child table
// One to One  example is Product table and Product_Description table

//uses UserDetails and Vehicles classes 

public class OneToOneMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicles vehicle1 = new Vehicles();
		vehicle1.setVehicleName("TATA");
		Vehicles vehicle2 = new Vehicles();
		vehicle2.setVehicleName("Suzuki");
		
		UserDetails user = new UserDetails();
		user.setUserName("Smit");
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();

	}

}
