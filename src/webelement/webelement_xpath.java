package webelement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_xpath
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
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	@After
	public void close() 
	{
		
	}

}
