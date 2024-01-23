package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
Set<String>  set = newHashSet<String>();
		
		
		set.add("king");
		set.add("queen");
		set.add("prasanna");
		set.add("ford");
		System.out.println(set);
		
		for (String s : set) {
			System.out.println(s);
			
		}

	}

}
		
