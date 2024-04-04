package Day.Polymorphism;
class Bank
{
	float getRateOfIntrest()
	{return 6.2f;
	}
}
class SBI extends Bank
{
	float getRateOfIntrest()
	{return 8.4f;
	}
}
class ICICI extends Bank
{
	float getRateOfIntrest()
	{return 7.3f;
	}
}
class AXIS extends Bank
{
	float getRateOfIntrest()
	{return 9.7f;
	}
}
public class RunTime1 {

	public static void main(String[] args) {
		Bank b=new SBI();//up casting
		System.out.println("SBI Rate of Intrest:"+b.getRateOfIntrest());
		 b=new ICICI();//up casting
		System.out.println("ICICI Rate of Intrest:"+b.getRateOfIntrest());
		 b=new SBI();//up casting
		System.out.println("AXIS Rate of Intrest:"+b.getRateOfIntrest());
	}

}
