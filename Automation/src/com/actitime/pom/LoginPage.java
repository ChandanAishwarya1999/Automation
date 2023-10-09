package com.actitime.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx; 
	@FindBy(partialLinkText ="Login")
	private WebElement Login; {
	}
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void action(String un,String pwd) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		Login.click();
	}
}