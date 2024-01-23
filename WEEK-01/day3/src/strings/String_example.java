package strings;

public class String_example {

	public static void main(java.lang.String[] args) {
		String str1= "Hello";
		String str2= "World";
		
		String result=str1 + " " +str2;
		System.out.println("Concatenated String: "+result);
		
		int length=result.length();
		System.out.println("Length of String: "+length);
		
		String substring=result.substring(6);
		System.out.println("substring from index 6: "+substring);

	}

}
