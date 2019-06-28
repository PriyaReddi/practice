package com.tyss.RunnerClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import com.tyss.CommonUtilities.Utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "Features" ,
glue= {"com.tyss.stepdefination" , "com.tyss.RunnerClass"} , tags= {"@amazon"})
public class Runner extends AbstractTestNGCucumberTests
{
	WebDriver driver;
	Utilities u;
	Properties pobj;
	
	@BeforeClass
    public void launchApp() throws Throwable
    {
   	 System.setProperty("webdriver.chrome.driver", "E://practice//Sentara//src//main//resources//chromedriver.exe");
   	 driver=new ChromeDriver();
   	 Reporter.log("Launching browser..");
   	 driver.manage().window().maximize();
   	pobj = u.getProperty();
   	String url = pobj.getProperty("url");
   	driver.get(url);
   	Reporter.log("Launching url..");
    }
}
