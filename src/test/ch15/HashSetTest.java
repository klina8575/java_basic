package test.ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		int size = set.size();
		System.out.println(size);
	}

}
