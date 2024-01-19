package testNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolling
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
	public void windowhandling()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0,1000)", "");		//pixel
	 //  js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")));	//used by element
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	//top to buttom
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")).click();
		
		
	}

}
