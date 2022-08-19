package exam14;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("수박");
		list.add("포도");
		list.add("감");		
		list.add("수박");
		list.add("오렌지");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list);

	}

}
