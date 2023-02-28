package AutomationProg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot
{
	private static final WebDriver TakeScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Dimension d= new Dimension(300,500);
		
		//driver.manage().window().setSize(d);
		
		driver.get("https://www.saucedemo.com/");
		
		//screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
//		ts.getScreenshotAs(null);
		
		//store it
		
		ts.getScreenshotAs(OutputType.FILE);
		
		//store it in sourcefile
		
      File sourcefile	 =ts.getScreenshotAs(OutputType.FILE);
      
      // creat own file for save in comp
      
      File myfile=new File("C:\\screenshots\\slab.jpg");
      
      // trnsform soursefile to myfile (copy)
      
      FileHandler.copy(sourcefile, myfile);
      
      Thread.sleep(1000);
      //open login page
      
      WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		ts.getScreenshotAs(OutputType.FILE);
		
	
		
      File sourcefile1	 =ts.getScreenshotAs(OutputType.FILE);
        
      File myfile1=new File("C:\\screenshots\\home.jpg");
        
      FileHandler.copy(sourcefile1, myfile1);
      
//      //////////
      String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
		
		if(givenTitle.equals(actualTitle))
		{
			System.out.println("Login Test is passed");
		}
		else
		{
			System.out.println("Login Test is failed");
		}

      
      
      driver.close();
		
}
}