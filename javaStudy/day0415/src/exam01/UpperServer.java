package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ServerThread extends Thread{
	
	//클라이언트와 통신할 소켓를 맴버로 가져요
	Socket socket;
	
	//입출력을 위한 스트림을 맴버로 가져요
	InputStream is;
	OutputStream os;
	
	//생성시에 요청한 클라이언트와 통신할 소켓을 전달받아요
	public ServerThread(Socket socket) {
		this.socket = socket;
		try {
			
			//7. 데이터를 주고 받을 스트림을 생성합니다.
			is = this.socket.getInputStream();
			os = this.socket.getOutputStream();
			
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	//계속하여 통신을 메소드는 run을 오버라잉하여 그안에 내용을 써 줍니다.
	public void run() {
		
		//클라이언트가 보내오는 문장을 받기위한 배열을 만들어요
		byte []data = new byte[200];
		
		//클라이언트가 보내는 문장을 저장하기 위한 문자열 변수를 선언해요
		String str;
		
		//대문자로 변환해서 담을 변수를 선언해요
		String upperStr;
		
		//계속실행합니다.
		while(true) {
			
			try {
				//클라이언트가 보내오는 영어문장을 받아요
				is.read(data);
				
				//받아온 데이터를 문자열로 만들어요
				str = new String(data);
				System.out.println("클라이언트가 전송한 텍스트:"+str);
				
				//받아온 문자열을 대문자로 변경합니다.
				upperStr = str.toUpperCase();
				
				//대문자로 변경된 데이터를 클라이언트로 내 보냅니다.
				os.write(upperStr.getBytes());
				System.out.println("클라이언트로 보낸 텍스트:"+upperStr);
				
				//다음 데이터 수신을 위하여 배열을 비워줍니다.
				Arrays.fill(data, (byte)0);
			
			}catch (Exception e) {
				System.out.println("예외발생:"+e.getMessage());
			}
			
		}
	}
}



public class UpperServer {
	public static void main(String[] args) {
		
		System.out.println("서버 프로그램입니다.");
		try {
			//1. TCP방식의 통신을 위하여 서버소켓을 생성합니다.
			ServerSocket server = new ServerSocket(9006);
			
			//2. 클라이언트의 접속을 위하여 무한대기상태에 있어요
			while(true) {
				
				//4. 클라이언트의 접속을 수락합니다.
				//		accept메소드는 요청한 클라이언트와 통신을 위한 소켓을 반환합니다.
				Socket socket = server.accept();
				
				System.out.println("연결되었습니다.");
				
				
				//5. 요청한 클라이언트를 상태를 쓰레드를 생성합니다.
				Thread t = new ServerThread(socket);
				
				//6. 쓰레드를 가동합니다.
				t.start();
			}
			
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
	}
}
