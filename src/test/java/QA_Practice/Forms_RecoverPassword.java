package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Forms_RecoverPassword {
	WebDriver driver = new ChromeDriver();
	
	
	@Test(priority=1,description="Invalid")
	public void T1() throws InterruptedException 
	{
		        driver.findElement(By.id("email")).sendKeys("invalid");
			 	Thread.sleep(2000);
			 	driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
			 	Thread.sleep(2000);
			 	driver.findElement(By.id("email")).clear();
	}

	@Test(priority=2,description="invalid")
	public void T2() throws InterruptedException 
	{
		        driver.findElement(By.id("email")).sendKeys("invalid@");
		        Thread.sleep(2000);
			 	driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
			 	Thread.sleep(2000);
			 	driver.findElement(By.id("email")).clear();
	
	}
	
	@Test(priority=3,description="Valid")
	public void T3() throws InterruptedException 
	{ 
		        driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		        Thread.sleep(2000);
			 	driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
			 	Thread.sleep(2000);
			 	driver.findElement(By.id("email")).clear();
	
	}
	
//	 
  
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException
  
  {
	  driver.get("https://qa-practice.netlify.app/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(" //*[@id=\"forms\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("recover-password")).click();
	  Thread.sleep(2000);
  }
  
  

  @AfterTest
  public void afterTest()
  
  {
	  
	  driver.quit();
  }

}
