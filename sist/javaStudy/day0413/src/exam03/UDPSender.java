package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// 프로그램 실행 시에 전달받는 것은 첫 번째는 데이터를 수신하는 컴퓨터에 ip 주소입니다.
			String ip = args[0];

			// 프로그램 실행 시에 전달받는 두 번째는 약속한 포트번호이다.
			int port =Integer.parseInt(args[1]);

			// 프로그램 실행 시에 전달받는 세 번째는 전달할 내용이다.
			String msg = args[2];

			// 전달할 내용을 byte로 변환
			byte[] data = msg.getBytes();

			// ip 주소를 갖고 InetAddress 객체 생성
			InetAddress addr = InetAddress.getByName(ip);

			// UDP 방식의 데이터 전송 단위인 패킷 생성
			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);
			
			
			// 데이터를 전송하기 위한데이터 그램 소켓 객체 생성
			DatagramSocket socket = new DatagramSocket();

			// 데이터 전송
			socket.send(packet);

			// 사용했던 자원 닫음
			socket.close();
		} catch (Exception e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}

}
