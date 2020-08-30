package users;


public class Users {
	
	protected String email;
	protected String name;
	protected String password;
	
	
	public Users(String email, String name, String password) {
		this.email = email;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return  name + ", " + email + ", " + password;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	
	

}
