package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		System.out.println();
		
	System.out.println("Iterating over List using enhanced for loop:");
	for(String element:list) {
		System.out.println(element);
	}
		
	}



}
