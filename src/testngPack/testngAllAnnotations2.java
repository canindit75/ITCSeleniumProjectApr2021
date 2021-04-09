package testngPack;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngAllAnnotations2 {
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("testngAllAnnotations 2  - Before Suite");
	}
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("testngAllAnnotations 2 - Before Test");
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("testngAllAnnotations 2 - Before Class");
	}
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("testngAllAnnotations 2 - Before Method");
	}
	@Test
	public  void testngmethod(){
		System.out.println("testing testng");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("testngAllAnnotations 2 - After Method");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("testngAllAnnotations 2 - After Class");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("testngAllAnnotations 2 - After Test");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("testngAllAnnotations 2 - After Suite");
	}
}
