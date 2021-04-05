package JavaPack;
public class Array_Example {
	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0]  = 34;
		arr[1] = 56;
		arr[2] = 67;
		arr[3] = 78;
		for(int i = 0;i<arr.length;i++)
		{
			 System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		String[][] emp = new String[3][3];
		emp[0][0] = "100";
		emp[0][1] = "Rakesh";
		emp[0][2] = "ITC";
		emp[1][0] = "101";
		emp[1][1] = "Punitha";
		emp[1][2] = "Samsung";
		emp[2][0] = "102";
		emp[2][1] = "Lakshmi";
		emp[2][2] = "Reliance";
		for(int r = 0;r <emp.length;r++)
		{
		 for(int c=0;c<emp[r].length;c++)
		  {
		     System.out.print("emp["+r+"]["+c+"] = " + emp[r][c] + "\t");
		  }
		  System.out.println("");
		}
	}
}
