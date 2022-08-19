package day0329;

public class ComplexAssignment {

	public static void main(String[] args) {
		int sum = 0;
		int i =1;
		sum += i; //sum = sum +i; //1
		i++;//i = i+1;//2
		
		sum += i;//3 
		i++; //3
		
		sum += i;//6
		i++; //4
		
		System.out.println("sum : "+sum);
		System.out.println("i : "+i);
		
		
		
	}

}
