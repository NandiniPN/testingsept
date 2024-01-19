package webelement;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redif 
{

	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}@Test
	public void test()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]"));
		String buttontext=button.getAttribute("value");
		if(buttontext.equals("Create my account"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}
		
	}
	@After
	public void close()
	{
		driver.close();
	}

	
	

}
