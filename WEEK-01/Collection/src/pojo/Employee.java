package pojo;

public class Employee {//POJO, BEAN, ENTITY
	
	private int eid;
	private String ename; //data hiding
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, double salary) {
		this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        //new Employee();
        
        
    }

public void setEid(int eid) {
	this.eid=eid;
}

public int getEid() {
	return this.eid;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

}