package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import books.Books;
import books.Category;
import custom_exc.BookShopException;
import users.Users;


public class BusinessValidations {
	

	public static String validateEmail(String email) throws BookShopException {
			
		if(!(email.contains("@")))
			throw new BookShopException("Invalid email address");
		return email;
	}
	
	public static String validatePassword(String password) throws BookShopException {
			
		if(!(password.length() >= 6))
			throw new BookShopException("Password length short");
		return password;
	}
	
	public static Category validateCategory(String type) throws BookShopException {
		
		return Category.valueOf(type);
	}
	
	public static LocalDate validatePublishDate(String pubDate) throws BookShopException {
		
		LocalDate d = LocalDate.parse(pubDate);
		if(!d.isBefore(LocalDate.now()))
			throw new BookShopException("Invalid date!!!");
		return d;
	}
	
	public static String validateRating(double rating) throws BookShopException {
		
		if(!(rating >= 1 && rating <= 5))
			throw new BookShopException("Rating must be between 1-5");
		
		return Double.toString(rating);
	}
	
	public static Users authenticateUser(String email, String password,
			Map<String, Users> map) throws BookShopException {
		
		Users user = map.get(email);
		if(user == null)
			throw new BookShopException("Invalid Email...");
		if(!(user.getPassword().equals(password)))
			throw new BookShopException("Password invalid...");
		
		return user;
	}
	
    public static String addBookByTitle(String str, ArrayList<Books> list, 
    		Map<String, Books> map) throws BookShopException {
    	
    	Books book = map.get(str.toUpperCase());
    	if(book != null) {
    		list.add(book);
    		return "Book added to cart...!";
    	}
    	else
    		throw new BookShopException("Book title incorrect...!");
    	
    }
	
	public static String removeBookByTitle(String str, ArrayList<Books> list)
			throws BookShopException {
		
		Books book = new Books(str.toUpperCase());
		if(list.contains(book)) {
			list.remove(book);
			return "Book removed from cart...!";
		}
		else
			throw new BookShopException("Book not found in cart...!");			
	}
	
	public static double totalCartValue(ArrayList<Books> list) {
		
		double sum = 0;
		for(Books book : list) 
			sum += book.getPrice();
		
		return sum;
	}

}
