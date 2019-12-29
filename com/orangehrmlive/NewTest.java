package com.orangehrmlive;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//opens the browser window
		ChromeDriver chrome = new ChromeDriver();
		//Enters thr url
		chrome.get("https://opensource-demo.orangehrmlive.com");
		//Locates the username field and pass the data
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		WebElement admin = chrome.findElement(By.linkText("Admin"));
		
		
		Actions mouseHover = new Actions(chrome);
		mouseHover.moveToElement(admin).build().perform();
		
		WebElement job = chrome.findElement(By.linkText("Job"));
		mouseHover.moveToElement(job).build().perform();
		
		
		
		Thread.sleep(2000);


  }
}
