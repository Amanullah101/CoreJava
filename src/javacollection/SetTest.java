package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
 public static void main(String[] arg) {
	 HashSet<String> set1 = new HashSet<String>();
	 set1.add("2");
	set1.add("A");
	set1.add("B");
	set1.add("1");
	// HashSet is faster than LinkedHashSet
	// LinkedHashSet preserve insertion order but HashSet not
	
	 System.out.println("Serving names from school (Order cann vary)");
	 for(String names:set1)
		 System.out.println(names);
	 System.out.println("Serving names from school (always insertion order)");
	 Set<String> set2 = new LinkedHashSet<String>();//PolyMorhphism
	 set2.add("2");
	 set2.add("D");
	 set2.add("C");
	 set2.add("1");
	 for(String names:set2)
		 System.out.println(names);
	 
	 
 }
}
