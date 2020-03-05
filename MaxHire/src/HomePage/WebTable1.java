package HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebTable1

{
	@Test
	
	public void DynamicWebtable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		dr.get("https://www.spicejet.com/Default.aspx");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		dr.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		
		dr.findElement(By.xpath("(//span[@class='red-arrow-btn'])[1]")).click();
		//Thread.sleep(2000);
		System.out.println("*********Inside WebTable 1*********");
		
		List<WebElement> lr=dr.findElements(By.xpath("//li//a[@href='#']"));
		{
			System.out.println(lr.size());
		}
		
		for( int i=0; i<lr.size();i++)
		{
			System.out.println(lr.get(i).getText());
		if(lr.get(i).getText().equals("Bengaluru (BLR)"))
		{
			lr.get(i).click();
			break;
		}
		
		}
		
		
		dr.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//Thread.sleep(2000);
		System.out.println("*********Inside WebTable no 2*********");
		List<WebElement> lr2=dr.findElements(By.xpath("//li//a[@href='#']"));
		{
			System.out.println(lr2.size());
		}
		
		for( int i=0; i<lr2.size();i++)
		{
			System.out.println(lr2.get(i).getText());
		if(lr2.get(i).getText().equals("Bhopal (BHO)"))
		{
			lr2.get(i).click();
			break;
		}
		
		}
		
		
		dr.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		Thread.sleep(2000);
		System.out.println("*********Inside WebTable no 3*********");
		List<WebElement> lr3=dr.findElements(By.xpath("//div//table[@class='ui-datepicker-calendar']//td"));
		{
			System.out.println(lr3.size());
		}
		
		for( int i=0; i<lr3.size();i++)
		{
			System.out.println(lr3.get(i).getText());
		if(lr3.get(i).getText().equals("12"))
		{
			lr3.get(i).click();
			break;
		}
		
		}
		
		
//		dr.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//		Thread.sleep(2000);
		
		
		dr.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		Thread.sleep(2000);
		System.out.println("*********Inside WebTable no 4*********");
		List<WebElement> lr4=dr.findElements(By.xpath("//div//table//tbody//tr//td[@data-month='7']//a[@href='#']"));
		{
			System.out.println(lr4.size());
		}
		
		for( int i=0; i<lr4.size();i++)
		{
			System.out.println(lr4.get(i).getText());
		if(lr4.get(i).getText().equals("12"))
		{
			lr4.get(i).click();
			break;
		}
		
		}
		
		
	}
	}
		
		

