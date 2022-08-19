package com.sist.orders;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sist.dao.OrdersDAO;
import com.sist.vo.OrdersVO;

public class OrdersTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//����ȣ �Է��� ���Ͽ� ������ �����մϴ�.
		int custid;
		
		//����ȣ�� �Է¹޾ƿ�
		System.out.print("����ȣ�� �Է��Ͻÿ�==>");
		custid = sc.nextInt();
			
		//�ش���� �ֹ������� �˻��ϱ� ���Ͽ� OrdersDAO��ü�� �����մϴ�.
		OrdersDAO dao = new OrdersDAO();
		
		//dao�� �޼ҵ带 ȣ���Ͽ� ���� �ֹ������� �˻��մϴ�.
		ArrayList<OrdersVO> list = dao.listOrder(custid);
		
		//������ ����մϴ�.
		System.out.println("�ֹ���ȣ\t"
				+ "����ȣ\t"
				+ "������ȣ\t"
				+ "���Ű���\t"
				+ "������");
		
		//����Ʈ��ŭ �ݺ����� �Ͽ� ���ų����� ����մϴ�.
		for (OrdersVO vo : list) {
			System.out.println(vo.getOrderid()+"\t"+
							+ vo.getCustid()+"\t"+
							+ vo.getBookid()+"\t"
							+ vo.getSaleprice()+"\t"
							+ vo.getOrderdate()
					
								);
		}
		
		
		
		

	}

}










