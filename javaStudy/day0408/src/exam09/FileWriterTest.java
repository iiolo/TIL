package exam09;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/temp/hello.txt");
			fw.write("hello java"); //hello java��� ���� hello ���� ����
			fw.close();
			System.out.println("������ �����Ͽ����ϴ�.");
;		} catch (IOException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�." +e.getMessage() );
		}

	}

}
