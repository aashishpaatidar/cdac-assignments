package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import books.Books;
import custom_exc.BookShopException;
import users.Admin;
import users.Customer;
import users.Users;

import static utils.BusinessValidations.*;

public class DataUtils {
	
	public static ArrayList<Books> populateList() throws BookShopException {
		
		ArrayList<Books> list = new ArrayList<>();
		
		list.add(new Books("THE ALCHEMIST", validateCategory("FICTION"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Paulo Coelho", "paul@gmail.com"))),
				validatePublishDate("2005-10-17"), 5, 350, validateRating(4.5)));
		
		list.add(new Books("THE KITE RUNNER", validateCategory("FICTION"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Khaled Hosseini", "khali@gmail.com"))),
				validatePublishDate("2013-01-01"), 2, 400, validateRating(4)));
		
		list.add(new Books("SAPIENS", validateCategory("SCIENCE"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Yuval Harari", "yuval@gmail.com"))),
				validatePublishDate("2015-06-11"), 10, 550, validateRating(4.6)));
		
		list.add(new Books("FREAKONOMICS", validateCategory("SCIENCE"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Steven Levitt", "levi@gmail.com"),
						new Books().new Author("Stephen Dubner", "steph@gmail.com"))),
				validatePublishDate("2010-01-01"), 4, 212, validateRating(4.2)));
		
		list.add(new Books("IKIGAI", validateCategory("MEDITATION"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Héctor García", "hector@gmail.com"), 
						new Books().new Author("Francesc Miralles", "franc@gmail.com"))),
				validatePublishDate("2017-09-27"), 1, 290, validateRating(3.8)));
		
		list.add(new Books("INNER ENGINEERING", validateCategory("MEDITATION"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Jaggi Vasudev", "jaggi@gmail.com"))),
				validatePublishDate("2016-12-12"), 3, 276, validateRating(4)));
		
		list.add(new Books("THINK & GROW RICH", validateCategory("FINANCE"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Napolean Hill", "nepu@gmail.com"))),
				validatePublishDate("2014-12-01"), 5, 149, validateRating(4.2)));
		
		list.add(new Books("I DO WHAT I DO", validateCategory("FINANCE"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Raghuram Rajan", "raghu@gmail.com"))),
				validatePublishDate("2017-09-04"), 6, 477, validateRating(4)));
		
		list.add(new Books("THE POWER OF YOGA", validateCategory("YOGA"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Yamini Muthanna", "yami@gmail.com"))),
				validatePublishDate("2015-01-01"), 5, 697, validateRating(3.9)));
		
		list.add(new Books("RAJA YOGA", validateCategory("YOGA"), 
				new ArrayList<>(Arrays.asList(new Books().new Author("Swami Vivekananda", "N/A"))),
				validatePublishDate("1896-08-15"), 5, 300, validateRating(4.5)));
		
		return list;	
	}
	
	public static Map<String, Books> populateMap(ArrayList<Books> list) {
		
		Map<String, Books> hmap = new HashMap<>();
		for(Books book : list) {
			hmap.put(book.getTitle(), book);
		}
		
		return hmap;
	}
	
	public static ArrayList<Users> userList() throws BookShopException {
		
		ArrayList<Users> list = new ArrayList<Users>();
		list.add(new Admin(validateEmail("admin@bookshop.com"), "Admin", validatePassword("admin123")));
		
		list.add(new Customer(validateEmail("alex@gmail.com"), "Alex", validatePassword("123456")));
		list.add(new Customer(validateEmail("david@gmail.com"), "David", validatePassword("123456")));
		list.add(new Customer(validateEmail("tom@gmail.com"), "Tom", validatePassword("123456")));
		list.add(new Customer(validateEmail("lily@gmail.com"), "Lily", validatePassword("123456")));
		list.add(new Customer(validateEmail("emma@gmail.com"), "Emma", validatePassword("123456")));
		
		return list;
	}
	
	public static Map<String, Users> userDataMap(ArrayList<Users> list) {
		
		Map<String, Users> userMap = new HashMap<>();
		
		for(Users user : list) {
			userMap.put(user.getEmail(), user);
		}
			
		return userMap;
	}

	
}
