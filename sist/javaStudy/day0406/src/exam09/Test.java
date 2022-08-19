package exam09;

import java.util.ArrayList;
import java.util.Iterator;

abstract class A {
	public abstract void pro();
}

class B extends A {

	@Override
	public void pro() {
		System.out.println("B의 pro 입니다.");
	}

}

class C extends A {

	@Override
	public void pro() {
		System.out.println("C의 pro 입니다.");
	}
	
	

}

public class Test {

	public static void main(String[] args) {
		A ob;
		ob = new B();
		ob.pro();
		
		ob = new C();
		ob.pro();
//		ArrayList<A> list = new ArrayList<A>();
//		list.add(new B());
//		list.add(new C());
//		
//		for (int i = 0; i < list.size(); i++) {
//			
//			A ob = list.get(i);
//			ob.pro();
//		}

	}

}
