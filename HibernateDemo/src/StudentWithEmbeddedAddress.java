import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="STUDENT_WITH_ADDRESS")
public class StudentWithEmbeddedAddress {
	@Id
	private int rollNo;
	private String studName;
	@Embedded
	private StudentAddress homeAdd;
	
//	all getters and setters below
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public StudentAddress getHomeAdd() {
		return homeAdd;
	}
	public void setHomeAdd(StudentAddress homeAdd) {
		this.homeAdd = homeAdd;
	}
}
