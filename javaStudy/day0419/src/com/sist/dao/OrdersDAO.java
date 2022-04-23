package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.sist.vo.OrdersVO;

//�����ͺ��̽��� �����Ͽ� Orders���̺� �ڷḦ �߰��ϰų�, �����ϰų�, �˻��ϰų�, ������ ���� 
//�޵��� ���� �ִ� Ŭ������ ������
public class OrdersDAO {

	//�����̵��� �Ű������� ���޹޾� �ش� ���� �ֹ������� �˻��Ͽ� 
	//ArrayList�� ��ȯ�ϴ� �޼ҵ带 ���� 
	public ArrayList<OrdersVO> listOrder(int custid){
		ArrayList<OrdersVO> list = new ArrayList<OrdersVO>();
		String sql = "select * from orders where custid = "+custid;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.98:1521:XE", 
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			//�˻��� ��� ��ŭ �ݺ� �����մϴ�.
			while(rs.next()) {
				
				//���� Ŀ���� �ٶ󺸰� �ִ� ���� �����͸� �̾� �ɴϴ�.
				int orderid = rs.getInt(1);
				int cid = rs.getInt(2);
				int bookid = rs.getInt(3);
				int saleprice = rs.getInt(4);
				Date orderdate = rs.getDate(5);
				
				//���� Ŀ���� �ٷκ��� �ִ� ���� �����͸� ���� VO�� �����մϴ�.
				OrdersVO vo = new OrdersVO(orderid, 
						custid, bookid, saleprice, orderdate);
				
				//������ VO�� ����Ʈ�� ��ƿ�
				list.add(vo);				
			}
			
			//����ߴ� �ڿ����� �ݾ� �ݴϴ�.
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
		return list;
	}
}













