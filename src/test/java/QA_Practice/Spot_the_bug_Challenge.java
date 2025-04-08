package QA_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Spot_the_bug_Challenge
{
	
	WebDriver driver =new ChromeDriver();
  @Test(priority=1,description="Invalidemail")
  public void f1() throws InterruptedException 
  
  {
	  driver.findElement(By.id("firstName")).sendKeys("Arya123");
	  driver.findElement(By.id("lastName")).sendKeys("Lekshmi");
	  driver.findElement(By.id("phone")).sendKeys("9874563212");
	  WebElement country =driver.findElement(By.id("countries_dropdown_menu"));
		Select s = new Select(country);
		s.selectByValue("India"); 
		Thread.sleep(1000);
	  driver.findElement(By.id("emailAddress")).sendKeys("arya123@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Arya1234");
	  driver.findElement(By.id("registerBtn")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("firstName")).clear();
	  driver.findElement(By.id("lastName")).clear();
	  driver.findElement(By.id("phone")).clear();
//	 driver.findElement(By.id("countries_dropdown_menu")).clear();
	  driver.findElement(By.id("emailAddress")).clear();
	  driver.findElement(By.id("password")).clear();
	  Thread.sleep(3000);
  }
  @Test(priority=2,description="Invalidemail")
public void f2() throws InterruptedException 

{
	  driver.findElement(By.id("firstName")).sendKeys("Arya123");
	  driver.findElement(By.id("lastName")).sendKeys("Lekshmi");
	  driver.findElement(By.id("phone")).sendKeys("9874563212");
	  WebElement country =driver.findElement(By.id("countries_dropdown_menu"));
		Select s = new Select(country);
		s.selectByValue("India"); 
		Thread.sleep(1000);
	  driver.findElement(By.id("emailAddress")).sendKeys("arya123@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Arya1234");
	  driver.findElement(By.id("registerBtn")).click();
	  Thread.sleep(3000);
}
  
  
  @BeforeClass
  public void beforeClass() throws InterruptedException
  
  {
	driver.get("https://qa-practice.netlify.app/"); 
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"bugs-form\"]")).click();
	Thread.sleep(2000);  
  }

  @AfterClass
  public void afterClass() 
  
  {
	  
	driver.quit();  
  }

}
