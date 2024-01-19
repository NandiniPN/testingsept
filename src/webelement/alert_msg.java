package webelement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_msg
{

	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/nandini/OneDrive/Desktop/AlertHandlingprogram/alert%20-%20Copy.html");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		if(s.equals("Hello! I am an alert box !!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("nandini");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("pn");
}
	@After
	public void close()
	{
		driver.close();
	}

}
