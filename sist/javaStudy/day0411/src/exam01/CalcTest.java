package exam01;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame implements ActionListener{
	
	//계산결과를 출력할 JTextFiled를 맴버변수로 선언합니다.
	JTextField jtf;
	
	//연산을 할 두개의 수를 저장하기 위한 변수를 선언합니다.
	int num1;
	int num2;
	
	//어떤 연산을 할지 연산자를 저장할 변수를 선언합니다.
	String op;
	
	public Calc() {
		
		//JTextField객체를 생성합니다.
		jtf = new JTextField(50);		
		
		//제목표시줄 설정하기
		setTitle("계산기");
		
		//화면배치방식을 동,서,남,북,가운데로 배치방식인 BorderLayout으로 배치합니다.
		setLayout(new BorderLayout());
		
		//16개의 버튼에 들어갈 문자열 배열을 만들어요
		String []str = {
				"1","2","3","+",
				"4","5","6","-",
				"7","8","9","*",
				"0","C","=","/"
		};
		
		//버튼 배열을 16개를 만들어요
		JButton []btn = new JButton[16];
		
		
		//버튼 16개를담을 패널을 생성합니다.
		JPanel p = new JPanel();
		
		//패널의 레이아웃방식을 버튼 16개를 담도록 
		//4행 4열의 그리드레이아웃으로 설정합니다
		p.setLayout(new GridLayout(4, 4));
		
		//반복문을 이용하여 16개의 버튼을 생성하여 패널에 담아요
		for(int i=0;i<  str.length; i++) {
			btn[i] = new JButton(str[i]);
			
			//버튼이 눌러졌을때에 일을 하도록 이벤트 등록을 합니다.
			btn[i].addActionListener(this);
			
			p.add(btn[i]);
		}
		
		//계산결과를 출력할 텍스트필드를 프레임의 북쪽에 담아요
		add(jtf, BorderLayout.NORTH);
		
		
		//16개의 버튼이 있는 패널을 프레임의 가운데에 담아요
		add(p, BorderLayout.CENTER);
		
		//창의 크기를 설정
		setSize(300, 200);
		
		//창을 보여 주도록 설정
		setVisible(true);
		
		//창을 닫으면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//눌러진 버튼의 글자를 가지고 옵니다.
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		
		//만약에 눌러진 버튼의 글자가 연산자(+,-,*,/)라면
		//현재 화면에 있는 숫자를 num1에 저장하고 
		//화면을 지웁니다.
		//눌러진 연산자를 변수 op에 저장합니다.
		//완성하면 "1"
		
		if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
			
			//현재 화면에 있는 숫자를 정수로 변환하여 num1에 저장한다.
			num1 =  Integer.parseInt(jtf.getText());
			
			//화면을 지운다.
			jtf.setText("");
			
			//연산자를 op에 저장한다.
			op = cmd;
			
		}else if(cmd.equals("=")) {
			//현재 텍스트필드의 내용을 num2에 저장합니다.
			num2 = Integer.parseInt(jtf.getText());
			
			//op에 담긴 연산자에 따라서 해당연산을 수행하여 변수 result에 담아요
			int result=0;
			switch(op) {
				case "+":result=num1+num2;break;
				case "-":result=num1-num2;break;
				case "*":result=num1*num2;break;
				case "/":result=num1/num2;break;
			}
			
			//result를 텍스트 필드에 출력합니다.
			//jtf.setText(result);
			jtf.setText(result+"");
		}else if(cmd.equals("C")){
			//num1,num2를 0으로 설정합니다.
			num1 = 0;
			num2 = 0;
			
			//텍트트필드를 지워줍니다.
			jtf.setText("");
			
		}else {
			//눌러진 버튼의 글자를 텍스트필드에 출력 해 봅시다.
			//jtf.setText(cmd);
			
			//버튼이 눌러지면 눌러진 버튼의 글자를 텍스트필드에 누적하여 출력 해 봅니다.
			jtf.setText( jtf.getText() + cmd);
		}
	}
}


public class CalcTest {
	public static void main(String[] args) {
		new Calc();
	}

}
