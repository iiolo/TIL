package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryClient {
	public static void main(String[] args) {
		try {
			//�������� ����� ��û�մϴ�.
			Socket socket = new Socket("211.238.142.98",9003);
			
			//�����͸� �ְ� �ޱ� ���� ��Ʈ���� �����մϴ�.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//Ű�����Է��� ���� ��ĳ�ʸ� �����մϴ�.
			Scanner sc = new Scanner(System.in);
			
			//����ܾ �Է¹ޱ� ���� ������ �����մϴ�.
			String eng;
			
			//�ѱ���� ������ �ܾ �����ϱ� ���� ������ �����մϴ�.
			String kor;
			
			//������ �����Ͽ� �������� �����͸� �ޱ� ���� �迭�� ������
			byte []data = new byte[100];
			
			
			//��ӽ����մϴ�.			
			while(true) {
				
				//����� ���� ������� �Է¹޾ƿ�
				System.out.print("����ܾ �Է��ϼ���");
				eng = sc.next();
				
				//�Է¹��� ����ܾ ������ �����ϴ�.
				os.write(eng.getBytes());
				
				//����, �Է¹��� ����ܾ� q!�̸� �����մϴ�.
				if(eng.equals("q!")) {
					break;
				}
				
				//������ �������� �ѱ���� ������ �����͸� �޾ƿɴϴ�.
				is.read(data);
				
				//�޾ƿ� �����Ͱ� �ִ� �迭�� ������ ���ڿ��� �������.
				kor = new String(data);
				
				//ȭ�鿡 ��� �մϴ�.
				System.out.println("������ ���� ���ŵ� �������: "+ kor);
				
				//���� ������ ������ ���Ͽ� �迭�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);
				
			}
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}

	}

}
