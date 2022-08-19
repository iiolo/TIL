package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.sist.db.ConnectionProvider;
import com.sist.vo.BoardVO;

public class BoardDAO {
	//게시물 수정 메소드
	public int updateBoard(BoardVO b) {
		int re = -1;
		String sql = "update board set title=?,content=? where no=? and pwd=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());			
			pstmt.setInt(3, b.getNo());
			pstmt.setString(4, b.getPwd());
			
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return re;
	}
	
	
	// 조회수 증가 메소드
	public void updateHit(int no) {
		String sql = "update board set hit=hit+1 where no =?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println("예외 발생"+e.getMessage());
		}
	}
	
	
	// 게시물 번호를 받아 해당되는 게시물을 VO에 담아 전달
	public BoardVO findByNo(int pno) {
		BoardVO b =null;
		String sql = "select * from board where no=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pno);
			
			// 해당 sql 실행
			// select문 일경우 executeQuery, delete insert문 일경우 executeUpdate
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// getInt(컬럼이름 혹은 컬럼순서); 매개변수 이름과 같으면 에러
//				int no = rs.getInt("no");
//				String title = rs.getString("title");
//				String writer = rs.getString("writer");
//				String content = rs.getString("content");
//				Date regdate = rs.getDate("regdate");
//				int hit = rs.getInt("hit");
//				b = new BoardVO();
//				b.setNo(no);
//				b.setTitle(title);
//				b.setWriter(writer);
//				b.setContent(content);
//				b.setRegdate(regdate);
//				b.setHit(hit);
				
				b = new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), null,
								rs.getString(5), rs.getDate(6), rs.getInt(7));
			}
			
			ConnectionProvider.close(rs, pstmt, conn);
			
		} catch (Exception e) {
			System.out.println("예외 발생"+e.getMessage());
		}
		return b;
	}
	
	
	
	public ArrayList<BoardVO> findAll(){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "select * from board order by no";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String writer = rs.getString(3);
				String pwd = rs.getString(4);
				String content = rs.getString(5);
				Date regdate = rs.getDate(6);
				int hit = rs.getInt(7);
				
				BoardVO b = new BoardVO();
				b.setNo(no);
				b.setTitle(title);
				b.setWriter(writer);
				b.setPwd(pwd);
				b.setContent(content);
				b.setRegdate(regdate);
				b.setHit(hit);
				
				list.add(b);
				
			}
			
			ConnectionProvider.close(rs, stmt, conn);
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return list;
	}
	
	
	
	public int getNextNo() {
		int no = 0;
		String sql = "select nvl(max(no),0) + 1 from board";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				no = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return no;
	}
	
	public int insertBoard(BoardVO b) {
		int re = -1;
		String sql = "insert into board(no,title,writer,pwd,content,regdate,hit) values(?,?,?,?,?,sysdate,0)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt  = conn.prepareStatement(sql);
			pstmt.setInt(1, getNextNo());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
					
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return re;
	}
	
	

}






















