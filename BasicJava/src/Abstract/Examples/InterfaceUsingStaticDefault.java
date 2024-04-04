package Abstract.Examples;
interface Drawable
{
	void draw();
	default void msg()
	{
		System.out.println("Default Method");
	}
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Rectangle1 implements  Drawable
{
	public void draw()
	{
		System.out.println("drawing Rectangle");
	}
}
public class InterfaceUsingStaticDefault  {

	public static void main(String[] args) {
		Drawable d=new Rectangle1();
d.draw();
d.msg();

	}

}
