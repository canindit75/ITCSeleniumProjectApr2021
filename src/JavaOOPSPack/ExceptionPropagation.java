package JavaOOPSPack;

public class ExceptionPropagation {

	public static void method1(){
		method2();
	}
	
	public static void method2(){
		method3();
	}
	
	public  static void method3(){
		throw new ArithmeticException();
	}
	public static void main(String[] args) throws InterruptedException {
		method1();
		Thread.sleep(2000);
	}
}
