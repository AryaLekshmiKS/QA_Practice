package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Form_Registration 

{
	WebDriver driver =new ChromeDriver();
  @Test
  public void f()
  
  {
	  
	  
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  
  {
	  
	  driver.get("https://qa-practice.netlify.app/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(" //*[@id=\"forms\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest()
  {
	  
	  driver.quit();
  }

}
