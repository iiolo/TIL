package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.sist.vo.BookVO;


public class BookDAO {

	//���ǻ縦 �Ű������� ���޹޾� �ش� ���ǻ��� å ������ �˻��Ͽ� 
	//ArrayList�� ��ȯ�ϴ� �޼ҵ带 ���� 
	public ArrayList<BookVO> listBook(String publisher){
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book where publisher = "+"'"+publisher+"'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE", 
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			//�˻��� ��� ��ŭ �ݺ� �����մϴ�.
			while(rs.next()) {
				
				//���� Ŀ���� �ٶ󺸰� �ִ� ���� �����͸� �̾� �ɴϴ�.
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String pb = rs.getString(3);
				int price = rs.getInt(4);
				
				//���� Ŀ���� �ٷκ��� �ִ� ���� �����͸� ���� VO�� �����մϴ�.
				BookVO vo = new BookVO(bookid, bookname, publisher, price);
				
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













