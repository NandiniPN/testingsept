package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class contentverification {

	public static void main(String[] args) 
	{
	ChromeDriver ch=new ChromeDriver();
	ch.get("https://www.google.com/");
	String content=ch.getPageSource();
	if(content.contains("gmail"))
	{
		System.out.println("pass");
	
	}
	else
	{
		System.out.println("fail");
	}

	}

}
