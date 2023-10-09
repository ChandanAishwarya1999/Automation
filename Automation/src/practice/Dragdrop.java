package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement b3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Thread.sleep(2000);
		WebElement b1 = driver.findElement(By.id("column-1"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.dragAndDrop(b3, b1).perform();
	}

}
