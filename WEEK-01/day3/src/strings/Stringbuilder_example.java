package strings;

public class Stringbuilder_example {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");

		sb.append(" ");
		sb.append("World");
		System.out.println(sb);

		String result = sb.toString();
		System.out.println("StringBuilder result: " + result);

	}

}
