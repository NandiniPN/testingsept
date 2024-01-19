package Hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
	ChromeDriver c;
	@Before
	public void open()
	{
		c=new ChromeDriver();
		c.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
		c.findElement(By.name("field-keywords")).sendKeys("mobiles",Keys.ENTER);
		c.findElement(By.id("nav-cart-count-contaiBy.ner")).click();
		c.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		c.findElement(By.xpath("//input[@type='email']")).sendKeys("aleenajoseph1035@gmail.com",Keys.ENTER);
		c.findElement(By.xpath("//input[@id='continue']")).click();
		c.navigate().back();
		c.navigate().back();
		c.navigate().back();
		c.navigate().back();
		c.findElement(By.xpath("//*[@id='nav-xshop']/a[3]")).click();
		c.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();

	}
	@After
	public void close()
	{
		//c.close();
	}

}


