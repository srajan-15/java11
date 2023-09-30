package componentvaluescan;

import org.springframework.beans.factory.annotation.Value;

public class Charger {
	@Value("1")
	private int id;
	@Value("ctype")
	private String name;
	@Override
	public String toString() {
		return "Charger [id=" + id + ", name=" + name + "]";
	}
	
}
