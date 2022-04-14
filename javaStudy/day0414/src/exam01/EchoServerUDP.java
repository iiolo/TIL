package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class EchoServerUDP {
	public static void main(String[] args) {
		try {
			//UDP방식에서 데이터를 주고 받기 위해서는 데이터그램소켓을 이용합니다.
			DatagramSocket socket = new DatagramSocket(9002);
			
			//데이터를 담을 배열을 만들어요
			byte []data = new byte[100];
			
			//UDP 방식에서 데이터를 주고 받는 단위인 데이터그램 패킷을 생성합니다.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//계속동작합니다.
			while(true) {
				
				//UDP방식에서 데이터를 주고 받는 기능을 갖고 있는 데이터그램소켓 객체를 통하여 
				//데이터를 받아요
				socket.receive(packet);
				
				//받은데이터를 그대로 메아리 합니다.				
				socket.send(packet);
								
				//수신한 문자열이 q!이면 종료합니다.
				String msg = new String(data).trim();
				if(msg.equals("q!")) {
					break;
				}
				
				System.out.println("클라이언트로 부터 수신된 데이터:" + msg);
				
				//다음데이터 수신을 위하여 배열을 비워줍니다.
				Arrays.fill(data, (byte)0);
				
			}
			
			//사용했던 자원을 닫아줍니다.
			socket.close();
			
			
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}










