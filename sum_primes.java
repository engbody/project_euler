
public class sum_primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long numPrime = 2000000L;
		int count = 0;
		long sum = 2L;
		int j = 2;
		for (int i = 3; i < numPrime + 1; i++)
		{
			while ( j < (Math.sqrt(i)+1) && count == 0)
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
