package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  
	ChromeDriver chrome;
  
  @Test(priority=1)
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ASDM\\Workspace\\chromedriver.exe");
	chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://opensource-demo.orangehrmlive.com");
  	}
  
  @Test(priority=2)
  public void login() {
	   chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
		}
  
  @Test(priority=3)
  public void admintest() {
	  /*
	  chrome.findElement(By.linkText("Admin")).click();
		WebElement userdd = chrome.findElement(By.id("searchSystemUser_userType"));
		
		Select userType = new Select(userdd);
		userType.selectByIndex(1);
		*/
	  
	  WebElement Admin=chrome.findElement(By.linkText("Admin"));
	  		if(admin.isDisplayed())
	  		{
	  			System.out.println("Admin is present");
	  			String actual=Admin.gettext();
	  			
	  		
		
		
		
	   
  }
  
  
  
  @Test(priority=4)
  public void pimtest() {
	  WebElement PIM=chrome.findElement(By.linkText("PIM"));
	  Actions mouseHover = new Actions(chrome);
	mouseHover.moveToElement(PIM).build().perform();
	
	WebElement Reports=chrome.findElement(By.linkText("Reports"));
	mouseHover.moveToElement(Reports).build().perform();
	chrome.findElement(By.linkText("Reports")).click();
	
	  
  
  }
  
 
  @Test(priority=5)
  public void logouttest() throws Exception {
	  
	  chrome.findElement(By.id("welcome")).click();
	  Thread.sleep(2000);
	  chrome.findElement(By.linkText("Logout")).click();
	  
  }
  
  
  
  
  
}

