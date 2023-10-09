package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOginToActitime1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p1=new Properties();
		p1.load(fis);
		String url = p1.getProperty("url");
		String un = p1.getProperty("username");
		String pwd = p1.getProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ' ]")).click();
	}

}
