
public class counting_sundays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int years = 100;
		int days = 0;
		int dayOfWeek = 2; //Jan 1 1901 Tuesday
		int month = 1;
		int leapYear = 1;
		int count = 0;
		while (years > 0)
		{
			month = 1;
			while (month < 13)
			{
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				{
					days = 31;
				}
				else if (month == 2 && leapYear == 4)
				{
					days = 29;
				}
				else if (month == 2)
				{
					days = 28;
				}
				else
				{
					days = 30;
				}
				for (int i = 0; i < days; i++)
				{
					dayOfWeek++;
					if (dayOfWeek == 8)
					{
						dayOfWeek = 1;
					}
					if(i == 0 && dayOfWeek == 7)
					{
						count++;
					}
				}
				month++;
				leapYear++;
				if (month == 13)
				{
					years--;
					month = 1;
				}
				if (leapYear == 5)
				{
					leapYear = 1;
				}
			}
			System.out.println(count);
		}

	}

}
