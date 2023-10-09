package practice;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo2 {
	
	@Test(priority = 3,dependsOnMethods = "demoB")
	public void demoA() {
		//Assert.fail();
		System.out.println("Hi");
	}
	
	@Test(priority = 1,enabled = true,dependsOnMethods = "demoA")
public void demoB() {
	System.out.println("Hello");
}
	
	@Test(priority = 2,invocationCount = 2)
public void demoC() {
	System.out.println("Bye");
	
}
}
