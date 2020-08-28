package ref_arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Box;

public class TestBoxArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many boxes ?");
		//create array of box type of refs
		Box[] boxes=new Box[sc.nextInt()];
		System.out.println(Arrays.toString(boxes));
		System.out.println("cls name "+boxes.getClass().getName());
		//accept dims n create boxes 
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims : w d h");
			boxes[i]=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		//use for-each : to display box dims n volume
		System.out.println("Displaying box dims n volume");
		for(Box b : boxes)//b=boxes[0]....
			System.out.println(b.getBoxDetails()+"\n "+"vol="+b.computeVolume());
		//what will be o/p
		System.out.println("Displaying box details via Arrays toString");
		System.out.println(Arrays.toString(boxes));
		sc.close();

	}

}
