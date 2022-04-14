package day0331;

public class Game369_DoWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int n10;
		int n1;
		do {
			n10 = i /10;
			n1 = i % 10;
			if (i<10) {//1 ÀÚ¸® ¼ö
				if (i % 3 != 0) {
					System.out.print(i+" ");
				}else {
					System.out.print("Â¦ ");
				}
			} else {//2ÀÚ¸® ¼ö 
				if (n10 % 3 == 0 ) {// 10ÀÇ ÀÚ¸®°¡ 3ÀÇ ¹è¼öÀÎ°¡?
					if (n1 > 0 && n1 % 3 == 0) {
						System.out.print("Â¦Â¦");
					} else {
						System.out.print("Â¦ ");
					}
				} else {// 10ÀÇ ÀÚ¸®°¡ 3ÀÇ ¹è¼ö°¡ ¾Æ´Ò ¶§ 
					if (n1 > 0 && n1 % 3 == 0) {
						System.out.print("Â¦ ");
						
					} else {
						System.out.print(i+" ");
					}
				}
			
			}
			i++;
			
		} while (i<=50);

	}

}
