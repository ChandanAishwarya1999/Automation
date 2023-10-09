package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PIB {

	public static void main(String[] args) {
		ChromeOptions d = new ChromeOptions();
		d.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(d);
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Ministry of Education")).click();
		driver.switchTo().alert().accept();
	Set<String> haldle = driver.getWindowHandles();
		for (String string : haldle) {
			driver.switchTo().window(string);	
		}
		String element = driver.getTitle();
		
		System.out.println(element);

	}

}
