package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPReceiver {
	public static void main(String[] args) {
		try {
			// 데이터를 주고 받기 위한 소켓 객체 생성
			DatagramSocket socket = new DatagramSocket(9001);

			// 실제 데이터가담길 배열 생성
			byte[] data = new byte[100];

			// 수신된 데이터를 받기 위한 데이터그램 패킷 생성
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			System.out.println("*** 데이터를 수신할 준비가 되었습니다. ***");
			System.out.println("-------------------------------------------");
			// 데이터를 계속해서 받기 위해 무한 대기 상태
			while (true) {
				// 수신된 데이터 받기
				socket.receive(packet);

				// 패킷을 만들 때 데이터를 담으려고 한 byte 배열인 data를 문자열로 만들기
				String msg = new String(data);

				// 수신된 문자열 화면에 출력
				System.out.println("수신된 데이터: " + msg.trim());
				
				// 다음 데이터를 위하여 배열 초기화 
				Arrays.fill(data, (byte)0);
			}

		} catch (Exception e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
}
