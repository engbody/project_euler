
public class th_prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int largestPrime = 2;
		int count = 0;
		int numPrime = 1;
		int i = 3;
		while (numPrime < 10001)
		{
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					count ++;
				}
			}
			if (count == 0)
			{
				largestPrime = i;
				numPrime++;
			}
			count = 0;
			i ++;
		}
		System.out.print(largestPrime);
	}

}
