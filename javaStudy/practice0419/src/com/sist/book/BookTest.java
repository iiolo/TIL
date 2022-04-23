package com.sist.book;

import java.util.ArrayList;
import java.util.Scanner;

import com.sist.dao.BookDAO;
import com.sist.vo.BookVO;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���ǻ� �Է��� ���Ͽ� ���� ����
		String publisher;
		
		//���ǻ縦 �Է�
		System.out.print("���ǻ縦 �Է��Ͻÿ�==>");
		publisher = sc.next();
			
		//�ش���»��� å ������ �˻��ϱ� ���Ͽ� BookDAO��ü�� �����մϴ�.
		BookDAO dao = new BookDAO();
		
		//dao�� �޼ҵ带 ȣ���Ͽ� �ش� ���ǻ��� å ���� ������
		ArrayList<BookVO> list = dao.listBook(publisher);
		
		//������ ����մϴ�.
		System.out.println("������ȣ\t"
				+ "�����̸�\t\t"
				+ "���ǻ�\t"
				+ "����"
				);
		
		//����Ʈ��ŭ �ݺ����� �Ͽ� å ���� ���
		for (BookVO vo : list) {
			System.out.println(vo.getBookid()+"\t"
								+vo.getBookname()+"\t"
								+vo.getPublisher()+"\t"
								+vo.getPrice());
		}
		
		
		
		

	}

}










