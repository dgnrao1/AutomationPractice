package Inheritance.Examples;

class Fruits

{int fruitAge;
	Fruits() {
		System.out.println("I am fruit class");
		fruitAge = 7;
	}

	public void taste() {
		System.out.println(" fruit are sweet");
	}
}

class Orange extends Fruits {
	int fruitAge;

	Orange() {
		System.out.println("I am orange class");
		fruitAge = 5;
	}

	public void taste() {
		System.out.println(" orange are sweet");
	}

	public void shape() {
		System.out.println(" orange is round");
		System.out.println(" orange fruitAge:" + fruitAge);
		System.out.println(" orange are sweet:" + super.fruitAge);
		taste();
		super.taste();
	}
}

public class UsingSuper {

	public static void main(String[] args) {
		 Orange r=new  Orange();
		 r.taste();
		 r.shape();
	}

}
