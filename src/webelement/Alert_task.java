package webelement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_task
{

	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window();
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		//driver.switchTo().alert().accept();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		if(s.equals(" You clicked a button"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
	}
	@Test
	public void test()
	{

		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		//driver.switchTo().alert().accept();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		if(s.equals(" Do you confirm action?"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
	}
	@After
	public void close()
	{
		
	}

}
