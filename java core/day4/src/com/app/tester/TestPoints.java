package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

class TestPoints {
    
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter number of points to plot");
		Point2D[] point = new Point2D[scan.nextInt()];
		
		boolean flag = false;
		int choice = 0, index = 0, x = 0, y = 0;
		
		System.out.println("1. Add new point at ith index");
		System.out.println("2. Display all plotted points");
		System.out.println("3. Calculate distance b/w 2 points");
		System.out.println("0. Swift exit");
		
		while(!flag) {
			
			System.out.println("enter choice");
			choice = scan.nextInt();
				
				switch(choice) {
				
				    case 1: System.out.println("enter index and coordinates");
				            index = scan.nextInt(); x = scan.nextInt(); y = scan.nextInt();   
				            if(index <= point.length-1 && index >= 0)
				            	point[index] = new Point2D(x, y);
				            else
				            	System.out.println("invalid index ---> out of range");
				            break;
				    
				    case 2: System.out.println("all plotted points");
				            for(Point2D i : point) {
				            	if(i != null)
				            		System.out.println(i.getDetails()); 
				            }
				            break;
				    
				    case 3: System.out.println("enter indexes of two points");
						    x = scan.nextInt(); y = scan.nextInt();   
				            if(x <= point.length-1 && y <= point.length-1) {
				            	if(point[x] != null && point[y] != null)
				            		System.out.println(point[x].calculateDistance(point[y]));
				            	else
				            		System.out.println("invalid index --> no point plotted at one or more indexes");
				            }
				            else
				            	System.out.println("invalid index ---> out of range");
				            break;
				    
				    case 0: flag = true; break;
				    
				    default: System.out.println("Busted ---> invalid choice!!!");
		    
				}
		}
		scan.close();

	}

}
