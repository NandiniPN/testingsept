package webelement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_example {
	ChromeDriver driver;
	@Before
	public void main() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("user-name")).sendKeys("problem_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@After
	public void close()
	{
		
	}

}

