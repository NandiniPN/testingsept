package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendedReports 
{
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentHtmlReporter("./ExtentReport/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("os","windows 10");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("Browser Name", "chrome");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---remote---allow---origins=*");
		driver=new ChromeDriver(options);
		@BeforeMethod
		public void setup()
		{
			
		}
		
				
	}
	@test
	public void fbbuttontest()
	{
		test=exte
	}
	

}
