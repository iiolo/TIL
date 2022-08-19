package day0331;

public class Prime_DoWhile {

	public static void main(String[] args) {
		int k =2;
		
		do {
			int i =2;
			do {
				if (k % i == 0) {
					break;
				} 
				i++;
			} while (i<k);
			
			if (k == i) {
				System.out.print(k+ " ");
			}
			k++;
			
		} while (k<=100);

	}

}
