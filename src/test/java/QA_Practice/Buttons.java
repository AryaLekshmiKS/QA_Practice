package QA_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Buttons 
{

	public static void main(String[] args) throws InterruptedException 
	
	
	{  
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://qa-practice.netlify.app/");
		  driver.manage().window().maximize();
        
		   //checkboxes
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"buttons\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"checkboxes\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("checkbox1")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("checkbox2")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("checkbox3")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/button")).click();
		  Thread.sleep(1000);
		  
		  //Radiobutton
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"buttons\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("radio-button1")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("radio-button2")).click();
		  driver.findElement(By.id("radio-button2")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("radio-button3")).click();
		  driver.findElement(By.id("radio-button4")).click(); 
		  Thread.sleep(2000);
		  driver.quit();
		  
		 


	}

}
