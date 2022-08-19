package exam03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

//한명의 클라이언트를 상대하여 대화할 쓰레드를 만들어요
class ServerThread extends Thread{
	
	//연결한 클라이언트와 통신할 소켓을 맴버변수로 가져요
	Socket socket;
	
	//데이터를 주고 받을 스트림을 맴버변수로 가져요
	InputStream is;
	OutputStream os;
	
	//수신된 데이터를 받기 위한 배열을 만들어요
	byte []data = new byte[100];
	
	//생성시에 소켓을 전달받아서 스트림을 생성합니다.
	public ServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	//스레드가 해야 하는 일은 run을 오버라이딩 하여 작성합니다.
	public void run() {
		
		//계속 귀를 열고 클라이언트가 보내오는 데이터를 받아요
		while(true) {
			try {
				
				//나와 연결된 클라이언트가 보내오는 데이터를 받아요
				is.read(data);
				
				//연결된 모든 클라이어틀에게 방송하는 메소드를 호출해요
				sendAll(data);
				
				//다음 데이터 수신을 위하여 배여을 비워줍니다.
				Arrays.fill(data, (byte)0);
				
			}catch (Exception e) {
				System.out.println("예외발생:"+e.getMessage());
			}
		}
	}
	
	
	//모든 연결된 클라이언트들 한테 방송하기 위한 메소드를 정의
	public void sendAll(byte []data) throws Exception{
		
		// 리스트에 담긴 객체를 하나씩 뽑아오면
		// 연결한 클라이언트와 일대일로 상대하는 쓰레드객체입니다.
		// 리스트에 담긴 수 만큼 반복실행니다.
		for(ServerThread st  :ChatServer.list) {
			
			//스레드객체의 출력스트림을 통하여 데이터를 내 봅니다.
			st.os.write(data);
		}
	}
	
}


public class ChatServer {
	//연결된 클라이어트를 상대할 쓰레드들을 모아 놓을 리스트를 만들어요.
	//객체와 무관하게 사용하도록 static으로 만들어요.
	public static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
		
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("*** 서버가 가동되었습니다. ***");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 연결하였습니다.");
				System.out.println("-----------------------------------------------");
				
				//연결한 클라이언트를 상대할 쓰레드를 생성합니다.
				ServerThread thread = new ServerThread(socket);
				
				//클라이어와 계속하여 통신을 수행하는 쓰레드 객체를 리스트에 담아요
				list.add(thread);
				
				//클라이언트와 계속하여 대화를 이어가도록 쓰레드를 가동시킵니다.
				thread.start();
					
			}
			
		}catch (Exception e) {

		}
	}

}
