package Collections;

import java.util.TreeSet;

public class TreeSet_example {

	public static void main(String[] args) {
		TreeSet<Integer>treeset=new TreeSet<>();
		
		treeset.add(5);
		treeset.add(2);
		treeset.add(8);
		treeset.add(1);
		treeset.add(10);
		
		System.out.println("Sorted Treeset elements: "+treeset);
		System.out.println("size of treeset: "+treeset.size());
		
		System.out.println("Iterarting over Treeset: ");
		for(Integer element : treeset) {
			System.out.println(element+" ");
		}
		System.out.println();

	}

}
