
public class powerDigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a;
		int totalLength = 0;
		char b;
		for (int i = 1; i < 1001; i++)
		{
			a = Integer.toString(i);
			for (int j = 0; j < a.length(); j++)
			{
				b = a.charAt(j);
				if (b == '1' && b == '2' && b == '6')
				{
					totalLength += 3;
				}
				else if (b == '4' && b == '5' && b == '9')
				{
					totalLength += 4;
				}
				else if (b == '3' && b == '7' && b == '9')
				{
					totalLength += 5;
				}
			}
		}
	}

}
