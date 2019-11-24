package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class Day3 {
	
	@BeforeClass
	public void befoclass() {
		//selenium
		System.out.println("before executing any method in the class");
		
	}
	
	@Parameters({"URL","APIKey/UserName"})
	@Test(groups= {"Smoke"})
	public void WeblogincarLoan(String urlname,String key) {
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery() {
		//selenium
		System.out.println("I will execute before every test method in Day 3 class");
		
	}
	
	@AfterMethod
	public void afterevery() {
		//selenium
		System.out.println("I will execute after every test method in Day 3 class");
	}
	
	
	@AfterClass
	public void aftclass() {
		//selenium
		System.out.println("after executing all method in the class");
		
	}
	@Test
public void MobilelogincarLoan() {
		//Appium
		System.out.println("mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite() {
				System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobilesignincarLoan() {
		//Appium
		System.out.println("mobilesignincar");
	}
	
	//@Test(timeOut=4000)
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username,String password) {
		//Appium
		System.out.println("mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
	}
	
	//@Test(dependsOnMethods= {"WeblogincarLoan","MobilesignoutcarLoan"})
	@Test(dependsOnMethods= {"WeblogincarLoan"})
	public void LoginAPIcarLoan() {
		//Rest API Automation
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination username password - good credit history
		//2nd - username password - no credit history
		//3rd - fraudulent credit history
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//2nd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
	
}
}
