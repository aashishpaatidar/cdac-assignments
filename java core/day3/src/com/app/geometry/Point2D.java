package com.app.geometry;

public class Point2D {
	
	private int x, y;
	
	public Point2D(int x, int y) {	
		this.setX(x);
		this.setY(y);
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getDetails() {
		
		return "(x, y) = " + getX() + "," + getY(); 
	}
	
	public boolean isEqual(Point2D point) {
		
		return (this.getX() == point.getX() && this.getY() == point.getY());
	}
	
	public String createNewPoint(int x, int y) {
		
		Point2D pt = new Point2D(this.getX() + x, this.getY() + y);
		return "x = " + pt.getX() +" " + "y = " + pt.getY();
	}
	
	public double calculateDistance(Point2D point) {
		
		return Math.abs(Math.sqrt(Math.pow((this.getX() - point.getX()), 2) + Math.pow((this.getY() - point.getY()), 2)));
	}
	
}
