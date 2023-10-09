package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		List<WebElement> d1 = driver.findElements(By.xpath("//div[@class='dragableBox' and not(contains(@id,'DHTML'))]"));
		List<WebElement> d2 = driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		Actions a=new Actions(driver);
		for (int i = 0; i<d2.size(); i++) {
			WebElement ele1 = d1.get(i);
			WebElement ele2 = d2.get(i);
			a.dragAndDrop(ele1, ele2).perform();
			
		}
	}

}
