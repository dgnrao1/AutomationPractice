package Abstract.Examples;
interface Bank
{
	
	float rateOfIntrest();
}
class Sbi1 implements Bank
{
 public float rateOfIntrest()
 {
	 return 9.12f;
 }
 
}
class Pnb1 implements Bank
{
 public float rateOfIntrest()
 {
	 return 9.1f;
 }
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Sbi1 s=new Sbi1();
		System.out.println("SBI ROI:"+s.rateOfIntrest());
		Pnb1 p=new Pnb1();
		System.out.println("SBI ROI:"+p.rateOfIntrest());
		Bank b=new Sbi1();
		System.out.println("SBI ROI:"+b.rateOfIntrest());


	}

}
