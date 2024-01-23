package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraDemos {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(76);
		list.add(98);
		
		Object[] arr=list.toArray();
		System.out.println(arr);
		
		int a1[]= {22,77,55,33};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(a1));
		Arrays.asList(a1);

	}

}
