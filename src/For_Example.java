public class For_Example {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i=i++)
		{
		  sum = sum + i;
		  System.out.println("i = " + i + " sum = " + sum);
		}
		System.out.println("Sum of 10 numbers = " + sum);
	}
}
