package exam10;

import java.io.IOException;

public class ThrowTest02 {

	public static void main(String[] args) {
		System.out.println("hello");
		try {
			throw new IOException("입출력 오류 발생");
			
		} catch (IOException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}

}
