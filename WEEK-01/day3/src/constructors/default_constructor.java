package constructors;

class default_example {
	public default_example() {
		System.out.println("Default constructor called.");
	}

	public void display() {
		System.out.println("Inside default");
	}
}

public class default_constructor {
	public static void main(String[] args) {
		default_example ex = new default_example();
		ex.display();

	}

}
