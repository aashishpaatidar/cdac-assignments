package tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static utils.BusinessValidations.*;
import static utils.DataUtils.*;

import books.Books;
import users.Users;

class BookShopApplication {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			Map<String, Books> bookStore = new HashMap<>(populateMap(populateList()));
			
			Map<String, Users> userData = new HashMap<>(userDataMap(userList()));
			
			System.out.println("Welcome to Barnes & Noble Book Store");
			
			boolean exit = false;
			int i = 1;
			while(!exit) {
				try {
					System.out.println("1. Customer login");
					System.out.println("2. Admin login");
					System.out.println("3. Exit");
                    System.out.println("Enter choice");		
					switch(Integer.parseInt(scan.nextLine())) {
					
					case 1:
						System.out.println("Enter email and password");
						System.out.println("(default : alex@gmail.com 123456)");
						Users user = authenticateUser(scan.next(), scan.next(), userData);
						System.out.println("Welcome, " + user.getName());
						ArrayList<Books> cart = new ArrayList<>();
						
						System.out.println("<--Books available for you-->");
						for(Books book : bookStore.values()) {
							System.out.print(i++ + ")");
							System.out.println(book);
						}
						
						boolean flag = false;
						while(!flag) {
							try {
								System.out.println("\n");
								System.out.println("1. Add books to cart");
								System.out.println("2. Show cart");
								System.out.println("3. Remove books from cart");
								System.out.println("4. Check out/Log out");
								System.out.println("Enter choice:");
								
								switch(scan.nextInt()) {
								
								case 1:
									scan.nextLine();
									System.out.println("Enter a book title to add(case NOT sensitive)");
									System.out.println(addBookByTitle(scan.nextLine(), cart, bookStore));
									break;
									
								case 2:
									System.out.println("Cart contents:");
									i = 1;
									for(Books book : cart) {
										System.out.println(i++ + ") " + book.getTitle() + "  Rs." + book.getPrice());
									}
									break;
									
								case 3:
									scan.nextLine();
									System.out.println("Enter a book title to remove(case NOT sensitive)");
									System.out.println(removeBookByTitle(scan.nextLine(), cart));
							        break;
							        
								case 4:
									i = 1;
									for(Books book : cart)
										System.out.println(i++ + ") " + book.getTitle() + "   Rs." + book.getPrice());
									System.out.println("Total cart value = Rs. " + totalCartValue(cart));
									System.out.println("Thank You!!!");
									flag = true;
									exit = true;
									break;
									
								default: flag = true;
								}
								} catch(Exception e) {
									System.out.println("Error:" + e);
								}
						} 
						break;
						
					case 2:
						System.out.println("Enter email and password");
						Users admin = authenticateUser(scan.next(), scan.next(), userData);
						System.out.println("Welcome, " + admin.getName());
						break;
						
					default:
						exit = true;
					}
				} catch(Exception e) {
					System.out.println("Error::" + e);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
