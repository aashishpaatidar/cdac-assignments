package com.tester;
import java.util.Scanner;
import com.cdac.shapes.Rectangle;

class TestRectangle 
{
	public static void main(String[] args) 
	{
		//sc
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter rect details : x y width height");
		Rectangle rect=new Rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(rect.getDetails());
	}
}
