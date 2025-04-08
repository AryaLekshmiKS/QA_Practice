package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ECommerceLogin_AddtoCart_Checkout 
{
	WebDriver driver =new ChromeDriver();
	
	
//  @Test(priority=1,description="Invalidemail")
//  public void T1() throws InterruptedException 
//  {
//	        driver.findElement(By.name("emailAddress")).sendKeys("Arya@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("admin123");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
//		    Thread.sleep(1000);
//		    driver.findElement(By.name("emailAddress")).clear();
//		 	driver.findElement(By.name("password")).clear();
//		 	Thread.sleep(2000);
//  }
//  
//  @Test(priority=2,description="invalidpassword")
//  public void T2() throws InterruptedException 
//  {
//	        driver.findElement(By.name("emailAddress")).sendKeys("admin@admin.com");
//			driver.findElement(By.name("password")).sendKeys("admin1234");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
//		    Thread.sleep(1000);
//		    driver.findElement(By.name("emailAddress")).clear();
//		 	driver.findElement(By.name("password")).clear();
//		 	Thread.sleep(2000);
//  }
//  
//  @Test(priority=3,description="casesensitive")
//  public void T3() throws InterruptedException 
//  {
//	        driver.findElement(By.name("emailAddress")).sendKeys("ADmin@admin.com");
//			driver.findElement(By.name("password")).sendKeys("admin1234");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click(); 
//		    Thread.sleep(1000);
//		    driver.findElement(By.name("emailAddress")).clear();
//		 	driver.findElement(By.name("password")).clear();
//		 	Thread.sleep(2000);
//  }
  
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
  public void beforeTest()
  {
	  		 	
	  driver.get("https://qa-practice.netlify.app/auth_ecommerce");
      driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {                                 
	  
	  driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")).click(); //ADD TO CART
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[5]/div/button")).click(); //ADD TO CART
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")).click(); //add to cart
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/div[2]/div[2]/div[2]/button")).click(); //Remove
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[5]/div/button")).click(); //ADD TO CART
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/button")).click(); //Checkout
	  Thread.sleep(2000); 
	  driver.findElement(By.name("phone")).sendKeys("9874563210"); //phone number
	  Thread.sleep(2000);
	  driver.findElement(By.name("street")).sendKeys("XYZ Street"); //Street
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[3]/input")).sendKeys("ABC City"); //city
	  Thread.sleep(2000);
	  WebElement country =driver.findElement(By.id("countries_dropdown_menu"));//country
		Select s = new Select(country);
		s.selectByValue("India"); 
		Thread.sleep(1000);
		driver.findElement(By.id("submitOrderBtn")).click(); //submit
		  Thread.sleep(2000);
		  driver.findElement(By.id("logout")).click();
	  driver.quit();   
  }
  
  
}
