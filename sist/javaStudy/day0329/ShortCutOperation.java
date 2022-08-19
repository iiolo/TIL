package day0329;

public class ShortCutOperation {

	public static void main(String[] args) {
		int a, b,c,d;
		a=b=c=d=5;
		
		if (++a>100 && ++b>100) {
			System.out.println("OK");
		} else {
			System.out.println("NO");

		}
		
		System.out.println("a: "+a);//6
		System.out.println("b: "+b);//5
		
		if (++c > 100 & ++d > 100) {
			System.out.println("OK");
		} else {
			System.out.println("NO");

		}
		System.out.println("c: " + c);
		System.out.println("d: " + d);

	}

}
