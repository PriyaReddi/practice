package com.sample.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_TableScenario 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "E://practice//PracticeUdemy//src//main//resources//chromedriver.exe");
  	     WebDriver driver=new ChromeDriver();
  	     driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
  	     driver.manage().window().maximize();
  	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  	     int rowCount=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr")).size();
  	     System.out.println(rowCount);
  	     //int colCount=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
  	     List<WebElement> list=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]"));
  	     for(int i=0;i<list.size();i++)
  	     {
  	    	System.out.println(list.get(i).getText());
  	    	
  	     }
  	     //System.out.println(colCount);
  	     //driver.close();

		
		
		/* System.setProperty("webdriver.chrome.driver", "E://practice//PracticeUdemy//src//main//resources//chromedriver.exe");
 	     WebDriver driver=new ChromeDriver();
 	     driver.get("https://money.rediff.com");
 	     int colCount=driver.findElements(By.xpath("//div[@id='div_bseindices']/descendant::ul[1]")).size();
 	     System.out.println(colCount);
 	     int rowCount=driver.findElements(By.xpath("//div[@id='div_bseindices']/descendant::ul[1]/li")).size();
	     System.out.println(rowCount);*/
		
	}

}
