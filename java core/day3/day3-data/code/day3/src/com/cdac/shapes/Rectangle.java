/*
Create a  Rectangle class under "com.cdac.shapes" package.

Add data members --  x,y,widht,height.
Add a constr to accept all i/ps from user.
Add a method to return string form of rectangle details
*/

package com.cdac.shapes;
public class  Rectangle
{
	private int x,y,width,height;
	public Rectangle(int x,int y,int w,int h)
	{
		 this.x=x;
		 this.y=y;
		 width=w;
		 height=h;
	}
	public String getDetails()
	{
		 return "Rect : "+x+" "+y+" "+width+" "+height;
	}
}
