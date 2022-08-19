package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServer {
	public static void main(String[] args) {
		
		//����ܾ Ű���ϰ� �ѱ�� ������ �ϴ� map�� �����մϴ�.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("grape", "����");
		map.put("watermelon", "����");
		map.put("strawberry", "����");
		
		try {
			
			//TCP����� ����� ���Ͽ� ���������� �����մϴ�.
			ServerSocket server = new ServerSocket(9003);
			
			System.out.println("*** ������ �����Ǿ����ϴ�. *** ");
			
			//Ŭ���̾�Ʈ�� �������� �����͸� �ޱ� ���� �迭�� ������
			byte []data = new byte[100];
			
			//Ŭ���̾�Ʈ�� ������ ���Ͽ� ���Ѵ�� ���¿� �ֽ��ϴ�.
			while(true) {
				
				//Ŭ���̾�Ʈ�� ������ �����մϴ�.
				Socket socket= server.accept();
				
				System.out.println("*** Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.***");
				System.out.println("-----------------------------------------");
				
				//�����͸� �ְ� �ޱ� ���� ��Ʈ���� �����մϴ�.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//Ŭ���̾�Ʈ�� �������� �����͸� �ޱ� ���Ͽ� ���ѷ����� ǥ���մϴ�.
				while(true) {

					//Ŭ���̾�Ʈ�� �������� �������� �迭�� �޾ƿ�
					is.read(data);
					
					//�޾ƿ� �����Ͱ� ��� �迭�� ���� ���ڿ��� �ݵ���
					String eng = new String(data).trim();
					
					//���ŵ� ���ڿ��� q!�̸� �����մϴ�
					if(eng.equals("q!")) {
						break;
					}
					
					//��������� ��� ������ ���� ����ܾ Ű���Ͽ� �ѱ�� �̾ƿɴϴ�.
					String kor = map.get(eng);
					
					//���࿡ ������ ��ϵǾ� ���� ������ "����"�� �����մϴ�.
					if(kor == null) {
						kor = "����";
					}	
					
					//�̾ƿ� �ѱ�� Ŭ���̾�Ʈ�� �� �����ϴ�.
					os.write(kor.getBytes());
					
					System.out.println(eng+"�� ���� ���� " + kor+"�� �����Ͽ����ϴ�.");
					
					//���� ������ ������ ���Ͽ� �迭�� ����ݴϴ�.
					Arrays.fill(data, (byte)0);	
				}
				
				System.out.println("*** Ŭ���̾�Ʈ�� ������ ���� �����ϴ�.***");
				System.out.println("-----------------------------------------");
				
			}
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}













