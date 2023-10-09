package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class VerifyTitle1 {
	@Test
	public void google() {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String expectedTitle="Googly";
//		Assert.assertEquals(title,expectedTitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, expectedTitle);
		driver.quit();
		s.assertAll();
	}
}
