package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class URLTestGUI extends JFrame implements ActionListener {
	private JFileChooser jfc;
	private JTextField jtf;
	private JTextArea jta;

	public URLTestGUI() {
		jfc = new JFileChooser("c:/temp");
		jtf = new JTextField(50);
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);

		JButton btnRead = new JButton("�о����");
		JButton btnSave = new JButton("���� ����");

		btnRead.addActionListener(this);
		btnSave.addActionListener(this);

		JPanel p = new JPanel();
		p.add(jtf);
		p.add(btnRead);
		p.add(btnSave);

		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new URLTestGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("�о����")) {
			try {
				// �ؽ�Ʈ �ʵ忡 �Է��ϰų� ������ URL ��ü ����
				URL url = new URL(jtf.getText());
				InputStream is = url.openStream();
				byte[] data = new byte[100];
				String str = "";
				while (is.read(data) != -1) {
					str = str + new String(data, "utf-8");
					Arrays.fill(data, (byte) 0);
				}
				
				// ���� �о���� ���ڿ��� �ؽ�Ʈ ����� ����
				jta.setText(str);
				
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println("���� �߻�: " + ex.getMessage());
			}

		} else if (cmd.equals("���� ����")) {
			
			try {
				int re = jfc.showSaveDialog(this);
				if (re == JFileChooser.APPROVE_OPTION) { // ���� ����Ͽ�����
					File file = jfc.getSelectedFile();
					FileWriter fw = new FileWriter(file);
					fw.write(jta.getText());
					fw.close();
					JOptionPane.showMessageDialog(this, "���Ϸ� �����Ͽ����ϴ�.");
				}
				
			} catch (Exception ex) {
				System.out.println("���� �߻�: " + ex.getMessage());
			}

		}

	}

}
