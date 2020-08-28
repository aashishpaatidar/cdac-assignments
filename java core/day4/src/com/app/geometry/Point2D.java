package com.app.geometry;

public class Point2D {
	
	private int x, y;
	
	public Point2D(int x, int y) {	
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		
		return "(x, y) = " + x + "," + y; 
	}
	
	public boolean isEqual(Point2D point) {
		
		return (this.x == point.x && this.y == point.y);
	}
	
	public String createNewPoint(int x, int y) {
		
		Point2D pt = new Point2D(this.x + x, this.y + y);
		return "x = " + pt.x +" " + "y = " + pt.y;
	}
	
	public double calculateDistance(Point2D point) {
		
		return Math.abs(Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2)));
	}
	
}
