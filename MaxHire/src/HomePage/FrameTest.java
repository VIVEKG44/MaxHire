package HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest 
{
	@Test
	
	public void FrameDemo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.automationtesting.in/");
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//button[@id='btn2']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
		Thread.sleep(1000);
		
		
		//*****To find all frames on the WebPage*****//
		List<WebElement> iframes = dr.findElements(By.tagName("iframe"));
		int alltags=iframes.size();
		System.out.println("No of frames:"+alltags);
		
		//***** Switch to Frames By index *****//
		System.out.println("Switching to the frame");
		dr.switchTo().frame(1);
		Thread.sleep(2000);
		
		
		System.out.println("Frame Source" +dr.getPageSource());

		dr.close();
		
		
		
		
	}
}
