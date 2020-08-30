package users;

import java.util.ArrayList;

import books.Books;

public class Customer extends Users {
	
	private ArrayList<Books> cart;	


	public Customer(String email, String name, String password) {
		super(email, name, password);
		
	}


	public ArrayList<Books> getCart() {
		return cart;
	}


	public void setCart(ArrayList<Books> cart) {
		this.cart = cart;
	}
	
}		
		

