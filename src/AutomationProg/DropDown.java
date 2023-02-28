package AutomationProg;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) 
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Dimension d= new Dimension(300,500);
		
		//driver.manage().window().setSize(d);
		
		driver.get("https://vctcpune.com/");
		
		//nav//li[4]//a[@href='../selenium/practice.html']
		

		WebElement practice =driver.findElement(By.xpath("//nav//li[4]//a[@href='../selenium/practice.html']"));
		
		practice.click();
		//web page change
		
		List<String>allPage=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allPage.get(1));
		
		//select[@id='dropdown-class-example']
		
         WebElement dropd =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		dropd.click();
		
		Select s = new Select(dropd);
		s.selectByIndex(1);  //by index
		
		//s.selectByValue("option3"); // by attribute value
		
		//s.selectByVisibleText("Option2"); // by html text
		
		dropd.click();
		
		driver.close();
		driver.quit();
		
		System.out.println("end of programm");
		
}
}