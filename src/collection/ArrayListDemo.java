package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Object> a= new LinkedList<Object>();
		
		a.add("Oranium");
		a.add("Tech");
		a.add(90);
		a.add(10.0);
		a.add(true);
		a.add(null);
		a.add('u');
		a.add("Oranium");
		
		System.out.println(a);
		
		System.out.println("Adding another file");
		
		
		int y = a.indexOf(90);
		System.out.println(y);
		
		int lastIndexOf = a.lastIndexOf("Oranium");
		System.out.println(lastIndexOf);
		
		Object o = a.get(6);       // get (i)    
		System.out.println(o);
		boolean contains = a.contains("Oranium");
		System.out.println(contains);
		
		
		// To know how many elements inside the list 
		int size = a.size();
		System.out.println(size);  // 8
		
		// Set the element 
		a.set(6, "Chrompet");
		System.out.println(a);   // [Oranium, Tech, 90, 10.0, true, null, Chrompet, Oranium]
		
	    a.remove(5); 
	    System.out.println(a);  
	    
	    a.remove(true);
	    System.out.println(a);
	    // [Oranium, Tech, 90, 10.0, Chrompet, Oranium]
	    
	    LinkedList <Object>  b = new LinkedList<>();
	    b = (LinkedList)a.clone();
	    System.out.println(b);
	    
	    LinkedList <Object>  c = new LinkedList<>();
	    c.addAll(a);
	    System.out.println(c);
	    
	    b.clear();
	    c.clear();
	    System.out.println(b);  // []
         System.out.println(c);	    // []
	    
	    
	    System.out.println("using normal for loop ");
	    for (int i =0; i<a.size();i++)   // i =1   1<6
	    {
	    	System.out.println(a.get(i));  //a.get(1)
	    }
	    
	    System.out.println("Enhanced for loop ");
	    
	    for (Object p:a)
	    {
	    	System.out.println(p);
	    }
	    
	    
	    System.out.println("Using iterator method ");
	    
	    Iterator<Object> r= a.iterator();
	    
	    while(r.hasNext())
	    {
	    	System.out.println(r.next());
	    }
	    
	    
	    System.out.println("Using lambda expression");
	    
	    a.forEach(k->System.out.println(k));
	    
	  
		
		
		
	}
}
