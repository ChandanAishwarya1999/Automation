package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage(driver);
		l.action("admin1","manager1");
		Thread.sleep(2000);
		l.action("admin","manager");
		HomePage hm = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hm.logout();
		driver.quit();
	}

}
