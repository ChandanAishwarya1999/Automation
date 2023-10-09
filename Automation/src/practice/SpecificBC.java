package practice;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBC {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	  Scanner s = new java.util.Scanner(System.in);
	  String title = s.next();
	  driver.get("https://secure.indeed.com/");
	  driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> handle = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		
		for (String string : handle) {
			driver.switchTo().window(string);
			String actualTitle = driver.getTitle();
			
			if(actualTitle.contains(title)) {
			driver.close();	
			}
			}
	}
}
