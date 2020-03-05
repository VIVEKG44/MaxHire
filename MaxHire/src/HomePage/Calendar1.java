package HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendar1 

{
	@Test
	
	public void CalendarDemo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		dr.get("https://www.spicejet.com/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		System.out.println("********Website Home page displayed********");
		
		
		dr.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("(//span[@class='red-arrow-btn'])[1]")).click();
		//Thread.sleep(2000);
		System.out.println("*********Inside WebTable Departure City*********");
		
		List<WebElement> lrt=dr.findElements(By.xpath("//li//a[@href='#']"));
		{
			System.out.println(lrt.size());
		}
		
		for( int i=0; i<lrt.size();i++)
		{
			System.out.println(lrt.get(i).getText());
		if(lrt.get(i).getText().equals("Bengaluru (BLR)"))
		{
			lrt.get(i).click();
			break;
		}
		
		}
		
		dr.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//Thread.sleep(2000);
		System.out.println("*********Inside WebTable Arrival city*********");
		List<WebElement> lr1=dr.findElements(By.xpath("//li//a[@href='#']"));
		{
			System.out.println(lr1.size());
		}
		
		for( int i=0; i<lr1.size();i++)
		{
			System.out.println(lr1.get(i).getText());
		if(lr1.get(i).getText().equals("Bhopal (BHO)"))
		{
			lr1.get(i).click();
			break;
		}
		
		}
		
		dr.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		Thread.sleep(1000);
		System.out.println("*********Inside WebTable Depart Date*********");
		
		//div//span[@class='ui-datepicker-month']
		
		List<WebElement> lr2=dr.findElements(By.xpath("//div//div//span[@class='ui-datepicker-month']"));
		{	
			System.out.println(lr2.size());
		}
			
		for( int i=0; i<lr2.size();i++)
		{	
			System.out.println(lr2.get(i).getText());
			if(lr2.get(i).getText().equals("March"))
		{	
			lr2.get(i).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			Thread.sleep(2000);
			break;
			
		} 
			
		}
		
		
		
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
			Thread.sleep(2000);
			break;
			
		}
		
		}
		
		dr.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		Thread.sleep(2000);
		
		System.out.println("*********Inside WebTable Return Date*********");
		
		//div//span[@class='ui-datepicker-month']
		
		List<WebElement> lr4=dr.findElements(By.xpath("//div//div//span[@class='ui-datepicker-month']"));
		{	
			System.out.println(lr4.size());
		}
			
		for( int i=0; i<lr4.size();i++)
		{	
			System.out.println(lr4.get(i).getText());
			if(lr4.get(i).getText().equals("April"))
		{	
			lr4.get(i).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			Thread.sleep(2000);
			break;
			
		} 
			
		}
		
		List<WebElement> lr5=dr.findElements(By.xpath("//div//table[@class='ui-datepicker-calendar']//td"));
		{
			System.out.println(lr5.size());
		}
		
		for( int i=0; i<lr5.size();i++)
		{
			System.out.println(lr5.get(i).getText());
		if(lr5.get(i).getText().equals("17"))
		{
			lr5.get(i).click();
			Thread.sleep(2000);
			break;
			
		}
		
		}
		
		
		
		//dr.close();
	}
}
