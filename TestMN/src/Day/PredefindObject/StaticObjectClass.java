package Day.PredefindObject;

class Demo {
	void testing() {
		System.out.println("I am testing method of Demo class");
	}

	public class StaticObjectClass {
		static Demo obj = new Demo();

		public static void main(String[] args) {

			Demo d1 = new Demo();
			d1.testing();
			StaticObjectClass.calling();
			StaticObjectClass.obj.testing();

		}

		static void calling() {
			System.out.println("I am calling method of StaticObjectClass  class ");
		}

	}
}
