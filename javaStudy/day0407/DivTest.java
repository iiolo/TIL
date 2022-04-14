class  DivTest
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int div = a/ b;
			System.out.println("나누기 결과: "+ div);
		}catch(ArrayIndexOutOfBoundsException e){
		
			System.out.println("나누기 할 두수를 전달하세요");
		}


		

		
	}
}
