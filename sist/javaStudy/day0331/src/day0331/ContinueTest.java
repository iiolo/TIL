package day0331;

public class ContinueTest {

	public static void main(String[] args) {
		int i;
		for ( i = 0; i <=10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("����");
		System.out.println("�ݺ��� Ż�� ���� i�� "+ i);

	}

}
