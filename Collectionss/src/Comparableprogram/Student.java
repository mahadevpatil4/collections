package Comparableprogram;

public class Student implements Comparable<Student> {
	public String name;
	public int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student o) {
		return o.id+this.id;
	}

//	@Override
//	public int compareTo(Student o) {
//		return o.id + this.id;
//	}

}
