
public class sum_square_difference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum_of_squares = 0;
		int square_of_sums = 0;
		for (int i = 1; i < 101; i++)
		{
			sum_of_squares += i*i;
			square_of_sums += i;
		}
		square_of_sums *= square_of_sums;
		System.out.print(square_of_sums-sum_of_squares);
	}

}
