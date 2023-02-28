package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator
{
	  public static void main(String[] args) throws InterruptedException 
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	     driver.get("https://www.facebook.com/");
	     
//	     Thread.sleep(2000);
	     
	       WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
	       
	       username.sendKeys("8624003523");
	
           WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	       
	       pass.sendKeys("9960410170");
	       
         WebElement loginbtn= driver.findElement(By.name("login"));
	       
	       loginbtn.click();
	       
          WebElement image= driver.findElement(By.partialLinkText("https://scontent.fnag4-1.fna.fbcdn.net/v/t39.30808-1/311439531_2134848246687380_7644172584078640460_n.jpg?stp="));
	       
	       image.click();
	       
	
}
}