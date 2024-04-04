package This.KeywordEx1;

public class ThisStatement {
int age;
double sal;
ThisStatement()
{
	System.out.println("****I am zero para******");
}
ThisStatement(int num)
{this();
	System.out.println("****I am int para******");
	age=num;
}
ThisStatement(double sa)
{this(10);
	System.out.println("****I am double para******");
}


	public static void main(String[] args) {
		ThisStatement  e1=new ThisStatement (25.56);

	}

}
