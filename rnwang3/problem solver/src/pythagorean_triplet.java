
public class pythagorean_triplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1000 - a - b;
		for (int i = 1; i < 999; i++)
		{
			for (int j = 1; j < (1000 - i); j++)
			{
				a = i;
				b = j;
				c = 1000 - a - b;
				if (((a*a) + (b*b)) == (c*c))
				{
					System.out.println("A: " + a);
					System.out.println("B: " + b);
					System.out.println("C: " + c);
					System.out.println(a*b*c);
				}
			}
		}
	}

}
