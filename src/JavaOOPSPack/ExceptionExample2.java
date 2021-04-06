package JavaOOPSPack;
public class ExceptionExample2 {
	public static void ValidateAge(int age) throws Exception{
		if (age <18)
			throw new Exception("Age is less than 18");
	}
	public static void main(String[] args) throws Exception {
		try{
		int age = 17;
		ValidateAge(age);
		}catch(Exception e){
			if(e.getMessage().equals("Age is less than 18")){
				System.out.println("Message Match Found");
			}
		}
	}
}
