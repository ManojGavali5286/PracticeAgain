package packagefirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxauto
{
  public static void main(String[] args) 
{
System.setProperty("webdriver.gecko.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\geckodriver.exe");
	

	WebDriver driver = new FirefoxDriver();

		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		WebElement username= driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");	
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");	
		
	
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();	
	}
}
	
	

