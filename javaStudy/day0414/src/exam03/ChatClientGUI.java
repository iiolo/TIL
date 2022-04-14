package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame implements ActionListener {
	
	//대화내용을 입력할 텍스트필드를 맴버변수로 선언합니다.
	JTextField jtf;
	
	//서버가 메아리한 대화내용을 계속하여 누적하여 보여주기 위한 텍스트에리어를 맴버변수로 선언합니다.
	JTextArea jta;
	
	//소켓을 맴버변수로 만들어요
	Socket socket;
	
	//데이터를 주고 받을 스트림을 맴버변수로 선언해요
	InputStream is;
	OutputStream os;
	
	public ChatClientGUI() {
		
		try {
			//서버에통신을 요청합니다.
			socket = new Socket("211.238.142.98", 9001);
			
			//데이터를 주고 받을 스트림을 생성합니다.
			is = socket.getInputStream();
			os = socket.getOutputStream();
						
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		//맴버변수들을 생성합니다.
		jtf = new JTextField(40);		
		jta = new JTextArea(80, 50);
		
		//텍스트에리어를 스크롤바를 위하여 스크롤팬으로 감싸요
		JScrollPane jsp = new JScrollPane(jta);
		
		//"전송"을 위한 버튼을 만들어요
		JButton btnSend = new JButton("전송");
		
		//버튼에 이벤트를 등록합니다.
		btnSend.addActionListener(this);
		
		//텍스트필드와 버트을 담는 패널을 만들어요
		JPanel p= new JPanel();
		
		//패널에 텍스트필드를 담아요
		p.add(jtf);
		
		//패널에 버튼을 담아요
		p.add(btnSend);
		
		//프레임의 가운데에 텍스트에리어를 감싸고 있는 스크롤팬을 담아요
		add(jsp, BorderLayout.CENTER);
		
		//프레임의 아래쪽에 텍스트필드와 버튼이 담긴 패널을 담아요
		add(p, BorderLayout.SOUTH);
		
		//프레임의 크기를 정해 줍니다.
		setSize(600, 400);
		
		//프레임을 화면에 보여주도록 설정합니다.
		setVisible(true);
		
		// 'X'단추를 누르면 프로그램을 종료하도록 설정합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//서버로 부터 수신되는 데이터를 계속하여 받기 위한 클래스를 
		//쓰레드로 구현합니다.
		class ClientThread extends Thread{
			public void run() {
				
				//서버로 부터 수신되는 데이터를 받기 위한 배열을 만들어요.
				byte []data = new byte[100];
				
				//계속실행합니다.
				while(true){
					try {					
						//인풋스트림을 통해 서버로 부터 수신되는 데이터를 받아요
						is.read(data);
						
						//수신된 데이터를 문자열로 만들어요
						String reMsg = new String(data);
						
						//문자열을 대화내용을 누적할 텍스트에리어에 추가합니다.
						jta.append(reMsg + "\n"); 						
					
					}catch (Exception e) {
						System.out.println("예외발생:"+e.getMessage());
					}
				}//end while
			}//end run
		}// end Thread
		
		//서버로 부터 수신되는 데이터를 계속하여 받는 클라이언트쓰레드 객체를 생성합니다.
		Thread t = new ClientThread();
		
		//쓰레드를 가동합니다.
		t.start();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//텍스트필드에 쓰여진 글자를 가져 옵니다.
		String msg = jtf.getText();
		
		try {
			
			//출력스트트림을 통해 데이터를 서버로 보냅니다.
			//데이터를 보낼때는 문자열을 바이트의 배열로 변환하여 보냅니다.
			os.write(msg.getBytes());
			
			//만약한 입력한 문자열이 q!이면 프로그램을 종료합니다.
			if(msg.equals("q!")) {
				System.exit(0);
			}		
			
			//다음 데이터 입력을 위하여 텍스트필드를 비워줍니다.
			jtf.setText("");
			
		}catch (Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}
		
		
	}

	public static void main(String[] args) {
		//프레임을 생성합니다.
		new ChatClientGUI();
	}

}