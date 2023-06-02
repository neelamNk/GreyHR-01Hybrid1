package com.GreyHR_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
 Properties pro;
 public void readConfig() {
	   File src = new File(".\\configuration\\confi.properties");
	   try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	} catch (Exception e) {
		System.out.println("exception is"+e.getMessage());
	}}
	   public String getApplictionurl() {
	 String url = pro.getProperty("baseurl");
		return url ;
 }
	   public String getUsername() {
		   String UserEID = pro.getProperty("UserEID");
		return UserEID;
		   
	   }
	   public String getpassward() {
		   String userpwd = pro.getProperty("userpwd");
		return userpwd;
	   }
	   
	   public String getchromepath() {
		   String chromepath = pro.getProperty("chromepath");
		return chromepath;
	   }
	   
	   public String getfirefoxpath() {
		   String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	   }
}
