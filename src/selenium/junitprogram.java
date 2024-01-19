package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junitprogram
{
	@Before
	public void browseropen()
	{
		System.out.println("browser open");
		
	}
	@Test
	public void test()
	{
		System.out.println("test activity");
	}
	@After
	public void browserclose()
	{
	System.out.println("browser close");
	
	}
	
	
	
		
	

}
