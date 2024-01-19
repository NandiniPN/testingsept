package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin
{
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpswrd=By.id("pass");
	By fblogin=By.name("login");
	
	public  Fblogin(WebDriver driver) 	//constructor
	{
		this.driver=driver;
		
		
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpswrd).sendKeys(password);
		
	}
	public void login()
	{
		driver.findElement(fblogin).click();
		
	}

}
 