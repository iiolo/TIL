package day0329;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = -5;
		int b = (a>0) ? 1 : 0;
		System.out.println(b);
		
		String c = (a>0)?"OK":"NO";
		System.out.println(c);
		System.out.println((a>0) ? 1 : 0);
		

	}

}
