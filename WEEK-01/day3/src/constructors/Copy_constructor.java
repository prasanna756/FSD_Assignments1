package constructors;

class Copy_constructor_ex {
	private String name;
	private int age;

	public Copy_constructor_ex(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Copy_constructor_ex(Copy_constructor_ex other) {
		this.name = other.name;
		this.age = other.age;
		System.out.println("Copy constructor called for " + this.name);
	}

	public void displayInfo() {
		System.out.println("Name " + name + "Age: " + age);
	}
}

public class Copy_constructor {
	public static void main(String[] args) {
		Copy_constructor_ex original = new Copy_constructor_ex("venu", 25);
		Copy_constructor_ex copy = new Copy_constructor_ex(original);
		copy.displayInfo();

	}

}
