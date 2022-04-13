package lotto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LottoTCPClient {

	public static void main(String[] args) {
		try {
			// 3. �������� ����� ��û�Ѵ�.
			Socket socket = new Socket("211.238.142.101", 9000);

			// 5. �����͸� �ְ� ���� ��Ʈ�� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 6. ������ ������ �ְ� ����
			System.out.print("�ζ� ��ȣ: ");
			for (int i = 1; i <= 6; i++) {
				int n = is.read();
				System.out.print(n+ " ");
				Thread.sleep(200);
				
			}
			// 7. ����ߴ� �ڿ��� �ݾ���
			is.close();
			os.close();
			socket.close();

		} catch (Exception e) {
			System.out.println("���� �߻�: " + e.getMessage());
		}

	}

}
