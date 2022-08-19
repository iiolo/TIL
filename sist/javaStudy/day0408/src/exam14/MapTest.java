package exam14;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "홍길동");
		data.put("phone", "010-1234-5678");
		data.put("addr", "서울시 마포구 서교동");
		
		System.out.println("이름: "+ data.get("name"));
		System.out.println("전화: "+ data.get("phone"));
		System.out.println("주소: "+ data.get("name"));
		
		String oldPhone = data.put("phone", "010-2222-2222");
		System.out.println(oldPhone);
		
		
		
	}

}
