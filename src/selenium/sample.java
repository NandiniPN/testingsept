package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) 
	{
		ChromeDriver dri=new ChromeDriver();
		dri.get("https://www.google.com/");
		String content=dri.getPageSource();
		if(content.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
			
		dri.close();
		
		

	}

}
