package QA_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtnAction_Tables_Dropdowns_iframes {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();

        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("double-click")).click();
//        Thread.sleep(2000);
//        WebElement dclick = driver.findElement(By.id("double-click-btn"));
//        Actions DC = new Actions(driver);
//        DC.doubleClick(dclick).perform();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("scrolling")).click();
//        driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("mouse-hover")).click();
//        Thread.sleep(2000);
//        WebElement mousehover=driver.findElement(By.id("button-hover-over"));
//        Actions mh =new Actions(driver);
//        mh.moveToElement(mousehover).perform();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("show-hide-elements")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("showHideBtn")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("showHideBtn")).click(); 
//        Thread.sleep(2000); 
//        driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[12]/a")).click(); //tables
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"tables\"]/li[1]/a")).click(); //static 
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[12]/a")).click(); //tables
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"tables\"]/li[2]/a")).click();   //dynamic
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"dropdowns\"]")).click(); //Dropdown
//        Thread.sleep(2000);
//        WebElement country =driver.findElement(By.id("dropdown-menu"));
//		Select s = new Select(country);
//		s.selectByValue("India"); 
//		Thread.sleep(1000);
//		
//		
//		
//		//multilevel_dropdown
//        
//        driver.findElement(By.id("multi-level-dropdown-btn")).click();   //multilevelDD 
//        Thread.sleep(2000);
//        
//        Actions actions = new Actions(driver);
//        WebElement level1 = driver.findElement(By.xpath("/html/body/div/div/div/ul/li[4]/a"));
//        actions.moveToElement(level1).perform();
//        Thread.sleep(1000); // 
//        
//        WebElement level2= driver.findElement(By.xpath("/html/body/div/div/div/ul/li[4]/ul/li[2]/a"));
//        actions.moveToElement(level2).perform();
//        Thread.sleep(1000);
//        
//        WebElement level3= driver.findElement(By.xpath("/html/body/div/div/div/ul/li[4]/ul/li[2]/ul/li[2]/a"));
//        actions.moveToElement(level3).perform();
//        Thread.sleep(1000);
// 
//        driver.findElement(By.xpath("//*[@id=\"multi-level-menu-ul\"]/li[4]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
//        
//        Thread.sleep(1000);
        
        
        //Alert
        
        
        driver.findElement(By.id("alerts")).click();
        driver.findElement(By.id("alert-btn")).click();        
        Thread.sleep(2000);
       // Switch to the alert
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirm-btn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();       
        Thread.sleep(2000);
        driver.findElement(By.id("confirm-btn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        //File Upload
        
        driver.findElement(By.id("file-upload-item")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("file_upload")).click();
         uploadInput.sendKeys("C:\\Users\\Arya\\Documents\\sample.pdf");    
        
        
        driver.quit();

	}

}
