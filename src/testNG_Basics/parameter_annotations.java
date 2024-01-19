package testNG_Basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_annotations
{
	@Parameters("a")
	@Test
	public void test(String h)
	{
		System.out.println("Value is"+h);
	}
	

}
