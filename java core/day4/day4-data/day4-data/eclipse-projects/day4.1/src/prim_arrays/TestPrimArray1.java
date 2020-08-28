package prim_arrays;

import java.util.Scanner;

public class TestPrimArray1 {

	public static void main(String[] args) {
		//create an array type of ref var : to store double data values
		double[] data;//AS per JVM specs : byes will be allocated on stack(local)
		data=new double[10];//1 array object is created : that can hold 10 double vals
		//display array data : for 
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");//0.0 
			data[i]=i*2;
		}
		System.out.println();
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" "); 
			
		}
		System.out.println();
		//how to print the name of the class loaded in method area ?
		System.out.println("loaded cls name for an array "+data.getClass().getName());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("print F.Q cls name "+sc.getClass().getName());
		sc.close();
		String s=new String("hello");
		System.out.println("print F.Q cls name "+s.getClass().getName());
		

	}

}
