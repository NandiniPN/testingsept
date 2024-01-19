package testNG_Basics;

import org.testng.annotations.Test;

public class Grouping
{
	@Test
	public void main1()
	{
		System.out.println("test 1");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void main2()
	{
		System.out.println("test 2");
	}
	
	@Test(groups= {"regression"})
	public void main3()
	{
		System.out.println("test 3");
	}
	
	@Test(groups= {"sanity","regression"})
	public void main4()
	{
		System.out.println("test 4");
		
	}
	
    @Test(groups= {"smoke"})
    public void main5()
    {
    	System.out.println("test 5");
    }
}
