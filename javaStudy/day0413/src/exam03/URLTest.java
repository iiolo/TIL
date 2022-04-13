package exam03;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// ���ͳ� ���� ���� ��ü ����
			URL url = new URL("https://hanbit.co.kr/store/books/new_book_list.html");
			
			//�� ������ ������ �о���̱� ���� ��Ʈ�� ����
			InputStream is = url.openStream();
			
			// �� ���� �о���� byte���� �迭 ����
			
			byte []data = new byte[100];
			// ��Ʈ���� ���� �о�� ���ڿ��� �� ��Ƴ��� ���� ����
			String str = "";
			
			// ��� �ݺ� ����
			while (true) {
				// ��Ʈ���� ���� �����͸� �о����
				int re = is.read(data);
				
				// ���̻� �о���� ���� ������ �ݺ��� Ż��
				if (re == -1) {
					break;
				}
				// �о���� �����͸� ���ڿ��� ����� ����
				str = str + new String(data, "utf-8");
				
				// �ٽ� �о���̱� ���ؼ� �迭�� �����(�ȱ׷��� ������ �ҷ��� ������ ���ڰ� ���� ����)
				// �迭�� ����ֱ� ���Ͽ� 0���� ä���.
				Arrays.fill(data, (byte)0);
			}
			// ������ ��ü ���ڿ� ���
			System.out.println(str);
			
			// ����� ���� ���ڿ� �ݱ�
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
