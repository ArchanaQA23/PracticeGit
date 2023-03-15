package collection;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap <Integer,String> t = new TreeMap<>();
		
		t.put(101, "Vinithra");
		t.put(34, "Karan");
		t.put(78, "Gokul");
		t.put(67, "Madhumitha");
		t.put(2, "Sakthi");
		t.put(10, "Monica");
		t.put(56, "Metina");
		t.put(78, null);
		
		System.out.println(t);
		
		
		
	}

}
