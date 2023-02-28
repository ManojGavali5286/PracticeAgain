package AutomationProg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syncronisation 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 WebElement username = driver.findElement(By.id("user-name"));
		 
			username.sendKeys("standard_user");
		// using implicit wait we create syncronise time betw test script and browser
			
//		syntax-->	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			// its also call globle wait its apply to all element where it needed for Internet trouble
			
			
		//********************************************************************	
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			
			WebElement loginBtn = driver.findElement(By.id("login-button"));
			loginBtn.click();
		
		
	}

}
