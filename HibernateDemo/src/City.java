import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@NamedQueries(
		{
			@NamedQuery(name="getCityByName", query="from City c where c.name= :inputName")
		}
)
@Entity
@Table(name="city")
public class City {
	private Integer id;
	private String name;
	private String cityCode;
	private String circle;
	private Integer cityRank;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public Integer getCityRank() {
		return cityRank;
	}
	public void setCityRank(Integer cityRank) {
		this.cityRank = cityRank;
	}

	public String toString(){
		return (id+ " "+ name + " " + cityCode + " " + circle + " " + cityRank);
	}
	
}
