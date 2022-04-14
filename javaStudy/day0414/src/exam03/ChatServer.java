package exam03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

//�Ѹ��� Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� �����带 ������
class ServerThread extends Thread{
	
	//������ Ŭ���̾�Ʈ�� ����� ������ �ɹ������� ������
	Socket socket;
	
	//�����͸� �ְ� ���� ��Ʈ���� �ɹ������� ������
	InputStream is;
	OutputStream os;
	
	//���ŵ� �����͸� �ޱ� ���� �迭�� ������
	byte []data = new byte[100];
	
	//�����ÿ� ������ ���޹޾Ƽ� ��Ʈ���� �����մϴ�.
	public ServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
	
	//�����尡 �ؾ� �ϴ� ���� run�� �������̵� �Ͽ� �ۼ��մϴ�.
	public void run() {
		
		//��� �͸� ���� Ŭ���̾�Ʈ�� �������� �����͸� �޾ƿ�
		while(true) {
			try {
				
				//���� ����� Ŭ���̾�Ʈ�� �������� �����͸� �޾ƿ�
				is.read(data);
				
				//����� ��� Ŭ���̾�Ʋ���� ����ϴ� �޼ҵ带 ȣ���ؿ�
				sendAll(data);
				
				//���� ������ ������ ���Ͽ� �迩�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);
				
			}catch (Exception e) {
				System.out.println("���ܹ߻�:"+e.getMessage());
			}
		}
	}
	
	
	//��� ����� Ŭ���̾�Ʈ�� ���� ����ϱ� ���� �޼ҵ带 ����
	public void sendAll(byte []data) throws Exception{
		
		// ����Ʈ�� ��� ��ü�� �ϳ��� �̾ƿ���
		// ������ Ŭ���̾�Ʈ�� �ϴ��Ϸ� ����ϴ� �����尴ü�Դϴ�.
		// ����Ʈ�� ��� �� ��ŭ �ݺ�����ϴ�.
		for(ServerThread st  :ChatServer.list) {
			
			//�����尴ü�� ��½�Ʈ���� ���Ͽ� �����͸� �� ���ϴ�.
			st.os.write(data);
		}
	}
	
}


public class ChatServer {
	//����� Ŭ���̾�Ʈ�� ����� ��������� ��� ���� ����Ʈ�� ������.
	//��ü�� �����ϰ� ����ϵ��� static���� ������.
	public static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
		
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("*** ������ �����Ǿ����ϴ�. ***");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				System.out.println("-----------------------------------------------");
				
				//������ Ŭ���̾�Ʈ�� ����� �����带 �����մϴ�.
				ServerThread thread = new ServerThread(socket);
				
				//Ŭ���̾�� ����Ͽ� ����� �����ϴ� ������ ��ü�� ����Ʈ�� ��ƿ�
				list.add(thread);
				
				//Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� �̾���� �����带 ������ŵ�ϴ�.
				thread.start();
					
			}
			
		}catch (Exception e) {

		}
	}

}
