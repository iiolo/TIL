package exam03;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println(addr);
			
		} catch (Exception e) {
			System.out.println("예외처리: "+e.getMessage());
		}

	}

}
