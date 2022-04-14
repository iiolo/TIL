package day0331;


public class SortTest {

	public static void main(String[] args) {
		int []data = {15,24,10,18,44,42};
		
		
		// 정렬 반복문
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[i]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		//출력 반복문
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}

	}

}
