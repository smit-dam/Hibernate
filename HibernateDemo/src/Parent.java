import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="PERSON_DETAILS")
public class Parent {
	@Id
	private int parent_ID;
	private String parentName;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="PERSON_ADDRESS", joinColumns=@JoinColumn(name="PERSON_ID_FK"))
	//commenting because we wanted to add index column (primary key) in child table and to do that 
	// we need to use collection which support indexing and HashSet doesn't support indexing
//	private Set<Child> addressList = new HashSet();
	@GenericGenerator(name = "hilo-gen", strategy = "sequence")
	@CollectionId(columns = { @Column(name="ADDRESSID_PK") }, generator = "hilo-gen", type = @Type(type = "long"))
	private List<Child> addressList = new ArrayList<Child>();
	
//	all getters and setters are below
	public int getParent_ID() {
		return parent_ID;
	}
	public void setParent_ID(int parent_ID) {
		this.parent_ID = parent_ID;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public List<Child> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Child> addressList) {
		this.addressList = addressList;
	}
	
}
