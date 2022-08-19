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
			// 1. ServerSocket 생성
			ServerSocket server = new ServerSocket(9000);

			// 2. 클라이언트의 접속이 있을 때까지 무한 대기 상태
			while (true) {
				// 4. 클라이언트의 접속 수락
				Socket socket = server.accept();
				System.out.println("** 클라이언트가 연결하였습니다 **");

				// 5. 데이터를 주고 받을 스트림 생성
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				// 6. 클라이언트와 데이터 주고 받음
				// 연결한 클라이언트한테 정수 난수 6개를 만들어 보내주도록 함
				for (int i = 1; i <= 6; i++) {
					// 0에서 100 사이의 난수
					int n = r.nextInt(45);

					System.out.println("서버에서 로또 번호를 만들었습니다. : " + n);
					Thread.sleep(200);// 0.2초의 대기 시간
					
					// 만들어진 난수를 클라이언트에게 보냄
					os.write(n);

					

				}
				System.out.println("클라이언트에게 데이터를 모두 내보냈습니다.");
				
				// 7. 사용했던 자원을 닫아줌
				is.close();
				os.close();
				server.close();

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 발생: " + e.getMessage());
		}

	}

}
