import java.util.ArrayList;


public class smallest_multiple {
	
	public static void main(String[] args) {
		int[] num = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> myList = new ArrayList<Integer>();
		int current = 0;
		for (int i = 0; i < num.length; i++)
		{
			current = num[i];
			for (int j = num.length - 1; j > -1; j--)
			{
				if (current % num[j] == 0 && i != j)
				{
					current /= num[j];
				}
			}
			myList.add(current);
		}
		int total = 1;
		for (int i = 0; i < myList.size(); i++)
		{
			total *= myList.get(i);
			System.out.println(i + 2 + ":" + myList.get(i));
		}
		//multiply answer by 4
		System.out.println("Ans: " + total*4);
	}
}
