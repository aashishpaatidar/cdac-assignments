import java.util.Scanner;
class TestBox 
{
	public static void main(String[] args) 
	{
		
		//create scanner obj to wrap : std in : System.in
		Scanner sc;//ref : class --local var : stack : as per JVM
		sc=new Scanner(System.in);//M. A : object class , scanner class , InputStream
		System.out.println("Enter side of a cube");
		Box cube=new Box(sc.nextDouble());
		System.out.println(cube.getBoxDetails()+" volume ="+cube.computeVolume());
		//create 2 boxes n chk equality
		Box b1=new Box(1,2,3);
		Box b2=new Box(1,2,3);
        System.out.println("ref equality "+(b1==b2));//false
		System.out.println("contents equality "+b1.testEquals(b2));//true
		System.out.println(b1);	  //F.Q cls name@address
		System.out.println(b2);  //F.Q cls name@address
		Box b3=b1;
		 System.out.println("ref equality "+(b1==b3));//true
		System.out.println("contents equality "+b1.testEquals(b3));//true
	    System.out.println(b3);  //F.Q cls name@address : same as b1
		System.out.println("Enter dim offset for new box : w.r.t cube");
		Box newBox=cube.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(newBox.getBoxDetails());
		//close scanner
		sc.close();

	}
}
