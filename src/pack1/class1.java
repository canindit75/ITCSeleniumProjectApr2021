package pack1;
import pack2.class4;
public class class1 {
	protected int var1=100;
	protected void method1(){
		System.out.println("method1");
	}
	
	public static void main(String[] args){
		class4 c4 = new class4();
		System.out.println(c4.var1);
		c4.method1();
	}
}
