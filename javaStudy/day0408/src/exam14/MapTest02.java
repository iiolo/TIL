package exam14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest02 {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("�̸�", "ȫ�浿");
		data.put("����", "20");
		data.put("�ּ�", "����� ������ ������");
		System.out.println(data);
		
		LinkedHashMap<String, String> data2 = new LinkedHashMap<String, String>();
		data2.put("�̸�", "ȫ�浿");
		data2.put("����", "20");
		data2.put("�ּ�", "����� ������ ������");
		System.out.println(data2);
		
		TreeMap<String, String> data3 = new TreeMap<String, String>();
		data3.put("�̸�", "ȫ�浿");
		data3.put("����", "20");
		data3.put("�ּ�", "����� ������ ������");
		System.out.println(data3);
	}

}
