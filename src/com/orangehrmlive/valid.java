package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class valid {
private static final String String = null;
ChromeDriver chrome;
	
	@DataProvider(name="credentials")
	public Object[][] dataSet()
	{
		return new Object[][]
				{
					{"Ad","admin"},
					{"Admin","admin123"},
					{"linda.anderson","linda.anderson"},
					{"xyz","xyz123"}
					
					
				};
	}
	

 /* @org.testng.annotations.Parameters({"chKey"})
	@BeforeTest
  public void openBrowser(String key) {
	  System.setProperty(key, "D:\\ASDM\\Workspace\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com");
		
  }
*/
  @Test(dataProvider="credentials")
  public void loginTest(String un,String pwd) throws Exception
  {
	  System.setProperty(key, "D:\\ASDM\\Workspace\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com");
	  	  chrome.findElement(By.name("txtUsername")).sendKeys(un);
		chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
		chrome.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		try
		{
			WebElement error = chrome.findElement(By.id("spanMessage"));
			
			boolean err=error.isDisplayed();
			
			if(err)
			{
				System.out.println("Invalid Credentials");
			}
		}
		catch (Exception e)
		{
			chrome.findElement(By.id("welcome")).click();
			  Thread.sleep(2000);
			  chrome.findElement(By.linkText("Logout")).click();
		}
		
		
		
		
  }
  
  
 
} 
  
  
  
	  
	  
	  
  

