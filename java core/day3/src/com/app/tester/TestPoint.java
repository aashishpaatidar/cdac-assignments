package com.app.tester;
import java.util.*;

import com.app.geometry.Point2D;

public class TestPoint {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter co-ordinates for 2 point");
		
		Point2D p1 = new Point2D(scan.nextInt(), scan.nextInt());
		Point2D p2 = new Point2D(scan.nextInt(), scan.nextInt());
		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		
		System.out.println("if point p1 & p2 are equal : " + p1.isEqual(p2));
		
		System.out.println("enter offset for new point");
		
		Point2D p3 = new Point2D(p1.getX() + scan.nextInt(), p1.getY() + scan.nextInt());
		System.out.println("new point created -->" + p3.getDetails());
		
		System.out.println(p1.getDetails());
		
		System.out.println("distance between pt1 & pt2 = " + p1.calculateDistance(p2));
		
		
		
	}

}
