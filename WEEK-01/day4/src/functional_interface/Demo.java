package functional_interface;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		MyInterface mi =(int a,int b)->{return a+b;};
		System.out.println(mi.add(5,5));
		
		
		Function<String,Integer> intConvertor = (Integer::parseInt);
		System.out.println(intConvertor.apply("500"));
		

	}

}
