class Box
{
	 //state
	 private double width,depth,height;//instance vars : inited to def vals.
	 //constr : to init all 3 dims
	 Box(double w,double d,double height)
	{
		 this.width=w;
		 this.depth=d;
		 this.height=height;
	}
	//for init of cube : overloaded constructor
	Box(double side)
	{
		 this(side,side,side);
	}
	//add a method To return Box details in string form (dims of Box)
	String getBoxDetails()
	{
		return "Box Dims "+width+" "+depth+" "+height;
	}
	//add a method To return computed volume of the box
	double computeVolume()
	{
		 return this.width*depth*height;
	}
	//add a method to test equality of 2 boxes : based upon dims
	//prim types as well as ref types : are passed by value (copy)
	//b1.testEquals(b2) : anotherBox=b2;
	boolean testEquals(Box anotherBox)
	{
		return this.width == anotherBox.width && depth == anotherBox.depth && height == anotherBox.height;
	}
	Box createNewBox(double wOff,double dOff,double hOff)
   {
     Box anotherBox=new Box(width+wOff,depth+dOff,height+hOff);
     return anotherBox;
   }


}