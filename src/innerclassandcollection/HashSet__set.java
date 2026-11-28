package innerclassandcollection;

import java.util.HashSet;

public class HashSet__set {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(null);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(3);
		set.add(1);
		set.add(null);

		System.out.println(set.size());
		System.out.println(set);
	}

}
