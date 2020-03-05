package HomePage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window 

{
	@Test
	
	public void WindowDemo() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.get("http://demo.automationtesting.in/");
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		dr.findElement(By.xpath("//button[contains(text(),'Skip Sign In')]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[@href='Windows.html']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[@href='#Seperate']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[@href='#Multiple']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		Thread.sleep(1000);
	
		String window=dr.getWindowHandle();
		
		Set<String> set =dr.getWindowHandles();
	
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			if(!window.equals(childwindow))
		{
				dr.switchTo().window(childwindow);
				System.out.println(dr.switchTo().window(childwindow).getTitle());
				Thread.sleep(2000);
				dr.close();
		}
		}
		dr.switchTo().window(window);
		System.out.println("*******Back to main window**********");
		Thread.sleep(2000);
		//dr.close();
		
	}
}
