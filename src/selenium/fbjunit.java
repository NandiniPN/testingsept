package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbjunit
{
	ChromeDriver fb;
	@Before
	public void browseropen()
	{
	fb=new ChromeDriver();
	fb.get("https://www.facebook.com/login/");
	}
	
	@Test
	public void test()
	{
		String heading=fb.getTitle();
		{
			System.out.println(heading);
		}
	}
	@After
	public void browserclose()
	{
		fb.close();
	}

}
