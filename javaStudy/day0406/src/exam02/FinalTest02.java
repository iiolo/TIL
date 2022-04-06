package exam02;
class A{
	public void pro() {
		System.out.println("A의 pro입니다.");
	}
	
	public final void hello() {
		System.out.println("hello입니다.");
	}
}

class B extends A{
	public final void pro() {
		System.out.println("B의 pro입니다.");
	}
	
}
public class FinalTest02 {
	public static void main(String[] args) {
		
	}
}
