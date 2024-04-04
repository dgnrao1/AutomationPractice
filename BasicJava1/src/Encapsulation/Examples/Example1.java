package Encapsulation.Examples;

 class Sample

{
	private int age = 10;
	private double salary = 50000.53;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}

public class Example1 {

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println("Age:" + s.getAge());
		System.out.println("Salary:" + s.getSalary());
		s.setAge(24);
		System.out.println("New Age:" + s.getAge());
		s.setSalary(30000.45);
		System.out.println("New Salary:" + s.getSalary());
	}

}
