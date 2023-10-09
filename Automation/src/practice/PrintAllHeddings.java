package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllHeddings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);	
		}
		List<WebElement> element = driver.findElements(By.tagName("h2"));
		int count = element.size();
		System.out.println(count);
		for(int i=1;i<count;i++) {
			String text = element.get(i).getText();
			System.out.println(text);
		}
	}
}