package exam13;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
//		String data = "ȫ�浿,�̼���,������,������";
//		String data = "ȫ�浿:�̼���:������:������";
		String data = "ȫ�浿 �̼��� ������ ������";
//		StringTokenizer st = new StringTokenizer(data,",");
//		StringTokenizer st = new StringTokenizer(data,":");
		StringTokenizer st = new StringTokenizer(data);
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}
	}

}
