package prim_arrays;

public class TestForEach {

	public static void main(String[] args) {
		boolean[] isSleeping = new boolean[10];
		System.out.println(isSleeping.getClass().getName());// [Z
		for (boolean b : isSleeping)
			System.out.println(b);
		for (boolean flag : isSleeping) //for-each works on a copy of the array elem
			//can't be used to modify array data. flag=isSleeping[0] .....
			flag = true;//setting the value of a copy
		System.out.println("After setting flags...");
		for (boolean b : isSleeping)
			System.out.println(b);

	}

}
