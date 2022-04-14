package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServerUDP {
	public static void main(String[] args) {
		//영어단어를 키로하고 한국어를 값으로 하는 map을 생성합니다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("watermelon", "수박");
		map.put("strawberry", "딸기");
		
		try {
			//UDP방식의 데이터를 주고 받을 데이터그램소켓 객체를 생성합니다.
			DatagramSocket socket = new DatagramSocket(9004);
			
			System.out.println("*** 서버가 준비되었습니다 ***");
			
			//패킷생성에 필요한 배열을 만들어요
			byte []data = new byte[100];
			
			//UDP방식의 데이터 전송단위인 패킷을 생성합니다.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//번역된 데이터 전송을 위한 패킷변수를 선언해요
			DatagramPacket rePacket = null;
			
			//클라이언트로 부터 오는 데이터를 계속해서 받기 위하여 무한루프를 표현합니다.
			while(true) {
				
				//클라이언트로 부터 데이터를 받아요
				socket.receive(packet);
				
				//수신된 데이터가 담긴 배열을 갖고 문자열을 생성합니다.
				String eng = new String(data).trim();
				
				System.out.println("클라이언트로 부터 수신된 데이터:"+eng);
				
				//만약 수신된 문자열이 q!라면 종료합니다.
				if(eng.equals("q!")) {
					break;
				}
				
				//eng를 key로 하여 map에서 한국어를 뽑아옵니다.
				String kor = map.get(eng);
				
				//만약 사전에 등록된 단어가 아니면 "없음"을 저장합니다.
				if(kor == null) {
					kor = "없음";
				}
				
				//번역된 데이타 kor를 보내기 위해서 데이터그램패킷이 필요합니다.
				//이미 갖고 있는 클라이언트로 부터 수신을 위해 만들어둔 패킷을 사용하려고 합니다.
				//그 패킷안에는 이미 목적지 주소와, 포트번호도 있어요
				//데이터만 갈아 끼우면 됩니다.
				//맨처음 받은 데이터에 대한 응답이 되고, 다음 데이터를 수신을 못해요.
				//내 보내기위한 패킷을 따로 만들어요!
				
				//데이터를 보내기 위한 목적지 주소를 수신한 패킷으로부터 받아 옵니다.
				InetAddress reAddr = packet.getAddress();
				
				//데이터를 보내기 위한 목적지의 port번호도 받아 옵니다.
				int rePort = packet.getPort();
				
				//번역된 데이터를 전송하기 위한 패킷을 생성합니다.
				rePacket = new DatagramPacket(kor.getBytes(), 
						kor.getBytes().length, 
						reAddr, rePort);				
				
				//번역된 데이터를 클라이언트에게 내 보냅니다.
				socket.send(rePacket);
								
				//다음데이터 수신을 위하여 배열을 비워줍니다.
				Arrays.fill(data, (byte)0);				
				
			}
			
			socket.close();
			System.out.println(" *** 종료하였습니다. *** ");
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}













