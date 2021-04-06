package JavaOOPSPack;
public class ExceptionExample1 {
	public static void main(String[] args) {
		try{
		int n1 = 10;
		int n2 = 10;
		int Result = n1/n2; 
		System.out.println("Result = " + Result);
		int[] arr = new int[4];
		arr[3] = 45;
		System.out.println("arr[3] = " + arr[3]);
		String s = "Hello";
		System.out.println("Length of s = " + s.length());
		String qty = "56";
		int iqty = Integer.parseInt(qty);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception ="+e.getMessage());
			//e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBounds Exception ="+e.getMessage());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException ="+e.getMessage());
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException ="+e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Rest of Code");
	}
}
