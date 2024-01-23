package Inheritance;

public class Inheritance_main {
	
	public class Main {
		public static void main(String[] args) {
			Inheritance_Animal myAnimal = new Inheritance_Animal();
			Inheritance_Animal.Dog myDog = myAnimal.new Dog();
			myDog.eat();
			myDog.bark();
		}

	}

	

}
