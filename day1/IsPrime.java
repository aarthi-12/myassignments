package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 97;
		int remainder = 0;
		for(int i = 2; i < num; i++)
		{
			remainder = num%i;
			if (remainder==0)
			{
				break;
			}
		}
if (remainder!=0)
{
	System.out.println("Given number" +num+ "is a prime number");
}
else
{
	System.out.println("Given number" +num+ "is a not prime number");
}
	}

}
