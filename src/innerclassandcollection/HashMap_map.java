package innerclassandcollection;

import java.util.HashMap;

public class HashMap_map {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "sakhti");
		map.put(2, "vel");
		map.put(3, "kishore");
		map.put(4, "ajay");
		map.put(5, "sudharson");
		
		System.out.println(map.entrySet());
		

	}

}
