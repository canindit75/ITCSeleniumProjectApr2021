package JavaOOPSPack;
//Demo of Inheritance
public class CarTest {
	public static void main(String[] args) {
		//Create an instance of child class Car and access 
		//the properties and behavior of parent class
		Car c1 = new Car();
		System.out.println(c1.speed);
		c1.Run();
	}
}
