package polymorphism;

public class Main {

	public static void main(String[] args) {
		compile_time c=new compile_time();
		int sumInt=c.add(5, 10);
		double sumDouble=c.add(5.5, 10.5);
		
		System.out.println("Sum(int): "+sumInt);
		System.out.println("Sum Double: "+sumDouble);

	}

}
