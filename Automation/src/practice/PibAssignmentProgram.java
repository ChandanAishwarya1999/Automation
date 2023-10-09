package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class PibAssignmentProgram {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.switchTo().alert().accept();
		driver.findElements(By.linkText("Ministry of Information and Broadcasting"));
		driver.quit();
	}
}
