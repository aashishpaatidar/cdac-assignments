package p2;
import p1.A;
//non sub class outside the the pkg
class E  {
	public E() {
	
		A ref=new A();
		System.out.println("A's state "+ref.i+" "+ref.j+" "+ref.k+" "+ref.l);
	}
}
