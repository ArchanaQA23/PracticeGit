package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
	
	h.put("English", 90);
	h.put("Computer",89);
	h.put(null, 90);
	h.put("Science", 78);
	h.put("Computer", 78);
	h.put("EVS", 78);
	
	
	System.out.println(h); // {null=90, English=90, EVS=78, Computer=78, Science=78}
	
    System.out.println("Iterating only the keys ");
    
    Set<String> k = h.keySet();
    for(String a : k)
    {
    	System.out.println(a);
    }
    
    System.out.println("ITerate only the values ..");
    Collection<Integer> values = h.values();
    
    for(Integer v:values)
    {
    	System.out.println(v);
    }
    
    Set<Entry<String, Integer>> entrySet = h.entrySet();
    
    for(Entry<String, Integer> i:entrySet)  // null =90 , English =90 
    {
    	System.out.println(i.getKey() + "==" + i.getValue());
    }
    
    
    System.out.println(h.get("Science"));
    
    System.out.println(h.get("science"));   // null
    
    
    
    
    
    
    
    
    
	
	
}
}
