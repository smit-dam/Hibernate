import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ParentChildExample {
	public static void main(String ... args){
		Parent p = new Parent();
		p.setParent_ID(1);
		p.setParentName("Smitesh");
		
		
		Child ch1 = new Child();
		ch1.setAdd1("Nandanvan"); ch1.setCity("Nagpur");
		Child ch2 = new Child();
		ch2.setAdd1("Kalamboli"); ch2.setCity("Navi-Mumbai");
		
//		p.getAddressList().add(ch1);
//		p.getAddressList().add(ch2);
		
		ArrayList <Child> ch = new ArrayList<Child>();
		ch.add(ch1);
		ch.add(ch2);
		
		p.setAddressList(ch);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();		 
		
		session = sf.openSession();
		session.beginTransaction();
		Parent pp = (Parent)session.get(Parent.class, 1);
		session.getTransaction().commit();
		session.close();
		System.out.println(pp.getParent_ID() + " | " + pp.getParentName() + " | " + pp.getAddressList().size());


		
		
		
	}
}
