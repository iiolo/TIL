package day0331;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int []data = {28,27,27,25,26,30,20,21};
		int sum =0;
		int avg;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
			
		}
		avg = sum/(data.length-1);
		
		System.out.println(avg);
		

	}

}
