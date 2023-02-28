package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisply 
{

	private static final boolean True = false;

	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Dimension d= new Dimension(300,500);
		
		//driver.manage().window().setSize(d);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//input[@id='hide-textbox']
   
		
		//showntextbox
		//input[@id='show-textbox']
		
		 WebElement show =driver.findElement(By.xpath("//input[@id='show-textbox']"));	
		
		     show.click();
		
		//textbox
		   //input[@id='displayed-text']
		     WebElement box =driver.findElement(By.xpath("//input[@id='displayed-text']"));	
				
		   box.sendKeys("akshay");
		   
		   WebElement hide =driver.findElement(By.xpath("//input[@id='hide-textbox']"));
			
    		hide.click();
		
        boolean result1= box.isDisplayed();
    //    boolean result2=box.isEnabled();
        
        if(result1==True);
        {
        	System.out.println("passed");
        }
        
}
}
