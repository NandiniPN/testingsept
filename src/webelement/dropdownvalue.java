package webelement;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownvalue
{

	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void dropdownlistverification()
	{
		 WebElement dayvalues = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		 Select day=new Select(dayvalues);
		 day.selectByValue("08"); //select by value method-blue color values
		 List<WebElement> dcount = day.getOptions();
		 System.out.println("days count="+dcount.size()); // size of dropdown list(count)
		 
		 WebElement monthvalues = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		 Select month=new Select(monthvalues);
		 month.selectByVisibleText("FEB"); //select by visible text-black color text
		 List<WebElement> mcount = month.getOptions();
		 System.out.println("month count="+mcount.size());
		 
		 
		 WebElement yearvalues = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		 Select year=new Select(yearvalues);
		 year.selectByIndex(07); //select by index method-intex position
		 List<WebElement> ycount = year.getOptions();
		 System.out.println("year count="+ycount.size());
		 

		 
		 
		 
		
		
	}
	@After
	public void close()
	
	{
		//driver.close();
	}

}
