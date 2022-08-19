package lotto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class LottoTCPServer {

	public static void main(String[] args) {
		Random r = new Random();
		try {
			// 1. ServerSocket ����
			ServerSocket server = new ServerSocket(9000);

			// 2. Ŭ���̾�Ʈ�� ������ ���� ������ ���� ��� ����
			while (true) {
				// 4. Ŭ���̾�Ʈ�� ���� ����
				Socket socket = server.accept();
				System.out.println("** Ŭ���̾�Ʈ�� �����Ͽ����ϴ� **");

				// 5. �����͸� �ְ� ���� ��Ʈ�� ����
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				// 6. Ŭ���̾�Ʈ�� ������ �ְ� ����
				// ������ Ŭ���̾�Ʈ���� ���� ���� 6���� ����� �����ֵ��� ��
				for (int i = 1; i <= 6; i++) {
					// 0���� 100 ������ ����
					int n = r.nextInt(45);

					System.out.println("�������� �ζ� ��ȣ�� ��������ϴ�. : " + n);
					Thread.sleep(200);// 0.2���� ��� �ð�
					
					// ������� ������ Ŭ���̾�Ʈ���� ����
					os.write(n);

					

				}
				System.out.println("Ŭ���̾�Ʈ���� �����͸� ��� �����½��ϴ�.");
				
				// 7. ����ߴ� �ڿ��� �ݾ���
				is.close();
				os.close();
				server.close();

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �߻�: " + e.getMessage());
		}

	}

}
