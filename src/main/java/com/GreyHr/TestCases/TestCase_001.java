package com.GreyHr.TestCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.GreyHR_PageObjects.LoginPage;





public class TestCase_001 extends BaseClass
{
@Test
public void logintest() throws InterruptedException {
	driver.get(baseurl);
	
	//logger2.info("urol is open");
	LoginPage lg=new LoginPage(driver);
    lg.setemailid(UserEId);
    lg.setepwd(userPwd);
    lg.clicklogin();
    if(driver.getTitle().equals("GreyHr")) {
    	Assert.assertTrue(true);
    }
    else {
    	Assert.assertTrue(false);
    }
}
	
}
