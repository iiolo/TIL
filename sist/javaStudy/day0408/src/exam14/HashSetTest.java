package exam14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("사과");
		set.add("수박");
		set.add("포도");
		set.add("감");		
		set.add("수박");
		set.add("오렌지");
		
//		set.add("딸기");
//		set.add("포도");

		
		System.out.println(set);
	}

}
