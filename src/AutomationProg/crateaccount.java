package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crateaccount 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Dimension d= new Dimension(300,500);
		
		//driver.manage().window().setSize(d);
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bcom%26hvadid%3D73049094732142%26hvbmt%3Dbe%26hvdev%3Dc%26hvqmt%3De%26tag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	WebElement create = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	
	  create.click();
	  
	//input[@id='ap_customer_name']
	  
	  WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
	  
	  name.sendKeys("manoj gavali");
	  
	//input[@id='ap_phone_number']
	  
      WebElement mobile = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	  
	  mobile.sendKeys("9834909199");
	  
	//input[@id='ap_password']
	  
      WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
	  
	  pass.sendKeys("654321");
	  
	//input[@id='continue']
	  
      WebElement click = driver.findElement(By.xpath("//input[@id='continue']"));
	  
	  click.click();
	  Thread.sleep(2000);
	  
	  String url = driver.getCurrentUrl();
	System.out.println("url is--->"  +url);
	
	String title = driver.getTitle();
	System.out.println("title is--->"  +title);
	  
	
	//String Title = "Amazon Auathentication";   //PO/BA/dev	give title	

	String Title = " amezon";
	String actualTitle = driver.getTitle();
	
	if(Title==(actualTitle))
	{
		System.out.println("Login Test is passed");
	}
	else
	{
		System.out.println("Login Test is failed");
	}
	
	
	driver.close();
	System.out.println("browser is closed");
	

//	//button[@id='home_children_button']
//	  
//	   WebElement puzzel = driver.findElement(By.xpath("//*[@id=\"home_children_button\"]"));
//		  
//		  puzzel.click();
//	  
//		  Thread.sleep(2000);
//	
//	  
//	  
//	  
//	  
//	  
//	//*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[10]/div/div/div/div
//	  
//	  
//	    WebElement prod = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[10]/div/div/div/div"));
//		  
//		  prod.click();
//	  
//	  
//	  
//	  
//	  
	  
	   }

	private static void quite() {
		// TODO Auto-generated method stub
		
	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}
	
	
}
