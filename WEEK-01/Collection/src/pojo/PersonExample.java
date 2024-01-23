package pojo;

public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person(1, "smitha", 50000.0);
		Person person2 = new Person(2, "latha", 60000.0);

		System.out.println("Person 1 deatils: " + person1);
		System.out.println("Person 2 details: " + person2);

		person1.setName("amritha");
		person1.setSalary(55000.0);

		System.out.println("Upadted details for person1: " + person1);

	}

}
