package QA_Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contact

{
	WebDriver driver= new ChromeDriver();
	
	 @Test(priority=1,description="Invalidemail")
	  public void T1() throws InterruptedException 
	  {
		        driver.findElement(By.xpath("//*[@id=\"content\"]/section/p/a")).click();
		        Thread.sleep(10000);
		        driver.findElement(By.name("name")).sendKeys("Arya");
				driver.findElement(By.name("email")).sendKeys("admin123@gmail.com");
				Thread.sleep(1000);
			
	  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException
  
  {
	  driver.get("https://qa-practice.netlify.app/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.id("contact")).click();
	  Thread.sleep(2000);
	 
  }
  
  

  @AfterTest
  public void afterTest()
  
  {
	  
	  
  }

}
