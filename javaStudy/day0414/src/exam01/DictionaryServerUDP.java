package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServerUDP {
	public static void main(String[] args) {
		//����ܾ Ű���ϰ� �ѱ�� ������ �ϴ� map�� �����մϴ�.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("grape", "����");
		map.put("watermelon", "����");
		map.put("strawberry", "����");
		
		try {
			//UDP����� �����͸� �ְ� ���� �����ͱ׷����� ��ü�� �����մϴ�.
			DatagramSocket socket = new DatagramSocket(9004);
			
			System.out.println("*** ������ �غ�Ǿ����ϴ� ***");
			
			//��Ŷ������ �ʿ��� �迭�� ������
			byte []data = new byte[100];
			
			//UDP����� ������ ���۴����� ��Ŷ�� �����մϴ�.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//������ ������ ������ ���� ��Ŷ������ �����ؿ�
			DatagramPacket rePacket = null;
			
			//Ŭ���̾�Ʈ�� ���� ���� �����͸� ����ؼ� �ޱ� ���Ͽ� ���ѷ����� ǥ���մϴ�.
			while(true) {
				
				//Ŭ���̾�Ʈ�� ���� �����͸� �޾ƿ�
				socket.receive(packet);
				
				//���ŵ� �����Ͱ� ��� �迭�� ���� ���ڿ��� �����մϴ�.
				String eng = new String(data).trim();
				
				System.out.println("Ŭ���̾�Ʈ�� ���� ���ŵ� ������:"+eng);
				
				//���� ���ŵ� ���ڿ��� q!��� �����մϴ�.
				if(eng.equals("q!")) {
					break;
				}
				
				//eng�� key�� �Ͽ� map���� �ѱ�� �̾ƿɴϴ�.
				String kor = map.get(eng);
				
				//���� ������ ��ϵ� �ܾ �ƴϸ� "����"�� �����մϴ�.
				if(kor == null) {
					kor = "����";
				}
				
				//������ ����Ÿ kor�� ������ ���ؼ� �����ͱ׷���Ŷ�� �ʿ��մϴ�.
				//�̹� ���� �ִ� Ŭ���̾�Ʈ�� ���� ������ ���� ������ ��Ŷ�� ����Ϸ��� �մϴ�.
				//�� ��Ŷ�ȿ��� �̹� ������ �ּҿ�, ��Ʈ��ȣ�� �־��
				//�����͸� ���� ����� �˴ϴ�.
				//��ó�� ���� �����Ϳ� ���� ������ �ǰ�, ���� �����͸� ������ ���ؿ�.
				//�� ���������� ��Ŷ�� ���� ������!
				
				//�����͸� ������ ���� ������ �ּҸ� ������ ��Ŷ���κ��� �޾� �ɴϴ�.
				InetAddress reAddr = packet.getAddress();
				
				//�����͸� ������ ���� �������� port��ȣ�� �޾� �ɴϴ�.
				int rePort = packet.getPort();
				
				//������ �����͸� �����ϱ� ���� ��Ŷ�� �����մϴ�.
				rePacket = new DatagramPacket(kor.getBytes(), 
						kor.getBytes().length, 
						reAddr, rePort);				
				
				//������ �����͸� Ŭ���̾�Ʈ���� �� �����ϴ�.
				socket.send(rePacket);
								
				//���������� ������ ���Ͽ� �迭�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);				
				
			}
			
			socket.close();
			System.out.println(" *** �����Ͽ����ϴ�. *** ");
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}













