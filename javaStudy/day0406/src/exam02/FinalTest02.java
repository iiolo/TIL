package exam02;
class A{
	public void pro() {
		System.out.println("A�� pro�Դϴ�.");
	}
	
	public final void hello() {
		System.out.println("hello�Դϴ�.");
	}
}

class B extends A{
	public final void pro() {
		System.out.println("B�� pro�Դϴ�.");
	}
	
}
public class FinalTest02 {
	public static void main(String[] args) {
		
	}
}
