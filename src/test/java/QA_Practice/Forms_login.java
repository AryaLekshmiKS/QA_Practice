package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Forms_login
{
	WebDriver driver = new ChromeDriver();
  @Test(priority=1,description="Invalidemail")
public void T1() throws InterruptedException 
{
	        driver.findElement(By.name("emailAddress")).sendKeys("Arya@gmail.com");
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
		    Thread.sleep(1000);
		    driver.findElement(By.name("emailAddress")).clear();
		 	driver.findElement(By.name("password")).clear();
		 	Thread.sleep(2000);
}

@Test(priority=2,description="invalidpassword")
public void T2() throws InterruptedException 
{
	        driver.findElement(By.name("emailAddress")).sendKeys("admin@admin.com");
			driver.findElement(By.name("password")).sendKeys("admin1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
		    Thread.sleep(1000);
		    driver.findElement(By.name("emailAddress")).clear();
		 	driver.findElement(By.name("password")).clear();
		 	Thread.sleep(2000);
}

@Test(priority=3,description="casesensitive")
public void T3() throws InterruptedException 
{
	        driver.findElement(By.name("emailAddress")).sendKeys("ADmin@admin.com");
			driver.findElement(By.name("password")).sendKeys("admin1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
		    Thread.sleep(1000);
		    driver.findElement(By.name("emailAddress")).clear();
		 	driver.findElement(By.name("password")).clear();
		 	Thread.sleep(2000);
}

@Test(priority=4,description="valid_credential")
public void T4() throws InterruptedException 
{
	        driver.findElement(By.name("emailAddress")).sendKeys("admin@admin.com");
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
		    Thread.sleep(2000);
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
