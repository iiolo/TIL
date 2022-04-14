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
	
	//������� ����� JTextFiled�� �ɹ������� �����մϴ�.
	JTextField jtf;
	
	//������ �� �ΰ��� ���� �����ϱ� ���� ������ �����մϴ�.
	int num1;
	int num2;
	
	//� ������ ���� �����ڸ� ������ ������ �����մϴ�.
	String op;
	
	public Calc() {
		
		//JTextField��ü�� �����մϴ�.
		jtf = new JTextField(50);		
		
		//����ǥ���� �����ϱ�
		setTitle("����");
		
		//ȭ���ġ����� ��,��,��,��,����� ��ġ����� BorderLayout���� ��ġ�մϴ�.
		setLayout(new BorderLayout());
		
		//16���� ��ư�� �� ���ڿ� �迭�� ������
		String []str = {
				"1","2","3","+",
				"4","5","6","-",
				"7","8","9","*",
				"0","C","=","/"
		};
		
		//��ư �迭�� 16���� ������
		JButton []btn = new JButton[16];
		
		
		//��ư 16�������� �г��� �����մϴ�.
		JPanel p = new JPanel();
		
		//�г��� ���̾ƿ������ ��ư 16���� �㵵�� 
		//4�� 4���� �׸��巹�̾ƿ����� �����մϴ�
		p.setLayout(new GridLayout(4, 4));
		
		//�ݺ����� �̿��Ͽ� 16���� ��ư�� �����Ͽ� �гο� ��ƿ�
		for(int i=0;i<  str.length; i++) {
			btn[i] = new JButton(str[i]);
			
			//��ư�� ������������ ���� �ϵ��� �̺�Ʈ ����� �մϴ�.
			btn[i].addActionListener(this);
			
			p.add(btn[i]);
		}
		
		//������� ����� �ؽ�Ʈ�ʵ带 �������� ���ʿ� ��ƿ�
		add(jtf, BorderLayout.NORTH);
		
		
		//16���� ��ư�� �ִ� �г��� �������� ����� ��ƿ�
		add(p, BorderLayout.CENTER);
		
		//â�� ũ�⸦ ����
		setSize(300, 200);
		
		//â�� ���� �ֵ��� ����
		setVisible(true);
		
		//â�� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//������ ��ư�� ���ڸ� ������ �ɴϴ�.
		String cmd = e.getActionCommand();
		System.out.println(cmd);
		
		//���࿡ ������ ��ư�� ���ڰ� ������(+,-,*,/)���
		//���� ȭ�鿡 �ִ� ���ڸ� num1�� �����ϰ� 
		//ȭ���� ����ϴ�.
		//������ �����ڸ� ���� op�� �����մϴ�.
		//�ϼ��ϸ� "1"
		
		if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
			
			//���� ȭ�鿡 �ִ� ���ڸ� ������ ��ȯ�Ͽ� num1�� �����Ѵ�.
			num1 =  Integer.parseInt(jtf.getText());
			
			//ȭ���� �����.
			jtf.setText("");
			
			//�����ڸ� op�� �����Ѵ�.
			op = cmd;
			
		}else if(cmd.equals("=")) {
			//���� �ؽ�Ʈ�ʵ��� ������ num2�� �����մϴ�.
			num2 = Integer.parseInt(jtf.getText());
			
			//op�� ��� �����ڿ� ���� �ش翬���� �����Ͽ� ���� result�� ��ƿ�
			int result=0;
			switch(op) {
				case "+":result=num1+num2;break;
				case "-":result=num1-num2;break;
				case "*":result=num1*num2;break;
				case "/":result=num1/num2;break;
			}
			
			//result�� �ؽ�Ʈ �ʵ忡 ����մϴ�.
			//jtf.setText(result);
			jtf.setText(result+"");
		}else if(cmd.equals("C")){
			//num1,num2�� 0���� �����մϴ�.
			num1 = 0;
			num2 = 0;
			
			//��ƮƮ�ʵ带 �����ݴϴ�.
			jtf.setText("");
			
		}else {
			//������ ��ư�� ���ڸ� �ؽ�Ʈ�ʵ忡 ��� �� ���ô�.
			//jtf.setText(cmd);
			
			//��ư�� �������� ������ ��ư�� ���ڸ� �ؽ�Ʈ�ʵ忡 �����Ͽ� ��� �� ���ϴ�.
			jtf.setText( jtf.getText() + cmd);
		}
	}
}


public class CalcTest {
	public static void main(String[] args) {
		new Calc();
	}

}
