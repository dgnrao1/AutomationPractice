package Abstract.Examples;
abstract class Shape
{
	abstract void draw();
	
	
}
class Rectangle extends Shape
{
	protected void draw()
	{
		System.out.println("Hi Iam Rectangle Class");
	}
}
class Circle extends Shape
{public void draw()
{
	System.out.println("Hi Iam Circle Class");
}
	
}
public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
		Shape r=new Circle();
		r.draw();
	Shape s=new Rectangle();
		s.draw();
	}

}
