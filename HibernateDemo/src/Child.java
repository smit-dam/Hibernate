import javax.persistence.Embeddable;

@Embeddable
public class Child {
	private String add1;
	private String city;
	
//	All getters and setters below
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
