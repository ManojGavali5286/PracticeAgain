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

public class SceernShotMethodCrea 
{
	static WebDriver driver; 
	
	public static void screenShotMethod(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\\\screenshots\\"+name+".jpg");
		FileHandler.copy(sourceFile, destFile);
	}

     public static void main(String[] args) throws IOException
  
     {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");
  
  driver=new ChromeDriver();// we declare it globli(WebDriver driver)with static
  
  driver.manage().window().maximize();
  
  driver.get("https://www.saucedemo.com/");
  
//screenshot login page
     
       screenShotMethod("manojlogin");
  //***********************************************
       
       WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
  //screenshot homepage
         screenShotMethod("manojhome");
  
		//*****************************************
         
         
         
         
         String givenTitle="Swag Labs";
		
		String actualTitle= driver.getTitle();
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
