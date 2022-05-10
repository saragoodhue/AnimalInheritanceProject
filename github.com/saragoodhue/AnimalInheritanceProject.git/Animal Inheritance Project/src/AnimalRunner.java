
public class AnimalRunner
	{

		public static void main(String[] args)
			{
				Animal [] zoo = new Animal [4];
				zoo[0] = new Cow();
				zoo[1] = new Bat();
				zoo[2] = new Penguin();
				zoo[3] = new Robin();
				
				for(Animal a : zoo)
					{
						a.bearsYoung();
						a.eats();
						a.makesNoise();
						System.out.println();
					}

			}

	}
