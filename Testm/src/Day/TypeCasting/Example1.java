package Day.TypeCasting;

public class Example1 {

	public static void main(String[] args) {
		int age=25;
		double confirmage=age;//widening-implicit
		float re_confirmage=(float)age;///widening-explicit
		System.out.println("Age:"+age);
		System.out.println("confirmage age:"+confirmage);
		System.out.println("re_confirmage:"+re_confirmage);
double salary=30000.34;
float salary_1=(float)salary;//narrow-explicit
int salary_2=(int)salary;//narrow-explicit
System.out.println("Salary"+salary);
System.out.println("Salary_1"+salary_1);
System.out.println("Salary_2"+salary_2);
	}

}
