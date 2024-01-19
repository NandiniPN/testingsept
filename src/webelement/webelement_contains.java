package webelement;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_contains 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		//contains dymanic values eg numbers,id values somethings number
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
	}

	

}
