package exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// NotePad 자신이 메뉴에 대한 이벤트 처리 클래스가 되도록 한다.
class NotePad extends JFrame implements ActionListener{
	
	
	// 저장할 파일명과 읽어올 파일 명을 선택할 수 있는 파일선택 다이얼로그를 멤버로 선언
	JFileChooser jfc;
	
	
	// 메모장의 글자를 입력하는 부분을 위한 텍스트에리어를 멤버변수로 선언
	JTextArea jta;
	
	public NotePad() {
		
		// 파일 생성 다이얼로그 생성
		jfc = new JFileChooser("c:/temp");
		
		
		//텍스트에리어 생성
		jta = new JTextArea(10,80);// 줄 수, 칸 수 
		
		// 텍스트 에리어에 스크롤을 생성하기 위한 스크롤 팬 생성
		JScrollPane jsp = new JScrollPane(jta);
		
		//프레임에 스크롤팬 담기
		// 프레임에 레이아웃을 설정하지 않으면 기본이 BorderLayout이다.
		// 동서남북가운데 설정하지 않으면 가운데에 담아줌
		add(jsp);
		
		
		// 메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		
		//주메뉴 파일 생성
		JMenu mn_file = new JMenu("파일");
		
		// 파일에 대한 부메뉴 새파일,열기,저장하기 생성
		JMenuItem file_new = new JMenuItem("새 파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		
		
		// 부메뉴 새파일, 열기, 저장하기를 주 메뉴 파일에 담기
		// 이벤트 처리 담당자는 NotePad 객체 자신이 처리하도록 함
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		// 각가의 부메뉴들에 대해 이벤트 등록
		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		
		// 메뉴 바에 주 메뉴 파일 담기
		jmb.add(mn_file);
		
		// 메뉴바를 프레임에 설정
		setJMenuBar(jmb);
		
		
		
		// 창의 크기 설정
		setSize(400,300);
		
		// 창을 화면에 보여주도록 설정
		setVisible(true);
		
		// 창을 닫으면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	// 메뉴가 눌러졌을 때 이 메소드 동작
	// 어떤 메뉴가 눌러졌는지의 정보를 매개변수인 ActionEvent e가 전달받는다.
	@Override
	public void actionPerformed(ActionEvent e) {
		 // 눌러진 메뉴의 글자를 변수에 저장
		String cmd = e.getActionCommand();
		if (cmd.equals("새 파일")) {
			jta.setText("");
		} else if(cmd.equals("열기")) {
			
			
			String str ="";
			// 파일 입출력을 위한 생성자와 메소드들은 예외를 안고 있어 예외처리
			try {
				// 어떤파일을 읽어올지 다이얼로그 띄움
				int re = jfc.showOpenDialog(this);
				
				if (re == 0) {
					
					// 다이얼로그에서 선택한 파일 읽어오기
					File file = jfc.getSelectedFile();
					
					// hello.txt 파일의 내용을 읽어들여 텍스트에리어에 출력한다.
					
					// 문자 단위의 파일입력을 위한 객체 생성
					FileReader fr = new FileReader(file);
					// 한글자씩 읽어올 변수 선언
					int ch;
					
					while (true) {
						// 파일로부터 한 글자씩 읽어들임
						ch = fr.read();
						
						// 파일의 끝에 도달하면 반복문 탈출
						if (ch == -1) {
							break;
						}
						
						// 파일로 읽어 읽어들인 문자의 정수값을 문자로 변환
						char data = (char)ch;
						
						//한글자씩 읽어온 글자를 str를 누적
						str = str + data;
					}
					// 파일로 모두 읽어온 문자열이 누적된 str의 내용을 텍스트 에리어에 출력
					jta.setText(str);
					
					// 사용이 끝난 파일 닫기
					 fr.close();
				}
				
				
			} catch (Exception ex) {
				// TODO: handle exception
			}
			
		} else if (cmd.equals("저장")) {
			// 현재 텍스트 에리어의 내용을 파일로 출력
			
			try {
				
				// 어느폴더에 어떤 이름으로 저장할 것인지 물어보기 위한 다이얼로그
				int re = jfc.showSaveDialog(this);

				// 긍정적 대답: 0, 부정적 대답:1
				// 긍정적 대답 했을 때 파일로 저장
				if (re == 0) {
					// 다이얼로그에서 선택한 파일 객체를 읽어오기
					File file = jfc.getSelectedFile();
					
					
					// 문자 단위로 파일로 출력하기 위한 FileWriter 객체 생성
					FileWriter fr = new FileWriter(file);
					
					// 파일의 내용을 읽어와서 모두 저장할 문자열 변수 선언
					
					
					// 텍스트에리어의 내용을 모두 파일로 출력
					fr.write(jta.getText());
					
					// 파일의 사용이 끝났으면 파일 닫기
					fr.close();
					
					System.out.println("파일을 생성하였습니다.");
				}
				
				
				
			} catch (Exception ex) {
				System.out.println("예외발생: "+ex.getMessage());
			}
			
		}
	}
	
	
}
public class NotePadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NotePad  객체 생성
		new NotePad();
	}

}
