package JavaOOPSPack;
//Demo for method 
public class Calculate {
	public void Sum1(int n1, int n2){
		int sum = 0;
	        sum = n1 + n2;
	        System.out.println("sum = "  + sum);
	}
	public int Sum2(int n1, int n2){
		int sum = 0;
	        sum = n1 + n2;
	       // System.out.println("sum = "  + sum);
	       return sum; 
	}
	public static int Sum3(int n1, int n2){
		int sum = 0;
	        sum = n1 + n2;
	       // System.out.println("sum = "  + sum);
	       return sum; 
	}
	public static void main(String[] args){
		 //to access an non static method of any class, first we need to create an instance of the class
		   Calculate c1 = new Calculate();
		   c1.Sum1(10,11);
		   int s = c1.Sum2(23, 45);
		   System.out.println("sum = " + s);
		   s = c1.Sum2(10, 20);
		   System.out.println("sum = " + s);
		   s = c1.Sum2(30, 40);
		   System.out.println("sum = " + s);
		   s = Calculate.Sum3(45, 67); //static method allows to call the method directly without creating an object instance
		   System.out.println("sum = " + s);
		}
}
