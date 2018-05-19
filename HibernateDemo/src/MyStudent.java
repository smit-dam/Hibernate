import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="my_student")
public class MyStudent {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	private int age;
	@Temporal(TemporalType.DATE)
	private Date enrolDate;
	
//	all getters and setters below
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName+"SirName";
	}
		
	public int getAge() {
		return age;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserID(int userId) {
		this.userId = userId;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public Date getEnrolDate() {
		return enrolDate;
	}

	public void setEnrolDate(Date enrolDate) {
		this.enrolDate = enrolDate;
	}	
}
