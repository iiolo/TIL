package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class UpperClient {

	public static void main(String[] args) {
		
		System.out.println("Ŭ���̾�Ʈ ���α׷��Դϴ�.");
		try {
			//Ű����� �Է��ϱ� ���Ͽ� ��ĳ�ʸ� �����մϴ�.
			Scanner sc = new Scanner(System.in);
			
			//�Է¹��� ������ �����մϴ�.
			String str;
			
			//������ �빮�ڷ� ��ȯ�Ͽ� �����ִ� ���ڿ��� �����ϱ� ���� ������ ����
			String upperStr;
			
			//������ �������� �����͸� �ޱ� ���� �迭�� �����մϴ�.
			byte []data = new byte[200];
			
			//3. �������� ����� ��û�մϴ�.
			Socket socket = new Socket("211.238.142.98", 9006);
			
			//7. �����͸� �ְ� ���� ��Ʈ���� �����մϴ�.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//8. ��ӽ����մϴ�.
			while(true) {
				
				//9. ����� ���� ����ܾ �Է¹޾ƿ�
				System.out.print("���� ������ �Է��ϼ���==>");
				str = sc.nextLine();
				
				System.out.println("������ ������ �ؽ�Ʈ:"+str);
								
				//10. �Է¹��� ������ ������ �����ϴ�
				os.write(str.getBytes());
								
				//11. ������ �빮�ڷ� ��ȯ�ϴ� �����ִ� �����͸� �޾ƿ�
				is.read(data);
				
				//12. �޾ƿ� �����͸� ���ڿ��� ������
				upperStr = new String(data);
				
				//13. ȭ�鿡 ����մϴ�.
				System.out.println("�������� ���۵� �ؽ�Ʈ:"+upperStr);
				
				//���� ������ ������ ���Ͽ� �迭�� ����ݴϴ�.
				Arrays.fill(data, (byte)0);
				
			}
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}

	}

}





