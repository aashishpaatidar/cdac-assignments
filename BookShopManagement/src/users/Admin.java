package users;

import books.Books;
import books.Category;

public class Admin extends Users {

	public Admin(String email, String name, String password) {
		super(email, name, password);
		
	}
	
	// feature under development
	public void addBooks(Books book, Category genre) {
		
		// coming soon
	}
	
	@Override
	public String getEmail() {
		return email;
	}
	

}
