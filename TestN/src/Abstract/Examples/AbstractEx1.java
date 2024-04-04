package Abstract.Examples;
abstract class Bike1
{
	abstract void run();
	void speed (int spd)
	{
		System.out.println("Bike Speed is"+spd);
	}
}
class Honda extends Bike1
{
	void run()
	{
		System.out.println("running safely");
	}
	void speed(int spd)
	{
		System.out.println("Honda  Speed is"+spd);
		super.speed(123);
	}
	void colour()
	{
		System.out.println("Honda  colour is blue");
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
		Honda h=new Honda();
h.colour();
h.speed(125);
h.run();
System.out.println("*********************");
Bike1 a=new Honda();
a.run();
	}

}
