package abstarction;

public abstract class Abstraction_example {
	abstract void draw();

	void displayInfo() {
		System.out.println("This is a shape.");
	}

}

class Circle extends Abstraction_example {

	@Override
	void draw() {
		System.out.println("This is a circle");

	}

}

class Rectangle extends Abstraction_example {

	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}

}
