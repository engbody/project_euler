
public class Largest_prime_factor {

	public static void main(String[] args) {
		long num = 600851475143L;
		long last = 1;
		for (long i = 2; i < num + 1; i++)
		{
			while (num % i == 0)
			{
				num = num / i;
				last = i;
			}
		}
		System.out.println(last);
	}
}
