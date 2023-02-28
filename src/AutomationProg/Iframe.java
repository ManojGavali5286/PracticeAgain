package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
	
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Users\\\\MANOJ GAVALI\\\\Desktop\\\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();	
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			
			//switch to iframe
			WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='frame2']"));		
	        driver.switchTo().frame(frameEle);	
			
			WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		    dropDown.click();
			
			Select s = new Select(dropDown);
			
          //	s.selectByIndex(1);  //by index
			
          	s.selectByValue("babycat"); //inspect
          	
			dropDown.click();
			
			System.out.println("end of program");
			
			
		}

	

}
