package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class titlejunit
{
	ChromeDriver ch;
	@Before
	public void browseropen()
	{
		ch=new ChromeDriver();
		ch.get("https://www.google.com/");
		
	}
	@Test
	public void test()
	{
	String actualtitle=ch.getTitle();
	System.out.println("actualtitle");
	String expectedresult="Google";
	if(actualtitle.equals(expectedresult))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}
	}
	@After
	public void browserclose()
	{
		ch.close();
	}
	
	
	
	
	


}

