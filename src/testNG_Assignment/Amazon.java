package testNG_Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon   //  28/12/23
{
	WebDriver driver;
	@BeforeTest
	public void setbrowser()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		
		String original = driver.getTitle();
		String expected="amazonein.:mobilephones";
		if(original.equalsIgnoreCase(expected))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
			
		}
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> childwindow = driver.getWindowHandles();
		for(String handle:childwindow)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,250", "");
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
			}
		}
		
		
			
		
	}
	
}
