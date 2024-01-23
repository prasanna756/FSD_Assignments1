package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		
		System.out.println("Using for loop: ");
		for(String item : stringList) {
			System.out.println(item);
		}
		
		System.out.println("Displaying in reverse order: ");
		for (int i=stringList.size()-1;i>=0;i--) {
			System.out.println(stringList.get(i));
		}
}
}
