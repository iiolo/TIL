package com.sist.book;

import java.util.ArrayList;
import java.util.Scanner;

import com.sist.dao.BookDAO;
import com.sist.vo.BookVO;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//출판사 입력을 위하여 변수 선언
		String publisher;
		
		//출판사를 입력
		System.out.print("출판사를 입력하시오==>");
		publisher = sc.next();
			
		//해당출력사의 책 내역을 검색하기 위하여 BookDAO객체를 생성합니다.
		BookDAO dao = new BookDAO();
		
		//dao의 메소드를 호출하여 해당 출판사의 책 내역 가져옴
		ArrayList<BookVO> list = dao.listBook(publisher);
		
		//제목을 출력합니다.
		System.out.println("도서번호\t"
				+ "도서이름\t\t"
				+ "출판사\t"
				+ "가격"
				);
		
		//리스트만큼 반복실행 하여 책 내역 출력
		for (BookVO vo : list) {
			System.out.println(vo.getBookid()+"\t"
								+vo.getBookname()+"\t"
								+vo.getPublisher()+"\t"
								+vo.getPrice());
		}
		
		
		
		

	}

}










