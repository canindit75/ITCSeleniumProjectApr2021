package JavaOOPSPack;
public class StringManipulations {
	public static void main(String[] args) {
		String s = "Online Training on Selenium";
		//length
		System.out.println("Length of the String is " + s.length());
		System.out.println("Convert to Upper Case = " + s.toUpperCase());
		System.out.println("Convert to Lower Case = " + s.toLowerCase());
		System.out.println("First Index Position of i = " + s.indexOf("i"));
		System.out.println("Char  at 3rd Index Position = "+s.charAt(3));
		String browser = "  Chrome  ";
		//String browser1 = browser.trim().toLowerCase();
		if(browser.trim().equalsIgnoreCase("chrome"))
		//if(browser.trim().toLowerCase().equals("chrome"))
			System.out.println("Chrome Browser - Match Found");
		else
			System.out.println("Chrome Browser - Match Not Found");	
		String sprice1 ="$1000";
		//substring 
		//String p = sprice1.substring(1,sprice1.length());
		String p = sprice1.substring(1);
		System.out.println("p = " + p);
		int price = Integer.parseInt(p);
		String sprice2 = "100.5$";
		String p2 = sprice2.substring(0,sprice2.length() -1 );
		System.out.println("p2 = " + p2);
		double price2 = Double.parseDouble(p2);
		
		System.out.println("starts with Online = " + s.startsWith("Online"));
		System.out.println("starts with Oneline = " + s.startsWith("Oneline"));
		System.out.println("ends with Selenium = " + s.endsWith("Selenium"));
		System.out.println("contains Training = " + s.contains("Training"));
		
		System.out.println("concatenate with in Bangalore = " + s.concat(" in Bangalore"));
		s = s.concat(" in Bangalore");
		System.out.println("concatenate with in Bangalore = " + s);
		System.out.println("Replace Bangalore with Bombay = " + s.replace("Bangalore", "Bombay"));
	}
}