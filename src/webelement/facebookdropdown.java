package webelement;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdropdown
{

	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void facebookdropdownlistverification()
	{
		WebElement dayvalues = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		 Select day=new Select(dayvalues);
		 day.selectByValue("8"); //select by value method-blue color values
		 List<WebElement> dcount = day.getOptions();
		 System.out.println("days count="+dcount.size()); // size of dropdown list(count)
		 
		 WebElement monthvalues = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		 Select month=new Select(monthvalues);
		 month.selectByVisibleText("Feb"); //select by visible text-black color text
		 List<WebElement> mcount = month.getOptions();
		 System.out.println("month count="+mcount.size());
		 
		 
		 WebElement yearvalues = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		 Select year=new Select(yearvalues);
		 year.selectByIndex(07); //select by index method-intex position
		 List<WebElement> ycount = year.getOptions();
		 System.out.println("year count="+ycount.size());
		 

		
	}
	@After
	public void close()
	{
		
	}

}
