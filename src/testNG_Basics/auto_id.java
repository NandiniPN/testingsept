package testNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class auto_id // to upload a file 
{
	WebDriver c;
	@BeforeTest
	public void driver()
	{
		c=new ChromeDriver();
	}
	@BeforeMethod
	public void pdftoword()
	{
		c.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws Exception 
	{
		c.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("\"C:\\Users\\nandini\\OneDrive\\Desktop\\autoit\\autoitprogram.exe\"");
	}

}
