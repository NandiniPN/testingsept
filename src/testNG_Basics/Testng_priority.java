package testNG_Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_priority
{
	@BeforeTest
	public void browseropen()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlopen()
	{
		System.out.println("open url");
	}
	@Test(priority=2)
	public void test1()
	{
		System.out.println("test1 priority 2");
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("test2-priority 3");
		
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("test3-priority 1");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("report");
	}
	@AfterTest
	public void browserclose()
	{
		System.out.println("browser close");
	}
}



