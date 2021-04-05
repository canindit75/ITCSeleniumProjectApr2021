package JavaOOPSPack;
public class Calculator {
	public void Sum(int n1, int n2){
		System.out.println("Sum(int n1,int n2)");
	}
	
	public void Sum(int n1, int n2, int n3){
		System.out.println("Sum(int n1,int n2, int n3)");
	}
	
	public void Sum(int n1, double n2){
		System.out.println("Sum(int n1,double n2)");
	}
	public void Sum(double n1,int n2){
		  System.out.println("Sum(double n1,int n2)");
	}
//Demo for Method Overloading
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		//Implicit Type Promotion - because double can hold bigger data values
		c1.Sum(10,20); //when Sum(int n1,int n2) is commented - this becomes an example of Type Promotion
		//When Sum(double n1,int n2) is added - it does not know  whether 
		//type promote the first parameter or the second parameter
		c1.Sum(10, 20, 30);
		c1.Sum(10, 34.5);
//		c1.Sum("10", "20"); //Example of Undefined
	}
}
