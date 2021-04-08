package testngPack;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testngExample2 {
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("AfterMethod");
	}

	@Test(priority=0)
	public void Login(){
		System.out.println("Login");
	}
	@Test(priority=1)
	public void AccountEnquiry(){
		System.out.println("AccountEnquiry");
	}
	@Test(priority=2)
	public void FundTransfer(){
		System.out.println("FundTransfer");
	}
	@Test(priority=3)
	public void LogOff(){
		System.out.println("LogOff");
	}
}
