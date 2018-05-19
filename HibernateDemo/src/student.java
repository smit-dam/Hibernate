// This is my Model class which is mapped to table in DB.

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
@NamedNativeQueries({
	@NamedNativeQuery(
	        name = "xyz",
	        query = "CALL xyz(:rno)",
	        resultClass = student.class
	        )
})
@Entity
public class student {
	@Id
	private int rno;
	private String sname;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
