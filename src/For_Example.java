public class For_Example {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i=i+1)
		{
		  sum = sum + i;
		  System.out.println("i = " + i + " sum = " + sum);
		  if(i == 5)
			  break;
		}
		System.out.println("Sum of 10 numbers = " + sum);
	}
}
