package AutomationProg;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDateFormat
{
private static final String Date = null;
static WebDriver driver; 
	
	public static void screenShotMethod(String name) throws IOException
	{
		//date and time format code
		Date d= new Date(0);
		DateFormat d1 = new SimpleDateFormat("DD-mm-yyyy & HH-ss");
		String Date=d1.format(d);
		
		//screenshots
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\\\screenshots\\"+name+Date+".jpg");
		FileHandler.copy(sourceFile, destFile);
	

	}
     public static void main(String[] args) throws IOException
  
     {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");
  
  driver=new ChromeDriver();// we declare it globali(WebDriver driver)with static
  
  driver.manage().window().maximize();
  
  driver.get("https://www.saucedemo.com/");
  
       System.out.println("login screenshot is taken");
//screenshot login page
     screenShotMethod("manojlogin1");
       
  
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
	private static void screenshotmethod() {
		// TODO Auto-generated method stub
		
	}

	
		
			
}
