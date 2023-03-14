package week1.day2;

public class printDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,8,9,7,2,6,8,7};
		for (int i=0;i<numbers.length;i++)
		{
			for (int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					System.out.println(numbers[i]);
				}
			}
		}

	}

}
