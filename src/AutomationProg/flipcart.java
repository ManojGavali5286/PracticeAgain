package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class flipcart
{
	 private static final String Thred = null;

	public static void main(String[] args) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Dimension d= new Dimension(300,500);
		
		//driver.manage().window().setSize(d);
		
		driver.get("https://www.flipkart.com/");
		
		WebElement login =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		
		login.sendKeys("9834909199");
		
		
       WebElement pass =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	
		pass.sendKeys("528652");
		
		WebElement log =driver.findElement(By.xpath("//div[4]//button"));
		
		log.click();
		
		
		//*[@id="container"]/div/div[2]/div/div/div[4]/a/div[1]/div/img
		
      WebElement fashion =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[1]/div/img"));
		
		Actions act = new Actions(driver);
		act.moveToElement(fashion);
		
		
		
		//*[@id="container"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]
		
		// WebElement menswear =driver.findElement(By.xpath("//img[@alt='Fashion']"));
		 //act.moveToElement(menswear).perform();
		
		
		
		
		//a//div[2]//div[1]//div[2]//a[3]              //full xpath
		
//         WebElement main =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[3]")); //not proceed
//         act.moveToElement(main).perform();
//		 main.click();
		
		//img[@class='_396cs4  _3exPp9']
		
		
		 
	   }
}
