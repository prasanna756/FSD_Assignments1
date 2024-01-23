package constructors;

class parameterized_constructor {
	private int value;

	public parameterized_constructor(int value) {
		this.value = value;
		System.out.println("Parameterized constructor called: " + value);
	}

	public void display() {
		System.out.println("Value: " + value);
	}

}

public class Parameterised_example {

	public static void main(String[] args) {
		parameterized_constructor pc = new parameterized_constructor(4);
		pc.display();

	}

}
