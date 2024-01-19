package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handle_notification 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---disable-notification");
		//("---remote-allow-origins=*")---to control any issues in chrome
		driver=new ChromeDriver(options);
		driver.manage().window().minimize();
	}
	@Test
	public void urlloading()
	{
		driver.get("https://www.justdial.com");
	}
	

}
