class  DivTest
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int div = a/ b;
			System.out.println("������ ���: "+ div);
		}catch(ArrayIndexOutOfBoundsException e){
		
			System.out.println("������ �� �μ��� �����ϼ���");
		}


		

		
	}
}
