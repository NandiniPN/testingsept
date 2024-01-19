package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
	
ChromeDriver am;
@Before
public void browseropen()
{
	am=new ChromeDriver();
	am.get("https://www.amazon.in/");
	
	
}
@Test
public void test() 
{
	String content=am.getPageSource();
	if(content.contains("mobiles"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@After
public void broswerclose()
{
	am.close();
}


}
