package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_tab_window 
{
	WebDriver driver;
	
	@Test
	public void setup()
	{
		driver=new ChromeDriver();
	//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com");
		
	}

}


