package exam14;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "ȫ�浿");
		data.put("phone", "010-1234-5678");
		data.put("addr", "����� ������ ������");
		
		System.out.println("�̸�: "+ data.get("name"));
		System.out.println("��ȭ: "+ data.get("phone"));
		System.out.println("�ּ�: "+ data.get("name"));
		
		String oldPhone = data.put("phone", "010-2222-2222");
		System.out.println(oldPhone);
		
		
		
	}

}
