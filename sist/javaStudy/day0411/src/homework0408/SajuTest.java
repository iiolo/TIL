package homework0408;

import java.util.Scanner;

public class SajuTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String r[] = {"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��"};
		String r2[]= {"��","��","��","�䳢","��","��","��","��","������","��","��","����"};
		String r3[] = {"��[��11-1]","��[1-3]","��[3-5]","��[5-7]","��[7-9]","��[9-11]","��[��11-1]","��[1-3]","��[3-5]","��[5-7]","��[7-9]","��[9-11]"};
		String name, r_year, r_month, r_date, r_time;
		int n=0;	 //������ ���¸� ���³� ����
		int menu=0;  //�Է� �޾Ƶ��� ����
		
		System.out.println("*** ���� ���� �˾ƺ��� ***");
		System.out.print("�̸��� �Է�==>");
		name = sc.next();
		
		
		for(int i=0; i<r2.length; i++) {
			System.out.print(i+ ":"+r2[i]+" ");
		}
		System.out.print("�츦 �Է��ϼ���==>");
		menu = sc.nextInt();
		n = menu;
		
		r_year = r[n]; //���⿡ ���� ����� ����
		
		System.out.print("������ �Է��ϼ���");
		menu = sc.nextInt();
		
		//��, 
		//n=1, 
		//���� =3, menu=3
				
		n = n + menu-1;
		n = n %12;
		r_month = r[n]; //������ ���� ����� ����
		
		System.out.print("������ �Է��ϼ���");
		menu = sc.nextInt();
		
		n = n + menu-1;
		n = n %12;
		r_date = r[n];  //���Ͽ� ���� ����� ����
		
		
		for(int i=0; i<r3.length;i++) {
			System.out.print(i + ":"+ r3[i]+" ");
		}
		System.out.print("���ø� �Է��ϼ���==>");
		menu = sc.nextInt();
		n = n + menu;
		
		n = n %12;
		r_time = r[n]; //���ÿ� ���� ����� ����
		
		System.out.println("-------------------------------------");
		System.out.println(name+"���� �������ڴ� ������ �����ϴ�.");
		System.out.println("������ ���:"+r_year);
		System.out.println("������ ���:"+r_month);
		System.out.println("������ ���:"+r_date);
		System.out.println("������ ���:"+r_time);		
		System.out.println("-------------------------------------");
	}	
}