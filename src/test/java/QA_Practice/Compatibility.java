package QA_Practice;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Compatibility
{
  WebDriver driver;
  @Test
  public void f() throws InterruptedException
  {
	  driver.get(" https://qa-practice.netlify.app/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  


  
  @BeforeTest
  @Parameters("browser1")
  public void beforeTest(String b) throws InterruptedException
  {
	  if(b.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(b.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
  }
  
  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
