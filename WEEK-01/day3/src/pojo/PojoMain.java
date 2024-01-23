package pojo;

public class PojoMain {

	public static void main(String[] args) {
		Pojoexample p=new Pojoexample("Prasanna", 23, "prasanna123@gmail.com");
		
		p.setAge(26);
		p.setEmail("lakshmi@gmail.com");
		
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		System.out.println("Email: "+p.getEmail());
		
		System.out.println(p);
		
		Pojoexample p1=new Pojoexample("lalitha", 34,"lalli@gmail.com");
		System.out.println("Are person-p and person-p1 equal?" +p.equals(p1));

	}

}
