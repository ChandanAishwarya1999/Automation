package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.switchTo().alert().accept();
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class=\"col-md-4 col-xs-12 firstulfooter\"]"));
		for (int i = 1; i <alllinks.size(); i++) {
			String links = alllinks.get(i).getText();
			System.out.println(links);
		}

	}
}
