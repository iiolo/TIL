package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.sist.vo.BookVO;


public class BookDAO {

	//출판사를 매개변수로 전달받아 해당 츨판사의 책 내역을 검색하여 
	//ArrayList로 반환하는 메소드를 정의 
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
			
			//검색한 결과 만큼 반복 실행합니다.
			while(rs.next()) {
				
				//현재 커서가 바라보고 있는 곳에 데이터를 뽑아 옵니다.
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String pb = rs.getString(3);
				int price = rs.getInt(4);
				
				//현재 커서가 바로보고 있는 곳에 데이터를 갖고 VO를 생성합니다.
				BookVO vo = new BookVO(bookid, bookname, publisher, price);
				
				//생성한 VO를 리스트에 담아요
				list.add(vo);				
			}
			
			//사용했던 자원들을 닫아 줍니다.
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return list;
	}
}













