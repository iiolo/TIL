package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServer {
	public static void main(String[] args) {
		
		//영어단어를 키로하고 한국어를 값으로 하는 map을 생성합니다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("watermelon", "수박");
		map.put("strawberry", "딸기");
		
		try {
			
			//TCP방식의 통신을 위하여 서버소켓을 생성합니다.
			ServerSocket server = new ServerSocket(9003);
			
			System.out.println("*** 서버가 가동되었습니다. *** ");
			
			//클라이언트가 보내오는 데이터를 받기 위한 배열을 만들어요
			byte []data = new byte[100];
			
			//클라이언트의 접속을 위하여 무한대기 상태에 있습니다.
			while(true) {
				
				//클라이언트의 접속을 수락합니다.
				Socket socket= server.accept();
				
				System.out.println("*** 클라이언트가 접속하였습니다.***");
				System.out.println("-----------------------------------------");
				
				//데이터를 주고 받기 위한 스트림을 생성합니다.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//클라이언트가 보내오는 데이터를 받기 위하여 무한루프를 표현합니다.
				while(true) {

					//클라이언트가 보내오는 데이터을 배열에 받아요
					is.read(data);
					
					//받아온 데이터가 담긴 배열을 갖고 문자열을 반들어요
					String eng = new String(data).trim();
					
					//수신된 문자열의 q!이면 종료합니다
					if(eng.equals("q!")) {
						break;
					}
					
					//영어사전이 담긴 맵으로 부터 영어단어를 키로하여 한국어를 뽑아옵니다.
					String kor = map.get(eng);
					
					//만약에 사전에 등록되어 있지 않으면 "없음"을 저장합니다.
					if(kor == null) {
						kor = "없음";
					}	
					
					//뽑아온 한국어를 클라이언트로 내 보냅니다.
					os.write(kor.getBytes());
					
					System.out.println(eng+"에 대한 번역 " + kor+"를 전송하였습니다.");
					
					//다음 데이터 수신을 위하여 배열을 비워줍니다.
					Arrays.fill(data, (byte)0);	
				}
				
				System.out.println("*** 클라이언트와 연결이 끊어 졌습니다.***");
				System.out.println("-----------------------------------------");
				
			}
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}













