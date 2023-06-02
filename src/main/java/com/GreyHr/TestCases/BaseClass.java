package com.GreyHr.TestCases;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.GreyHR_utilities.ReadConfig;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Read;

public class BaseClass {
	ReadConfig readcofig = new ReadConfig();
	public String baseurl =readcofig.getApplictionurl();
  // public  String baseurl = "https://excelr.greythr.com/";
	public String UserEId = readcofig.getUsername();
    //public String UserEId ="EXLR01437";
	public String userPwd =readcofig.getpassward();
    // public String userPwd ="neelam@02041997";
     public static WebDriver driver;
   //public static Logger logger;
    @Parameters("browser")
     @BeforeClass
 
     public void setup(String br) {
    	
    	if(br.equals("firefox")) 
    	{
    	// WebDriverManager.firefoxdriver().setup();
    	 System.setProperty("webdriver.gecko.driver",readcofig.getfirefoxpath());
    	 driver = new FirefoxDriver();
    	 }
    	 else if(br.equals("chrome")){
    		// WebDriverManager.chromedriver().setup();
    		 System.setProperty("webdriver.chrome.driver",readcofig.getchromepath());
    		ChromeOptions options = new ChromeOptions();
    		
    	   options.addArguments("--remote-allow-origins=*");
    	   driver = new ChromeDriver();
    	 }
    	driver.get(baseurl);
    	
    // Logger = Logger.getLogger("GreyHR");
  //    PropggertyConfigurator.configure("Log4j.property");
   
    }
     
     @AfterClass
     public void teardwown() {
    	 driver.quit();
     }
}
