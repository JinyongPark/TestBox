package SpringDBTest2;

public class User {
	String id;
	String name;
	String password;
	
	public String getId() {
		return id;
	}
	public String setId (String id) {
		return this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public String setPassword(String password) {
		return this.password = password;
	}
}
