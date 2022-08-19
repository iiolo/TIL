package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.sist.vo.OrdersVO;

//데이터베이스에 접근하여 Orders테이블에 자료를 추가하거나, 수정하거나, 검색하거나, 삭제를 위한 
//메도를 갖고 있는 클래스를 만들어요
public class OrdersDAO {

	//고객아이디을 매개변수로 전달받아 해당 고객의 주문내역을 검색하여 
	//ArrayList로 반환하는 메소드를 정의 
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
			
			//검색한 결과 만큼 반복 실행합니다.
			while(rs.next()) {
				
				//현재 커서가 바라보고 있는 곳에 데이터를 뽑아 옵니다.
				int orderid = rs.getInt(1);
				int cid = rs.getInt(2);
				int bookid = rs.getInt(3);
				int saleprice = rs.getInt(4);
				Date orderdate = rs.getDate(5);
				
				//현재 커서가 바로보고 있는 곳에 데이터를 갖고 VO를 생성합니다.
				OrdersVO vo = new OrdersVO(orderid, 
						custid, bookid, saleprice, orderdate);
				
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













