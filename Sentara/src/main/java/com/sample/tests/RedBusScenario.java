package com.sample.tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusScenario 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E://practice//PracticeUdemy//src//main//resources//chromedriver.exe");
 	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Yes take me to redBus India']")).click();
		WebElement source=driver.findElement(By.xpath("//input[@id='src']"));
		source.sendKeys("ban");
		Thread.sleep(2000);
		    /*source.sendKeys(Keys.ARROW_DOWN);
		     System.out.println(driver.findElement(By.xpath("//input[@id='src']")).getText());
		     source.sendKeys(Keys.ENTER);*/
		
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@class='autoFill']/descendant::li"));
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@class='autoFill']//descendant::li[@class='selected']"));
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@class='autoFill']//following-sibling::li"));
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='autoFill']//li"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Majestic, Bangalore"))
			{
				list.get(i).click();
				break;
			}
		}
		
		//System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[2]")).getText());
		
	
		/*WebElement dest=driver.findElement(By.id("dest"));
		dest.sendKeys("chennai");
		dest.sendKeys(Keys.ARROW_DOWN);*/
		WebElement des=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		des.sendKeys("CMBT, Chennai");
		des.sendKeys(Keys.ENTER);
		/*List<WebElement> destList=driver.findElements(By.xpath("//input[@id='dest']//following-sibling::ul[@class='autoFill']"));
		System.out.println(destList.size());
		for(int i=0;i<destList.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(destList.get(i).getText().equals("CMBT, Chennai"))
			{
				destList.get(i).click();
				break;
			}
		}*/
		
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//button[text()='>']")).click();*/
		WebElement date=driver.findElement(By.id("onward_cal"));
		String dateValue="24-Jul-2019";
		selectDateByJavaScript(driver,date,dateValue);
		Thread.sleep(2000);
		WebElement returnDate=driver.findElement(By.xpath("//input[@id='return_cal']"));
		String retuendateValue="24-Aug-2019";
		selectReturnDateByJavaScript(driver,returnDate,retuendateValue);
	}
	public static void selectDateByJavaScript(WebDriver driver,WebElement element,String dateValue)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}
	public static void selectReturnDateByJavaScript(WebDriver driver,WebElement element,String dateValue)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}
}


