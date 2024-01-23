package pojo;

import java.util.Objects;

public class Pojoexample {
	private String name;
	private int age;
	private String email;
	
	public Pojoexample(String name, int age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	


	@Override
	public String toString() {
		return "Pojoexample [name=" + name + ", age=" + age + ", email=" + email + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, email, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pojoexample other = (Pojoexample) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
    public int hashcode() {
    	return Objects.hash(name,age,email);
    }

	
}
