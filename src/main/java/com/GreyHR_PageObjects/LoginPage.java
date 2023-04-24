package com.GreyHR_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver; 
 public LoginPage(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//input[@id='username' or @name='username']")
	WebElement userEId;
	@FindBy(xpath="//*[contains(@id,'password')]")
	WebElement userPwd;
	@FindBy(xpath = "//button[text( )=' Log in '] ")
	WebElement login;
	public void setemailid(String eid) throws InterruptedException {
		userEId.sendKeys(eid);
		Thread.sleep(3000);
	}
	public void setepwd(String pwd) throws InterruptedException {
		userPwd.sendKeys(pwd);
		Thread.sleep(3000);
	}
	public void clicklogin() {
		login.click();
	}
	
}

