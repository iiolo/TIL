package day0331;

public class GuGudan_While {

	public static void main(String[] args) {
		int dan = 2;
		while(dan <= 9) {
			int i=1;
			System.out.println(dan + "´Ü");
			while (i<=9) {
				System.out.println(dan + "*" +i+"="+(dan*i));
				i++;
			}
			dan++;
			System.out.println("---------------------------------------------");
		}
		

	}

}
