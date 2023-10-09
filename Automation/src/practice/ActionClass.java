package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.id("navbarLandings"));
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.id("navbarPages"));
		a.contextClick(ele1).perform();
		Thread.sleep(4000);
		driver.close();
	}

}
