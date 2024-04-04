package This.KeywordEx1;

public class ThisExample {

	int age = 25;

	void display() {
	int age=12;
		System.out.println("I am Display***************");
		System.out.println("age" + age);
		System.out.println("age" + this.age);

	}

void display(int age) {
	System.out.println("I am Display(int)*Local Variable*"+age);
		System.out.println(" age NGV" +this.age);
		this.calling(2222.8);
	this.display();
}
double sal=25000.56;
	void calling(double sal) {
		System.out.println("I am calling my sal Local V is"+sal);
		System.out.println("I am calling my sal NSGV is"+this.sal);
	//this.sal=sal;
	//System.out.println(" local sal" +sal);
	//System.out.println(" NSGV" +this.sal);
	//sal=this.sal;
	//System.out.println(" local sal" +sal);
	//System.out.println(" NSGV" +this.sal);
	}

	public static void main(String[] args) {
		ThisExample e1 = new ThisExample();
		//e1.display();
		e1.display(10);
		//ThisExample e2 = new ThisExample();
		//e2.calling(3234.4);
		//System.out.println("e value***************");

	}

}
