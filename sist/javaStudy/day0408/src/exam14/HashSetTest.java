package exam14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("���");
		set.add("����");
		set.add("����");
		set.add("��");		
		set.add("����");
		set.add("������");
		
//		set.add("����");
//		set.add("����");

		
		System.out.println(set);
	}

}
