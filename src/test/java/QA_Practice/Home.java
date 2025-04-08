package QA_Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home 

{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
/*      driver.findElement(By.xpath("//*[@id=\"sidebarCollapse\"]")).click(); //Hamburger close
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebarCollapse\"]")).click(); //Hamburger open
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"auth-shop\"]/b")).click(); //ecommerce
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bugs-form\"]/b")).click(); //SpotTheBug
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"graphql-testing\"]/b")).click(); //GraphQL
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"api-testing\"]/b")).click(); //API Testing
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"products-list\"]/b")).click(); //Products
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"intercept-api\"]/b")).click(); //Intercept
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"visual\"]/b")).click(); //Visual
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"forms\"]")).click(); //Forms 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click(); //login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"forms\"]")).click(); //Forms 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"register\"]")).click(); //Register
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"forms\"]")).click(); //Forms 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"recover-password\"]")).click(); //Recover password         
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"buttons\"]")).click(); //button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]")).click(); //checkbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"buttons\"]")).click(); //button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]")).click(); //radiobutton
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[10]/a")).click(); //new tab/window 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"browser-tab\"]")).click(); //tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[10]/a")).click(); //tab/window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"browser-window\"]")).click(); //window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"actions\"]")).click(); //Actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"double-click\"]")).click(); //doubleclick
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"actions\"]")).click(); //Actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"scrolling\"]")).click(); //scrolling
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"actions\"]")).click(); //Actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mouse-hover\"]")).click(); //mouse hover
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"actions\"]")).click(); //Actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"show-hide-elements\"]")).click(); //show/hide 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[12]/a")).click(); //tables
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tables\"]/li[1]/a")).click(); //static tables 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[12]/a")).click(); //tables
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tables\"]/li[2]/a")).click(); //dynamic tables */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dropdowns\"]")).click(); //dropdowns
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"iframes\"]")).click(); //iframes
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"alerts\"]")).click(); //alerts
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"file-upload-item\"]")).click(); //fileupload
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"date-picker\"]")).click(); //datepickers
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loader\"]")).click(); //loader
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pagination\"]")).click(); //pagination
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul[2]/li[1]/a")).click(); //RVWebsite
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("//html/body/div/nav/ul[2]/li[2]/a")).click();  //LinkedIn
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"learnwithrv\"]")).click(); //youtube
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		
		
		
		
		
		Thread.sleep(3000);driver.quit();}
	
}
