package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintro {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actual=driver.getTitle();
		System.out.println(actual);
		String expect="Google";
		if(actual.equals(expect))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}	
		
	}
}