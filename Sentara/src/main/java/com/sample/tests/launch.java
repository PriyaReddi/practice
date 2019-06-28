package com.sample.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "E://practice//PracticeUdemy//src//main//resources//chromedriver.exe");
  	     WebDriver driver=new ChromeDriver();
  	     driver.get("https://www.amazon.com/");
  	     driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
  	     driver.findElement(By.id("ap_email")).sendKeys("priyankap7491@gmail.com");
  	     driver.findElement(By.id("ap_password")).sendKeys("Lordsiv@123");
  	     driver.findElement(By.id("signInSubmit")).click();
  	     String title=driver.getTitle();
  	     System.out.println(title);
	}

}
