package practice;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
@Test
	public void google() {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String expectedTitle="Googly";
		if (title.equals(expectedTitle)) {
			System.out.println("title is same");
			
		} else {
			System.out.println("Not Same");

		}
			driver.quit();
		}
		

	}

