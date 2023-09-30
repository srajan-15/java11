package springday1m2;

import javax.management.loading.PrivateClassLoader;

public class Mobile {
	//public void use() {
		//System.out.println("It is used to talk");
		private int id;
		private String name;
		private String ram;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
	
}
