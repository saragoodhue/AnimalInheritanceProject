
public class Penguin extends Bird
	{
		public Penguin()
			{
				name = "Penguin";
				food = "Sardines";
			}

		public void bearsYoung()
			{
				System.out.println("A Baby Penguin!");
			}
		public void eats()
			{
				System.out.println("The " + name + " eats " + food);
			}

		public void makesNoise()
			{
				System.out.println("Aaaaiiiii");
			}

	}
