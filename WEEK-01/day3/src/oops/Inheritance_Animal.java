package oops;

public class Inheritance_Animal {
	void eat() {
		System.out.println("Animal is eating");
	}

	 class Dog extends Inheritance_Animal {
		void bark() {
			System.out.println("Dog is barking");
		}

		@Override
		void eat() {
			System.out.println("Dog is eating");
		}
	}

	public class Main {
		public static void main(String[] args) {
			Inheritance_Animal myAnimal = new Inheritance_Animal();
			Inheritance_Animal.Dog myDog = myAnimal.new Dog();
			myDog.eat();
			myDog.bark();
		}

	}

}
