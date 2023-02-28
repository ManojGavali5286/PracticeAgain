package AutomationProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTable 
{
	public static void main(String[] args) 
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	

		List<WebElement> header =driver.findElements(By.xpath("//table//tbody//tr//th"));
		System.out.println(header.size());
		for(int i=0;i<header.size();i++)
		{
			System.out.print(header.get(i).getText()+"                  ");
		}
		System.out.println();
		{
		List<WebElement> alldata =driver.findElements(By.xpath("//table//tbody//tr//td"));
		System.out.println(alldata.size());
		
		for(int i=0;i<alldata.size();i++)
		{
			System.out.print(alldata.get(i).getText()+"   ");
	       System.out.println();
		}
		
		
		
		}
}
}