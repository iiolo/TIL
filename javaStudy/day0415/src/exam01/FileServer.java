package exam01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer extends JFrame {
	
	//두개의 배열을 매개변수로 전달받아 하나로 합쳐서 새로운 배열을 반환하는 메소드를 정의
	public static byte[] addArray(byte []a, byte []b) {
		byte []r = new byte[a.length + b.length];
		
		//a배열의 요소를 r에 넣어 줍니다.
		//a배열의 인덱스와 새로합칠 배열의 인덱스는 달라야 합니다.
		//새로 합칠 배열의 인덱스를 선언합니다
		int k = 0;
		for(int i=0; i<a.length; i++) {
			r[k++] = a[i];
		}
		
		//b배열의 모든 요소를 r에 담아 줍니다.
		for(int i=0; i<b.length; i++) {
			r[k++]=b[i];
		}
		return r;
	}
	
	
	
	//통신을 위하여 서버소켓을 맴버변수로 선언합니다.
	ServerSocket server;
	
	//이미지를 표현하기 위한 라벨을 맴버변수로 선언합니다.
	JLabel label;
	
	//라벨에 이미지를 표현하기 위하여 이미지아이콘이 필요합니다.
	ImageIcon icon;
	
	public FileServer() {
		
		//이미지아이콘 객체를 생성합니다.
		icon = new ImageIcon("flower.png");
		
		//이미지아이콘 객체를 갖고 라벨을 생성합니다.
		label = new JLabel(icon);
		
		//라벨을 프레임에 담아요
		add(label);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
		
			//서버소켓를 생성합니다.
			server = new ServerSocket(9005);
			
			//클라이언트의 접속을 무한대기상태로 기다립니다.
			while(true) {
				
				//클라이언트의 요청을 수락합니다.
				Socket socket= server.accept();
				
				//클라이언트 보내오는 데이터를 받기 위한 스트림을 생성합니다.
				InputStream is = socket.getInputStream();
				
				//데이터를 한번에 받기 위한 배열을 선언합니다.
				byte []data= new byte[200];
				
				//전체 데이터를 누적하기 배열을 선언합니다.
				byte []all_data = null;
				
				//클라이언트가 보내오는 데이터를 계속 받도록 합니다.
				//파일의 끝이 아닐때까지 읽어들입니다.
				//맨첫번째 읽어
				while( true ) {
					
					//클라이언트로 부터 데이터를 수신합니다.
					//n에는 수신한 바이트수가 저장됩니다.
					int n = is.read(data);
					
					//메세지를 출력해봅니다.
					System.out.println(n+"bytes를 읽어들였습니다.");
					
					//파일의 끝에 도달하면 종료합니다. 
					//여기에 오질 않아요,, 주말에 해결해서 다시 이야기 합니다.
					if(n == -1) {
						System.out.println("파일의 끝에 도달하였습니다.");
						break;
					}
					
					
					//맨첫번째 읽어 들였다면 all_data에 담아요
					if(all_data == null) {
						all_data = data;
					}else { //두번째 이후에 읽어들일때 부터는 누적합니다.
						all_data = addArray(all_data, data);
					}
					
					System.out.println("합쳐진 배열의 길이:"+all_data.length);					
					
				} //end while_2
				
				//파일을 다 읽었으면
				//라벨에 그림을 표시 해 줍니다.
				//읽어 들인 파일의 내용은 all_data에 있어요!
//				icon = new ImageIcon(all_data);
				
				System.out.println("안쪽에 있는 while을 탈출하였습니다.");
				
				//전체읽어 들인 데이터를 파일로 출력합니다.
				FileOutputStream fos = new FileOutputStream("r.png");
				fos.write(all_data);
				fos.close();
				System.out.println("파일을 내려받았습니다.");
				
				icon = new ImageIcon("r.png");
				
				//라벨에 아이콘을 다시 설정합니다.
				label.setIcon(icon);
				
			}//end while_1
		
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		new FileServer();
	}

}
