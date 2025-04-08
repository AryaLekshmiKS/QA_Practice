package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GA_Testing {

	public static void main(String[] args) throws InterruptedException  
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"graphql-testing\"]/b")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]/a/em")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"api-testing\"]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]/a/em")).click();
//		Thread.sleep(2000);		
//		driver.findElement(By.xpath("//*[@id=\"products-list\"]/b")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")).click(); //ADD TO CART
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/button")).click(); // purchase
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"intercept-api\"]/b")).click(); //interupt_API_Req
//		Thread.sleep(2000);
//		driver.findElement(By.id("postTitleInput")).sendKeys("alias odio sit");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/button[1]")).click(); //create post
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"visual\"]")).click(); //GIF Page
		
		;
		
		
		
//		driver.close();
		
		

	}

}
