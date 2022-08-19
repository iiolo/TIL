package day0331;

public class Gugudan_DoWhile {

	public static void main(String[] args) {
		int dan = 2;
		
		do {
			int i = 1;
			System.out.println(dan + "´Ü");
			do {
				
				System.out.println(dan + "*" +i+"="+(dan*i));
				i++;
			} while (i<=9);
			dan++;
			System.out.println("---------------------------------------------");
			
		} while (dan <= 9);
		
	}

}
