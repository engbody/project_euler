
public class largest_palindrome_product {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		int numLength = 0;
		int largest = 0;
		int length = 0;
		for (int i = 100; i < 1000; i++)
		{
			for (int j = 100; j < 1000; j++)
			{
				num = i*j;
				numLength = Integer.toString(num).length();
				for (int k = 0; k < numLength; k++)
				{
					if (Integer.toString(num).charAt(k) == Integer.toString(num).charAt(Integer.toString(num).length() - k - 1))
					{
						length ++;
					}
				}
				if (length == Integer.toString(num).length() && num > largest)
				{
					largest = num;
				}
				length = 0;
			}
		}
		System.out.println("Largest prime factor: " + largest);
	}

}
