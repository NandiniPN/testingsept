package webelement;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_validation
{
	 ChromeDriver driver;
	 String baseurl="https://www.google.com/";
	 @Before
	 public void open()
	 {
		 driver=new ChromeDriver();

	 }
	 
	
	@Test
	public void responeslink() throws Exception
	{
		driver.get(baseurl);
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid--"+baseurl);
		}
		else
		{
			System.out.println("invali---"+baseurl);
		}
		
	}
	@After
	public void close()
	{
		
	}
	 

}
