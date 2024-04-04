package Day.Polymorphism;


class Hillstations
{
	void location()
	{
		System.out.println("Location is");
	}
	void famousfor()
	{
		System.out.println("Famous for");
	}
	
}
class Manali extends Hillstations
{
	void location()
	{
		System.out.println("Manali is in Himachal Pradesh");
	}
	void famousfor()
	{
		System.out.println("It is Famous for Hadimba Temple");
	}
}
	class Mussoorie extends Hillstations
	{
		void location()
		{
			System.out.println(" Mussoorie is in Uttarakhand");
		}
		void famousfor()
		{
			System.out.println("It is Famous for Education Institutions");
		}
	}
		class Gulmarg extends Hillstations
		{
			void location()
			{
				System.out.println("Mussoorie is in J&K");
			}
			void famousfor()
			{
				System.out.println("It is Famous for skiing");
			}
		}
		 class RunTime {
	public static void main(String[] args) {
		 Hillstations h=new  Hillstations();
		 h.location();
		 h.famousfor();
		 System.out.println("****************************");
		 Hillstations ma=new  Manali();
		 ma.location();
		 ma.famousfor();
		 System.out.println("****************************");
		 Hillstations m=new   Mussoorie ();
		 m.location();
		 m.famousfor();
		 System.out.println("****************************");
		 Hillstations g=new Gulmarg();
		 g.location();
		 g.famousfor();
		
	}
	}


