
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;

	@OneToMany
	@JoinTable(	name="User_Vehicle", 
				joinColumns=@JoinColumn(name="UserID"), 
				inverseJoinColumns=@JoinColumn(name="VehicleID")	
				)
	private Collection<Vehicles> vehicle = new ArrayList<>();
	
	public Collection<Vehicles> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicles> vehicle) {
		this.vehicle = vehicle;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
