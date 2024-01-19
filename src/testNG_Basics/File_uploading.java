package testNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_uploading // using sendkeys(direct apply the file path)
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
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void fileuploading()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\nandini\\Downloads\\All Selenium Keywords with Examples.pdf");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}
	@AfterTest
	public void close()
	{
		//driver.close();
		
	}

}
