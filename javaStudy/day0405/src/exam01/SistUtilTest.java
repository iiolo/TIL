package exam01;

public class SistUtilTest {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		SistUtuil util = new SistUtuil();
		System.out.println(util.getMax(a, b));
		System.out.println(util.getMax(5, 6, 7));
		System.out.println(util.getMax(2.7, 5.7));
		
		int []arr = {6,2,3,9,7};
		System.out.println(util.getMax(arr));
	}
}
