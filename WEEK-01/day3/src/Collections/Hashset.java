package Collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<>();
		hashset.add("Apple");
		hashset.add("Banana");
		hashset.add("Orange");
		hashset.add("Apple");
		hashset.add(null);
		hashset.add("Banana");
		
		System.out.println("Hashset elements: "+hashset);
		
		System.out.println("Size of Hashset: "+hashset.size());
		
		System.out.println("Iterating over Hashset: ");
		for(String element : hashset) {
			System.out.println(element+" ");
		}
		System.out.println();
		
		

	}

}
