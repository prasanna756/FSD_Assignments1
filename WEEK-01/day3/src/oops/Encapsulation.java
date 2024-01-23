package oops;

public class Encapsulation {
	private String name;
	private int age;

	public Encapsulation(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation("Sita", 28);

		System.out.println("Name: " + e.getName());
		System.out.println("Age: " + e.getAge());

		e.setName("Prasanna");
		e.setAge(22);

		System.out.println("Updated Name: " + e.getName());
		System.out.println("Updated Age: " + e.getAge());

	}

}
