package testNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class action_draganddrop
{
	
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop);
		act.perform();		
		String text = drop.getText();
		if(text.equalsIgnoreCase("dropped!"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
