package exam03;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 인터넷 상의 문서 객체 생성
			URL url = new URL("https://hanbit.co.kr/store/books/new_book_list.html");
			
			//그 문서의 내용을 읽어들이기 위한 스트림 생성
			InputStream is = url.openStream();
			
			// 한 번에 읽어들일 byte형의 배열 생성
			
			byte []data = new byte[100];
			// 스트림을 통해 읽어온 문자열을 다 모아놓을 변수 생성
			String str = "";
			
			// 계속 반복 실행
			while (true) {
				// 스트림을 통해 데이터를 읽어들임
				int re = is.read(data);
				
				// 더이상 읽어들일 것이 없으면 반복문 탈출
				if (re == -1) {
					break;
				}
				// 읽어들인 데이터를 문자열로 만들어 누적
				str = str + new String(data, "utf-8");
				
				// 다시 읽어들이기 위해서 배열을 비워줌(안그러면 예전에 불러온 쓰레기 글자가 같이 나옴)
				// 배열을 비워주기 위하여 0으로 채운다.
				Arrays.fill(data, (byte)0);
			}
			// 누적된 전체 문자열 출력
			System.out.println(str);
			
			// 사용이 끝난 문자열 닫기
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
