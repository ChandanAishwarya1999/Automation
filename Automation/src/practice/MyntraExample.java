package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraExample {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='desktop-navLink']"));
		for (int i = 0; i <ele.size(); i++) {
			WebElement aele = ele.get(i);
			Thread.sleep(2000);
			a.moveToElement(aele).perform();
		}
			for (int i = ele.size()-1; i >=0; i--) {
				WebElement aele = ele.get(i);
				Thread.sleep(2000);
				a.moveToElement(aele).perform();
			}
		}
	}