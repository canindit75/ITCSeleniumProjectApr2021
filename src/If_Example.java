public class If_Example {
	public static void main(String[] args) {
	  int marks = 39; 
		// marks <40 is considered fail
		//marks >=40 is considered pass
	  if(marks>=0 && marks<40)
		  System.out.println("Student failed because score is less than " + marks);
	  else if (marks>=40 && marks<=100)
		  System.out.println("Student passed because score is more than " + marks);
	  else 
		  System.out.println("Invalid Score");
	}
}
