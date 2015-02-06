
public class even_fibonacci {

	/**
	 * @param args
	 * @return
	 */
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		int evenSum = 2;
		while (sum < 4000000)
		{
			sum = num1 + num2;
			num1 = num2;
			if (sum < 4000000)
			{
				num2 = sum;
				if (sum % 2 == 0)
				{
					evenSum += sum;
				}
			}
		}
		System.out.println("Sum: " + evenSum);
	}
}