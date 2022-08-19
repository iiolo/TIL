package exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// ���α׷� ���� �ÿ� ���޹޴� ���� ù ��°�� �����͸� �����ϴ� ��ǻ�Ϳ� ip �ּ��Դϴ�.
			String ip = args[0];

			// ���α׷� ���� �ÿ� ���޹޴� �� ��°�� ����� ��Ʈ��ȣ�̴�.
			int port =Integer.parseInt(args[1]);

			// ���α׷� ���� �ÿ� ���޹޴� �� ��°�� ������ �����̴�.
			String msg = args[2];

			// ������ ������ byte�� ��ȯ
			byte[] data = msg.getBytes();

			// ip �ּҸ� ���� InetAddress ��ü ����
			InetAddress addr = InetAddress.getByName(ip);

			// UDP ����� ������ ���� ������ ��Ŷ ����
			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);
			
			
			// �����͸� �����ϱ� ���ѵ����� �׷� ���� ��ü ����
			DatagramSocket socket = new DatagramSocket();

			// ������ ����
			socket.send(packet);

			// ����ߴ� �ڿ� ����
			socket.close();
		} catch (Exception e) {
			System.out.println("���� �߻�: " + e.getMessage());
		}
	}

}
