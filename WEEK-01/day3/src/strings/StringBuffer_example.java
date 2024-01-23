package strings;

public class StringBuffer_example {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append(" ");
		sb.append("World");
		System.out.println(sb);
		
		String result=sb.toString();
		
		System.out.println("StringBuffer result: "+result);

	}

}
