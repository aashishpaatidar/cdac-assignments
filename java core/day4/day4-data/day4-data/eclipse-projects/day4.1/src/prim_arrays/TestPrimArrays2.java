package prim_arrays;

import java.util.Scanner;

public class TestPrimArrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many data points : double ?");
		// create array of the suitable type n size
		double[] myData = new double[sc.nextInt()];// [D
		// display array data : default values
		System.out.println("Def array contents via for-each");
		/*
		 * for (int i = 0; i <myData.length; i++) { System.out.print(myData[i] + " ");//
		 * 0.0
		 * 
		 * }
		 */
		for(double d : myData) //d=myData[0]......d=myData[myData.length-1]
			System.out.print(d+" ");
		System.out.println();
		//accept array data from user to populate the array
		for (int i = 0; i <myData.length; i++) 
		{
			System.out.println("Enter data");
			myData[i]=sc.nextDouble();
		}
		System.out.println("populated  array contents");
		/*
		 * for (int i = 0; i <myData.length; i++) { System.out.print(myData[i] + " ");//
		 * 0.0
		 * 
		 * }
		 */
		for(double d : myData) //d=myData[0]......d=myData[myData.length-1]
			System.out.print(d+" ");
	
		
		sc.close();

	}

}
