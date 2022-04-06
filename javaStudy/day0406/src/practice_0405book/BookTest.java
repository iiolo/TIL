package practice_0405book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	
	public static Scanner sc;
	 
	//반복문안에서 메뉴를 출력하기 위한 메소드를 만들어요.
	public static void printMenu() {
		System.out.println("===========================================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("===========================================");
		System.out.print("번호를 입력하시오: ");
	}
	
	public static void main(String[] args) {
		//Book []bookList = new Book[100];
		sc = new Scanner(System.in);  //스캐너를 생성
		
		ArrayList<Book> list = new ArrayList<Book>();
		//도서의 정보를 담을 리스틀 생성합니다.
		
		int menu;
		//메뉴를 입력하기 위한 변수를 선언합니다.
		
		//종료를 위한 메뉴 4를 입력하지 않는 한 계속 실행합니다.
		while(true) {
			printMenu();//메뉴를 출력합니다.
			menu = sc.nextInt();//메뉴를 입력합니다.
			if(menu == 4) {//입력한 메뉴가 4이면 반복문을
				break;		//탈출합니다.
			}		
			switch(menu) {	//선택한 메뉴에 따라서
				case 1:insertBook(list);break;//메뉴가 1이라면 도서를 등록하기 위한 메소드를 호출합니다.
				case 2:searchBook(list);break;//메뉴가 2이라면 도서를 검색하기 위한 메소드를 호출합니다.
				case 3:printBook(list);break;//메뉴가 3이라면 모든도서를 출력하기 위한 메소드를 호출합니다.
			}
		}
		
		System.out.println("*** 프로그램을 종료하였습니다. *** ");
		//메뉴에 4를 입력하여 반복문을 탈출했으면 프로그램 종료 하였다고 출력합니다.
	}

	//도서를 등록하기 위한 메소드
	public static void insertBook(ArrayList<Book> list) {
		String title;	//등록할 도서의 이름을 저장하기 위한 변수
		int score;		//등록할 도서의 평점을 저장하기 위한 변수
		
		//도서의 제목을 입력
		System.out.print("제목:");
		title = sc.next();
		
		//도서의 평점을 입력
		System.out.print("평점:");
		score = sc.nextInt();
		
		//도서이름과 평점을 맴버변수 갖는 Book객체를 생성
		Book book = new Book(title, score);
		
		//생성한 Book을 리스트에 담아요
		list.add(book);
		
		//등록했다고 메세지를 출력
		System.out.println("도서의 평점을 등록하였습니다.");
	}
		
	//모든 도서를 출력하기 위한 메소드
	public static void printBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
//		for(int i=0; i<list.size(); i++) {
		for(int i=0; i<Book.count; i++) {   //리스트에 담긴 도서의 수 만큼 반복 실해아여 
			System.out.println(list.get(i));	//도서를 하나씩 꺼집어 내어와서 출력
		}
	}

	//도서를 검색하기 위한 메소드
	public static void searchBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		
		String title; 			//검색할 도서명을 입력하기 위한 변수
		int score = -1;			//검색한 도서의 평점을 저장하기 위한 변수
		
		//찾을 도서명을 입력
		System.out.print("찾고자 하는 도서명을 입력==>");
		title = sc.next();
		
		for(int i=0; i<Book.count; i++) { //리스트에 담긴 도서의 수 만큼 반복 실행하여 
			Book b = list.get(i);		//도서를 하나씩 꺼집어 내어와서 b에 저장	
			if(b.title.equals(title)) {	//꺼집어 내어온 b의 도서명과 찾을 도서명이 일치하다면
				score = b.score;		//그 평점을 변수에 저장
			}
		}
		//만약 찾을 도서명이 리스트에 존재하지 않는다면
		//score는 -1을 유지하고 있어요!
		
		
		if(score != -1) {  // 찾는 도서가 리스트에 있었다면
			System.out.println(title+"도서의 평점은 "+score+"입니다.");//평점을 출력
		}else {			   // 찾는도서가 리스트에 없다면
			System.out.println(title+"도서의 평점은 없습니다.");	// 없다고 출력
		}
	}
}