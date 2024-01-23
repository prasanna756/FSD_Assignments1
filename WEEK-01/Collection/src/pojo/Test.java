package pojo;

public class Test {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"king",8000);
		System.out.println(emp1);
		System.out.println(emp1.getEid());
		
		Employee emp2=new Employee();
		emp2.setEid(102);
		System.out.println(emp2);
		System.out.println(emp2.getEid()); 
		
	}

}
