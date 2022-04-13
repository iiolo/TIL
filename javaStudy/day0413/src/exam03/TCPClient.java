package exam03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			// 3. 서버에게 통신을 요청한다.
			Socket socket = new Socket("211.238.142.101", 9000);

			// 5. 데이터를 주고 받을 스트림 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 6. 서버와 데이터 주고 받음
			for (int i = 1; i <= 10; i++) {
				int n = is.read();
				System.out.println("서버로부터 수신된 데이터: "+n);
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
