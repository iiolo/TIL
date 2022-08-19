package lotto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LottoTCPClient {

	public static void main(String[] args) {
		try {
			// 3. 서버에게 통신을 요청한다.
			Socket socket = new Socket("211.238.142.101", 9000);

			// 5. 데이터를 주고 받을 스트림 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 6. 서버와 데이터 주고 받음
			System.out.print("로또 번호: ");
			for (int i = 1; i <= 6; i++) {
				int n = is.read();
				System.out.print(n+ " ");
				Thread.sleep(200);
				
			}
			// 7. 사용했던 자원을 닫아줌
			is.close();
			os.close();
			socket.close();

		} catch (Exception e) {
			System.out.println("예외 발생: " + e.getMessage());
		}

	}

}
