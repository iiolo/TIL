package exam13;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
//		String data = "홍길동,이순신,유관순,김유신";
//		String data = "홍길동:이순신:유관순:김유신";
		String data = "홍길동 이순신 유관순 김유신";
//		StringTokenizer st = new StringTokenizer(data,",");
//		StringTokenizer st = new StringTokenizer(data,":");
		StringTokenizer st = new StringTokenizer(data);
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}
	}

}
