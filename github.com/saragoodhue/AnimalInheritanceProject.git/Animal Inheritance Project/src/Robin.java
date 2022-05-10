
public class Robin extends Bird
	{
		public Robin()
			{
				name = "Robin";
				food = "Worm";
			}

		public void bearsYoung()
			{
				System.out.println("A Baby Robin!");
			}
		public void eats()
			{
				System.out.println("The " + name + " eats " + food);
			}

		public void makesNoise()
			{
				System.out.println("Chirp");
			}

	}
