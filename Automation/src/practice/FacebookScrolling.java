package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookScrolling {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement sign = driver.findElement(By.linkText("Sign Up"));
	Actions a=new Actions(driver);
	//a.scrollByAmount(0, 50).perform();
	a.scrollToElement(sign).perform();
	

	}

}
