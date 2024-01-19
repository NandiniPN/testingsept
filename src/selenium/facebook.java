package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args)
	{
		ChromeDriver fb= new ChromeDriver();
		fb.get("https://www.facebook.com/login/");
		String actualtitle=fb.getTitle();
		System.out.println(actualtitle);
		String expectedresult="Log in to Facebook";
		if(actualtitle.equals(expectedresult))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		fb.close();
		
		

	}

}
