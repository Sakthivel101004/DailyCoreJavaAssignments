package innerclassandcollection;

import java.util.ArrayList;

public class Arraylist__list {

	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		list.add("sakhti");
		list.add("vel");
		list.add("mani");
		list.add("ram");
		list.add("krishna");
		
		System.out.println(list);
		
		for(String arr:list)
		{
		  System.out.println(arr);	
		}

	}

}
