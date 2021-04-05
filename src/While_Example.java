public class While_Example {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10)
		{
		  System.out.println("i = " + i);
		  i = i + 1; //if this statement is not specified - it goes into infinite //loop - because the condition will always satisfied it nevers comes out //of the while loop
		}
		i = 10;
		while(i>0){
			System.out.println("i = " + i);
			i = i - 2;
		}
	}
}
