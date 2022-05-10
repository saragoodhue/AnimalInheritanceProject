
public class Bat extends Mammal
	{
		public Bat()
			{
				name = "Bat";
				food = "Insects";
			}

		public void bearsYoung()
			{
				System.out.println("A Baby Bat!");
			}
		public void eats()
			{
				System.out.println("The " + name + " eats " + food);
			}

		public void makesNoise()
			{
				System.out.println("Eek!");
			}

	}
