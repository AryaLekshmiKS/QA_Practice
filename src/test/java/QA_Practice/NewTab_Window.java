package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_Window {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		  WebDriver driver =new ChromeDriver();
		  driver.get("https://qa-practice.netlify.app/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[10]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"browser-tab\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"newTabBtn\"]/a")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[10]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"browser-window\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		  Thread.sleep(2000);
		  driver.quit();
		 
	}

}
