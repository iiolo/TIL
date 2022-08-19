package exam14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest02 {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("이름", "홍길동");
		data.put("나이", "20");
		data.put("주소", "서울시 마포구 서교동");
		System.out.println(data);
		
		LinkedHashMap<String, String> data2 = new LinkedHashMap<String, String>();
		data2.put("이름", "홍길동");
		data2.put("나이", "20");
		data2.put("주소", "서울시 마포구 서교동");
		System.out.println(data2);
		
		TreeMap<String, String> data3 = new TreeMap<String, String>();
		data3.put("이름", "홍길동");
		data3.put("나이", "20");
		data3.put("주소", "서울시 마포구 서교동");
		System.out.println(data3);
	}

}
