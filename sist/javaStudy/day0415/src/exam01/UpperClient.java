package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class UpperClient {

	public static void main(String[] args) {
		
		System.out.println("클라이언트 프로그램입니다.");
		try {
			//키보드로 입력하기 위하여 스캐너를 생성합니다.
			Scanner sc = new Scanner(System.in);
			
			//입력받을 변수를 선언합니다.
			String str;
			
			//서버가 대문자로 변환하여 보내주는 문자열을 저장하기 위한 변수를 선언
			String upperStr;
			
			//서버가 보내오는 데이터를 받기 위한 배열을 선언합니다.
			byte []data = new byte[200];
			
			//3. 서버한테 통신을 요청합니다.
			Socket socket = new Socket("211.238.142.98", 9006);
			
			//7. 데이터를 주고 받을 스트림을 생성합니다.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//8. 계속실행합니다.
			while(true) {
				
				//9. 사용자 한테 영어단어를 입력받아요
				System.out.print("영어 문장을 입력하세요==>");
				str = sc.nextLine();
				
				System.out.println("서버로 전송할 텍스트:"+str);
								
				//10. 입력받은 문장을 서버로 보냅니다
				os.write(str.getBytes());
								
				//11. 서버가 대문자로 변환하는 보내주는 데이터를 받아요
				is.read(data);
				
				//12. 받아온 데이터를 문자열로 만들어요
				upperStr = new String(data);
				
				//13. 화면에 출력합니다.
				System.out.println("서버에서 전송된 텍스트:"+upperStr);
				
				//다음 데이터 수신을 위하여 배열을 비워줍니다.
				Arrays.fill(data, (byte)0);
				
			}
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}

	}

}





