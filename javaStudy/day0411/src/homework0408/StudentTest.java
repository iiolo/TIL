package homework0408;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Student{
	private String name;
	private String addr;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Student(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addr, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	
}


public class StudentTest {
	
	public static Scanner sc ;
	
	public static void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.���,  2.�˻�,  3.����,  4.������,  0.����");		
		System.out.print("�޴��� �����ϼ���==>");
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		sc = new Scanner(System.in);
		int menu;
		
		while(true) {
			printMenu();
			menu= sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			switch(menu) {
				case 1:insertStudent(list);break;
				case 2:searchStudent(list);break;
				case 3:deleteStudent(list);break;
				case 4:printStudent(list);break;
			}
		}
		System.out.println("���α׷��� �����Ͽ����ϴ�.");
	}

	private static void printStudent(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		System.out.println("�̸�\t�ּ�\t��ȭ");
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getName()+"\t"+s.getAddr()+"\t"+s.getPhone());
		}
	}

	private static void deleteStudent(ArrayList<Student> list) {
		String name;
		System.out.print("������ �л��� �̸��� �Է�==>");
		name = sc.next();
		
//		for(int i=0; i<list.size(); i++) {
//			Student s = list.get(i);
//			if(s.getName().equals(name)) {
//				list.remove(i);
//			}
//		}
		
		/*
		Student s1 = new Student("ȫ�浿", "����", "1111");
		Student s2 = new Student("ȫ�浿", "����", "1111");
		
		if(s1.equals(s2)) {
			
		}else {
			
		}*/
		
//		ArrayList<Student> list2 = 
//				new ArrayList<Student>();
//		list2.add(new Student("ȫ�浿", "����", "111"));
//		list2.add(new Student("�̼���", "�λ�", "222"));
//		
//		
//		Student s1 = new Student("ȫ�浿", "����", "1111");
//		list2.remove(s1);
		//����Ʈ�� ��Ҹ� ������ ���� 
		//�ε����� �ƴ� ��ü�� �Ű������� �����ϸ�
		//equals�޼ҵ带 �䱸�մϴ�.
		
		
		
		 for(Student s : list ) {
			 if(s.getName().equals(name)) {
				 list.remove(s);
				 System.out.println(name+"�л��� ������ �����Ͽ����ϴ�.");
			 }
		 }
	}

	private static void searchStudent(ArrayList<Student> list) {
		String name;
		System.out.print("�˻��� �л��� �̸��� �Է�==>");
		name = sc.next();
		
		 for(Student s : list ) {
			 if(s.getName().equals(name)) {
				 System.out.println("�˻��� �л��� ������ ������ �����ϴ�.");
				 System.out.println(s.getName()+"\t"+s.getAddr()+"\t"+s.getPhone());
			 }
		 }
		
	}

	private static void insertStudent(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		String name, addr, phone;
		System.out.print("����� �л��� �̸��� �Է�==>");
		name = sc.next();
		System.out.print("����� �л��� �ּҸ� �Է�==>");
		addr = sc.next();
		System.out.print("����� �л��� ��ȭ�� �Է�==>");
		phone = sc.next();
		
		Student s = new Student(name, addr, phone);
		list.add(s);
		System.out.println("�л��� ������ ����Ͽ����ϴ�.");
	}
}
