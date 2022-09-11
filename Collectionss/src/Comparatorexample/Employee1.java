package Comparatorexample;

public class Employee1 {
	public String name;
	public int id;

	public Employee1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}
	

}
