package day0331;

public class Game369_DoWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int n10;
		int n1;
		do {
			n10 = i /10;
			n1 = i % 10;
			if (i<10) {//1 �ڸ� ��
				if (i % 3 != 0) {
					System.out.print(i+" ");
				}else {
					System.out.print("¦ ");
				}
			} else {//2�ڸ� �� 
				if (n10 % 3 == 0 ) {// 10�� �ڸ��� 3�� ����ΰ�?
					if (n1 > 0 && n1 % 3 == 0) {
						System.out.print("¦¦");
					} else {
						System.out.print("¦ ");
					}
				} else {// 10�� �ڸ��� 3�� ����� �ƴ� �� 
					if (n1 > 0 && n1 % 3 == 0) {
						System.out.print("¦ ");
						
					} else {
						System.out.print(i+" ");
					}
				}
			
			}
			i++;
			
		} while (i<=50);

	}

}
