package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AjioApplication {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Actions a=new Actions(driver);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='level-first false']/li"));
		for (int i = 0; i<ele.size(); i++) {
			WebElement all = ele.get(i);
			Thread.sleep(2000);
			a.moveToElement(all).perform();
		}
	}
}
