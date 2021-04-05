package JavaPack;
public class Switch_Example {
	public static void main(String[] args) {
		int weekday = 5;
		switch(weekday){
			case 0 :System.out.println("Monday");break;
			case 1 :System.out.println("Tuesday");break;
			case 2 :System.out.println("Wednesday");break;
			case 3 :System.out.println("Thursday");break;
			case 4 :System.out.println("Friday");break;
			case 5 :System.out.println("Saturday");break;
			case 6 :System.out.println("Sunday");break;
			default: System.out.println("Invalid Weekday");break;
		}

		String wday = "Mon";
		switch(wday){
			case "Mon" :System.out.println("Monday");break;
			case "Tue" :System.out.println("Tuesday");break;
			case "Wed" :System.out.println("Wednesday");break;
			case "Thur":System.out.println("Thursday");break;
			case "Fri" :System.out.println("Friday");break;
			case "Sat" :System.out.println("Saturday");break;
			case "Sun" :System.out.println("Sunday");break;
			default: System.out.println("Invalid Weekday");break;
		}
	}
}
