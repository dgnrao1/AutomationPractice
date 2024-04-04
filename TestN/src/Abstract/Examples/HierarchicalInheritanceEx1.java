package Abstract.Examples;

import java.net.Socket;

abstract class RBIBank
{
	abstract double getRateOfIntrestForHomeLoan();
	final void loan()
	{
		System.out.println("As pre RBI Loan");
	}
}
class SBI extends RBIBank
{
	 double getRateOfIntrestForHomeLoan()
	 {
		 return 6.45;
	 }
}
class PNB extends RBIBank
{
	 double getRateOfIntrestForHomeLoan()
	 {
		 return 7.4;
	 }
}
	 
public class HierarchicalInheritanceEx1 {

	public static void main(String[] args) {
		
PNB p=new PNB();
System.out.println("PNB Rate of Intrest is :"+p.getRateOfIntrestForHomeLoan()+"%");
p.loan();
SBI s=new SBI();
System.out.println("SBI Rate of Intrest is :"+s.getRateOfIntrestForHomeLoan()+"%");
s.loan();
RBIBank r=new SBI();
System.out.println("RBI reference but SBI object :"+r.getRateOfIntrestForHomeLoan());
RBIBank r1=new PNB();
System.out.println("RBI reference but PNB object  :"+r1.getRateOfIntrestForHomeLoan());
	}

}
