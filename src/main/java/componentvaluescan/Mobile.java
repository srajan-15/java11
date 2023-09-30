package componentvaluescan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Mobile {
	@Value("1")
	private int id;
	@Value("oneplus")
	private String name;
	@Value("64gb")
	private String ram;
	@Autowired
	private Charger charger;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + ", charger=" + charger + "]";
	}
	
}
