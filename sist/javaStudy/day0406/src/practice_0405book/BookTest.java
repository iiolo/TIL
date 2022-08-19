package practice_0405book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	
	public static Scanner sc;
	 
	//�ݺ����ȿ��� �޴��� ����ϱ� ���� �޼ҵ带 ������.
	public static void printMenu() {
		System.out.println("===========================================");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. ��� å ���");
		System.out.println("4. ����");
		System.out.println("===========================================");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
	}
	
	public static void main(String[] args) {
		//Book []bookList = new Book[100];
		sc = new Scanner(System.in);  //��ĳ�ʸ� ����
		
		ArrayList<Book> list = new ArrayList<Book>();
		//������ ������ ���� ����Ʋ �����մϴ�.
		
		int menu;
		//�޴��� �Է��ϱ� ���� ������ �����մϴ�.
		
		//���Ḧ ���� �޴� 4�� �Է����� �ʴ� �� ��� �����մϴ�.
		while(true) {
			printMenu();//�޴��� ����մϴ�.
			menu = sc.nextInt();//�޴��� �Է��մϴ�.
			if(menu == 4) {//�Է��� �޴��� 4�̸� �ݺ�����
				break;		//Ż���մϴ�.
			}		
			switch(menu) {	//������ �޴��� ����
				case 1:insertBook(list);break;//�޴��� 1�̶�� ������ ����ϱ� ���� �޼ҵ带 ȣ���մϴ�.
				case 2:searchBook(list);break;//�޴��� 2�̶�� ������ �˻��ϱ� ���� �޼ҵ带 ȣ���մϴ�.
				case 3:printBook(list);break;//�޴��� 3�̶�� ��絵���� ����ϱ� ���� �޼ҵ带 ȣ���մϴ�.
			}
		}
		
		System.out.println("*** ���α׷��� �����Ͽ����ϴ�. *** ");
		//�޴��� 4�� �Է��Ͽ� �ݺ����� Ż�������� ���α׷� ���� �Ͽ��ٰ� ����մϴ�.
	}

	//������ ����ϱ� ���� �޼ҵ�
	public static void insertBook(ArrayList<Book> list) {
		String title;	//����� ������ �̸��� �����ϱ� ���� ����
		int score;		//����� ������ ������ �����ϱ� ���� ����
		
		//������ ������ �Է�
		System.out.print("����:");
		title = sc.next();
		
		//������ ������ �Է�
		System.out.print("����:");
		score = sc.nextInt();
		
		//�����̸��� ������ �ɹ����� ���� Book��ü�� ����
		Book book = new Book(title, score);
		
		//������ Book�� ����Ʈ�� ��ƿ�
		list.add(book);
		
		//����ߴٰ� �޼����� ���
		System.out.println("������ ������ ����Ͽ����ϴ�.");
	}
		
	//��� ������ ����ϱ� ���� �޼ҵ�
	public static void printBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
//		for(int i=0; i<list.size(); i++) {
		for(int i=0; i<Book.count; i++) {   //����Ʈ�� ��� ������ �� ��ŭ �ݺ� ���ؾƿ� 
			System.out.println(list.get(i));	//������ �ϳ��� ������ ����ͼ� ���
		}
	}

	//������ �˻��ϱ� ���� �޼ҵ�
	public static void searchBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		
		String title; 			//�˻��� �������� �Է��ϱ� ���� ����
		int score = -1;			//�˻��� ������ ������ �����ϱ� ���� ����
		
		//ã�� �������� �Է�
		System.out.print("ã���� �ϴ� �������� �Է�==>");
		title = sc.next();
		
		for(int i=0; i<Book.count; i++) { //����Ʈ�� ��� ������ �� ��ŭ �ݺ� �����Ͽ� 
			Book b = list.get(i);		//������ �ϳ��� ������ ����ͼ� b�� ����	
			if(b.title.equals(title)) {	//������ ����� b�� ������� ã�� �������� ��ġ�ϴٸ�
				score = b.score;		//�� ������ ������ ����
			}
		}
		//���� ã�� �������� ����Ʈ�� �������� �ʴ´ٸ�
		//score�� -1�� �����ϰ� �־��!
		
		
		if(score != -1) {  // ã�� ������ ����Ʈ�� �־��ٸ�
			System.out.println(title+"������ ������ "+score+"�Դϴ�.");//������ ���
		}else {			   // ã�µ����� ����Ʈ�� ���ٸ�
			System.out.println(title+"������ ������ �����ϴ�.");	// ���ٰ� ���
		}
	}
}