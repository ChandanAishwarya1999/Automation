package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIleUploadPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Desktop/Resume.html");
	driver.findElement(By.id("resume"))
	.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Automation\\data\\Resume.docx");
}
}
