package com.GreyHR_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver; 
 public LoginPage(WebDriver rdriver) throws InterruptedException{
	 Thread.sleep(5000);
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath ="//input[@placeholder='Employee No']\"")
	WebElement userEId;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement userPwd;
	@FindBy(xpath = "//button[@type='submit']")
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

