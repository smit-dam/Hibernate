import java.util.List;


public interface ICityDao {
	public List getCityByName(String name);
	public List getCityByCircle(String circle);
}
