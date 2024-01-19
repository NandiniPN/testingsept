package testNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven_testing
{
	WebDriver driver;
	@BeforeTest
	public void setbrowser()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() throws IOException
	{
		File f=new File("D:\\datadriven.xlsx");
		FileInputStream fi= new FileInputStream (f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		 XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		
		for(int i = 1;i<=sh.getLastRowNum();i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue() ;
			System.out.println("username="+username);
			String paswrd = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("password="+paswrd);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(paswrd);
			
			
			//login validation
			
			
			driver.findElement(By.xpath("//*[@id=\"u_0_5_eD\"]")).click();
			
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);
			String expurl="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028";  // login click cheythatt kittana url kodukkanam
			if(expurl.equalsIgnoreCase(actualurl))
			{
				System.out.println("login pass");
			}
			else
			{
				System.out.println("login failed");
			}
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}


}
