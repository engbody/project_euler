
public class sum_primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numPrime = 2000000;
		int count = 0;
		int sum = 2;
		int j = 2;
		for (int i = 3; i < numPrime + 1; i++)
		{
			while ( j < i && count == 0)
			{
				if (i % j == 0)
				{
					count ++;
				}
				j++;
			}
			if (count == 0)
			{
				sum += i;
			}
			count = 0;
			j = 2;
		}
		System.out.print(sum);
	}

}
