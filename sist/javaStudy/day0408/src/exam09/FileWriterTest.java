package exam09;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/temp/hello.txt");
			fw.write("hello java"); //hello java라고 적힌 hello 파일 생성
			fw.close();
			System.out.println("파일을 생성하였습니다.");
;		} catch (IOException e) {
			System.out.println("예외가 발생되었습니다." +e.getMessage() );
		}

	}

}
