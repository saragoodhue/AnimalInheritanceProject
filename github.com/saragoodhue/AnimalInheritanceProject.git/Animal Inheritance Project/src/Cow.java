
public class Cow extends Mammal
	{
		public Cow()
			{
				name = "Cow";
				food = "Grass";
			}

		public void bearsYoung()
			{
				System.out.println("A Baby Cow!");
			}
		public void eats()
			{
				System.out.println("The " + name + " eats " + food);
			}

		public void makesNoise()
			{
				System.out.println("The " + name + " says MOO!");
			}
	}
