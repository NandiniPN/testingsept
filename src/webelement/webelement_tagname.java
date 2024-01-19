package webelement;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_tagname
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}@Test
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));//array
		System.out.println("count="+li.size());//print array size
		
		for(WebElement s:li)
		{
			
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link+"-----"+text);
			
		}
	}
	
	@After
	public void close()
	{
		driver.close();
	}

}
