package day0331;

public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		boolean flag = false;
		while (!flag) {
			if (i>3) {
				break;
			}
			System.out.println("hello");
			i++;
		}
		
		System.out.println("Á¾·á");
		System.out.println("i: "+i);
	}

}
