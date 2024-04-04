package Encapsulation.Examples;

public class aaaa {
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

	public static void main(String[] args) {
		aaaa a1=new aaaa();
		System.out.println("Age:"+a1.getAge());
		System.out.println("Salary:"+a1.getSalary());
		a1.setAge(23);
		a1.setSalary(4567.3);
		System.out.println("Age:"+a1.getAge());
		System.out.println("Salary:"+a1.getSalary());
		aaaa a2=new aaaa();
		System.out.println("Age:"+a2.getAge());
		System.out.println("Salary:"+a2.getSalary());
	}

}
