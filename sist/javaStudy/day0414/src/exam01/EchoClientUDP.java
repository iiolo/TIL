package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClientUDP {
	public static void main(String[] args) {
		try {
			
			//UDP��Ŀ����� �����͸� �ְ� �޴� ������ �����ͱ׷���Ŷ�Դϴ�.
			//���ŵ� �����͸� ���� �� �ʿ��� �迭�� ������.
			byte []data = new byte[100];
			
			//�����͸������� ���� �����ͱ׷���Ŷ�� ���鶧�� �ʿ��� InetAddress��ü�� �����մϴ�.
			InetAddress addr= InetAddress.getByName("211.238.142.98");

			//��Ʈ��ȣ�� ������ �����մϴ�.
			int port = 9002;
			
			//UDP��Ŀ��� �����͸� �ְ� �޴� �޼ҵ带 ���� �ִ� �����ͱ׷������� �����մϴ�.
			DatagramSocket socket = new DatagramSocket();
			
			//UDP��Ŀ��� �����͸� �ְ� �޴� ������ �����ͱ׷���Ŷ ������ �����մϴ�.
			DatagramPacket packet = null;
			
			//������ �޾Ƹ��ϴ� �����͸� �ޱ� ���� ��Ŷ�� ������
			DatagramPacket rePacket = new DatagramPacket(data, data.length);
			
			//������ �������� �ϴ� ���ڿ��� �Է¹ޱ� ���� ������ �����մϴ�.
			String msg;

			//Ű����� ���� �Է¹ޱ� ���Ͽ� ��ĳ�ʸ� �����մϴ�.
			Scanner sc = new Scanner(System.in);
			
			//����Ͽ� �����մϴ�.
			while(true) {
				
				//Ű����� ���� ������ ���� ���ڿ��� �Է��մϴ�.
				System.out.print("������ ���� ���ڿ��� �Է�==>");
				msg = sc.next();
				
				//����, �Է��� ���ڿ��� q!��� �����մϴ�.
				if(msg.equals("q!")) {
					break;
				}
				
				//�Է��� ���ڿ�, �������� �ּ�, ��Ʈ��ȣ�� ���� 
				//UDP������� �����͸� ������ ���� ������
				//�����ͱ׷���Ŷ ��ü�� �����մϴ�.
				packet = 
						new DatagramPacket(msg.getBytes(), msg.getBytes().length, 
								addr, port);
				
				//UDP������� �����͸� ������ ���� ��ü��
				//�����ͱ׷������� ���� �����͸� �����ϴ�.
				socket.send(packet);
				
				//������ �޾Ƹ� �ϴ� �����͸� �޾ƿɴϴ�.
				socket.receive(rePacket);
				
				System.out.println("������ ���� �ٽ� �޾Ƹ��� ������:"+new String(data).trim());
				
				//���� ������ ������ ���Ͽ� �迭�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);
				
			}
			
			//����ߴ� �ڿ��� �ݾ� �ݴϴ�.
			socket.close();
			System.out.println("***  �����Ͽ����ϴ�. *** ");
			
			
			
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}
