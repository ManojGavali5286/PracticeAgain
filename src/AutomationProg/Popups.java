package AutomationProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups 
{
public static void main(String[] args) throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");
	  
	WebDriver  driver=new ChromeDriver();// we declare it globali(WebDriver driver)with static
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/alerts");
	
	    WebElement clickMeButton1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
	    clickMeButton1.click();
      //*******************************
	//alter popups
	 //   driver.switchTo().alert();-----store in alertclick1
	 Alert  alt1= driver.switchTo().alert();
	  alt1.accept();
	  //****************************
	  //click2
	  WebElement clickMeButton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	    clickMeButton2.click();
	    Thread.sleep(6000);
	    
	    Alert  alt2= driver.switchTo().alert();
		  alt2.accept();
	//**********************************************
		//button[@id='confirmButton'] ---click3
	
		  WebElement clickMeButton3 = driver.findElement(By.xpath("	//button[@id='confirmButton']"));
		    clickMeButton3.click();
		    
		    Alert  alt3= driver.switchTo().alert();
			  alt3.dismiss(); //for cancle click  //can alt3.accept also
			  //**********************************************
			  
		//click4	  
			//button[@id='promtButton']
			  
			  WebElement clickMeButton4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
			    clickMeButton4.click();
			  
			  Alert alt4=driver.switchTo().alert();
			  alt4.getText();
			  
			  alt4.sendKeys("manoj gavali"); 
			  
			  Thread.sleep(2000);
			  
			  alt4.accept();
			  Thread.sleep(2000);  
			  //or alt.dismiss can use
			  
			  
}
}
