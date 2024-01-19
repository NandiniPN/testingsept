package Hw;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redif_logo_radiobutton_verification 
{
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void logoverification()
	
	{
		//------12/12/23---
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean logoimage = logo.isDisplayed();
		if(logoimage)
		{
			System.out.println("logo is displayed="+logoimage);
			
		}
		else
		{
		System.out.println("logo is notdisplayed="+logoimage);
			
    	}
		
		WebElement checkbutton = driver.findElement(By.xpath("//*[@id=\"altid_msg\"]/span"));
		boolean button =checkbutton.isSelected();
		if(button)
		{
			System.out.println("button is selected="+button);
		}
		else
		{
			System.out.println("button is not selected="+button);
		}
		
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean radio = radiobutton.isSelected();
		System.out.println("button is selected:"+radio);
}
}

