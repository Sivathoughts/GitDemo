package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");		
	}
	
@Test
public void Demo() {
	System.out.println("Hello");
	Assert.assertTrue(false);
}


@AfterSuite
public void Afsuite() {
System.out.println("I am the last no 1");
}

@Test
public void SecondTest() {
	System.out.println("Second Hello");
}
	
}
