package prim_arrays;

import java.util.Arrays;

public class TestForEach2 {

	public static void main(String[] args) {
		// dynamic init of array
		int[] data = { 2, 23, 45, 67, 100 };// [I, obj with len=5 --inited to actual vals
		for (int i : data) // i=data[0]....i=data[4] {
		{
			i *= 2;
			System.out.println(i);
		}
		// System.out.println(i);
		// display array contents : for-each
		for (int d : data)
			System.out.print(d + " ");
		// display array contents with Arrays.toString
		System.out.println("Printing array contents : via Arrays' toString ");
		System.out.println(Arrays.toString(data));
	}

}
