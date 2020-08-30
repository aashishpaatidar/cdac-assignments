package books;

import java.time.LocalDate;
import java.util.ArrayList;

public class Books implements Comparable<Books>{
	
	private String title;
	private Category category;
	private ArrayList<Author> author;
	private LocalDate publishDate;
	private int quantity;
	private double price;
	private String rating;
	

	public Books(String title, Category category, ArrayList<Author> author, LocalDate publishDate, int quantity,
			double price, String rating) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
		this.publishDate = publishDate;
		this.quantity = quantity;
		this.price = price;
		this.rating = rating;
	}
	
	public Books(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	

	public Books() {
		
	}

	@Override
	public String toString() {
		return title + ", " + category + "\n by author(s) " + author + ", " + publishDate + "\n"
				+ "stock:" + quantity + ", Rs. " + price + ", rating:" + rating + "\n";
	}


	public class Author {
		
		private String name, email;
		
		public Author(String name, String email) {
			this.name = name;
			this.email = email;
		}

		@Override
		public String toString() {
			return name +", "+ email;
		}
			
	}

	public Category getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Books o) {
		
		return this.title.compareToIgnoreCase(o.title);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Books) {
			Books book = (Books) obj;
			return this.title.equals(book.title);
		}
		return false;
	}

}
