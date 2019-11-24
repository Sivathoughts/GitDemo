package Test;

import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class Day4 {
	
	@Test
	public void WebloginHomeLoan() {
		//selenium
		System.out.println("webloginhome");
		
	}
	
	@Test(groups= {"Smoke"})
public void MobileloginHomeLoan() {
		//Appium
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		//Rest API Automation
		System.out.println("APIloginhome");
	}
	
}
