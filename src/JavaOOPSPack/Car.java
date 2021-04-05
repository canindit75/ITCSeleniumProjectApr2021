package JavaOOPSPack;
//Demo of Inheritance
public class Car extends Vehicle {
	double speed = 50;
	public Car(){
		//System.out.println("Car - Default Constructor");
		super();
	}
	public void Run(){
		//System.out.println("Car - Run Method");
		super.Run(); //This will point to the parent implementation
		//please note we are making a call to parent implementation via child class method
		System.out.println(super.speed); //100 
	}
}
