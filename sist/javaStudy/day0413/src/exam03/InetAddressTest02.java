package exam03;

import java.net.InetAddress;

public class InetAddressTest02 {

	public static void main(String[] args) {
		try {
			InetAddress []list = InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
