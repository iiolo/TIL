package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryClientUDP {
	public static void main(String[] args) {
		try {
			//UDP����� �����͸� �ְ� ���� �����ͱ׷����� ��ü�� �����մϴ�.
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("*** Ŭ���̾�Ʈ�� �غ�Ǿ����ϴ�. *** ");
			
			//Ű���� �Է��� ���� ��ĳ�ʰ�ü�� �����մϴ�.
			Scanner sc = new Scanner(System.in);
			
			//����ڷ� ���� ����ܾ� �Է��� ���� ������ ����
			String eng;
			
			//������ ���� �����Ǿ� ���ŵ� �ѱ�� �����ϱ� ���� ������ ����
			String kor;
			
			//UDP����� ������ ���۴����� �����ͱ׷���Ŷ ������ �����մϴ�.
			DatagramPacket packet = null;
			
			
			//���ŵ� �����͸� �����ϱ� ���� �迭�� ����
			byte []data = new byte[100];
			
			//������ ���� ������ �ѱ�� �����ϱ� ���� �����͸� ���� ��Ŷ�� �����մϴ�.
			DatagramPacket rePacket = new DatagramPacket(data, data.length);
						
			//��Ŷ�� ������ ���� �ʿ��� InetAddress��ü�� �����մϴ�.
			InetAddress addr = InetAddress.getByName("211.238.142.98");
			
			//��Ŷ�� ������ ���� �ʿ��� ��Ʈ��ȣ�� ������ �����մϴ�.
			int port = 9004;
			
			//��� �ݺ��Ͽ� �����մϴ�.
			while(true) {
				
				//��������� ������ ����ܾ �Է¹޾ƿ�
				System.out.print("������ ����ܾ �Է�==>");
				eng = sc.next();
				
				//�Է¹��� ����ܾ��, ������ �ּ�, ��Ʈ��ȣ�� ����
				//UDP����� ������ ���۴����� ��Ŷ�� �����մϴ�.
				packet = new DatagramPacket(eng.getBytes(), 
												eng.getBytes().length, 
												addr,
												port);
				
				//������ ��Ŷ�� ������ �����ϴ�.
				socket.send(packet);
				
				//����, �Է��� ����ܾ "q!" �̸� �����մϴ�.
				if(eng.equals("q!")) {
					break;
				}
				
				//������ ������ �ѱ�� �����մϴ�.
				socket.receive(rePacket);
				
				//���ŵ� �����Ͱ� ��� �迭�� ���� ���ڿ��� �����մϴ�.
				kor = new String(data);
				
				//������ �ѱ�� ����մϴ�.
				System.out.println("������ ���� �����Ͽ� ������ ������ : " + kor);
				
				//���� ������ ������ ���Ͽ� �迭�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);
				
			}
			
			System.out.println("*** �����Ͽ����ϴ� *** ");
			socket.close();
			
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}
