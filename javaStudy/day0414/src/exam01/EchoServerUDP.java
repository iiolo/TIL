package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class EchoServerUDP {
	public static void main(String[] args) {
		try {
			//UDP��Ŀ��� �����͸� �ְ� �ޱ� ���ؼ��� �����ͱ׷������� �̿��մϴ�.
			DatagramSocket socket = new DatagramSocket(9002);
			
			//�����͸� ���� �迭�� ������
			byte []data = new byte[100];
			
			//UDP ��Ŀ��� �����͸� �ְ� �޴� ������ �����ͱ׷� ��Ŷ�� �����մϴ�.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//��ӵ����մϴ�.
			while(true) {
				
				//UDP��Ŀ��� �����͸� �ְ� �޴� ����� ���� �ִ� �����ͱ׷����� ��ü�� ���Ͽ� 
				//�����͸� �޾ƿ�
				socket.receive(packet);
				
				//���������͸� �״�� �޾Ƹ� �մϴ�.				
				socket.send(packet);
								
				//������ ���ڿ��� q!�̸� �����մϴ�.
				String msg = new String(data).trim();
				if(msg.equals("q!")) {
					break;
				}
				
				System.out.println("Ŭ���̾�Ʈ�� ���� ���ŵ� ������:" + msg);
				
				//���������� ������ ���Ͽ� �迭�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);
				
			}
			
			//����ߴ� �ڿ��� �ݾ��ݴϴ�.
			socket.close();
			
			
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}










