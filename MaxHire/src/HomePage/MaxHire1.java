package HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

public class MaxHire1
{

	@Test
	
	public void Homepage() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		dr.get("http://192.168.10.254/login/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
		
		String title=dr.getTitle();
		System.out.println(dr.getTitle());
		
		//dr.findElement(By.xpath(""));
		
		System.out.println("");
		String text1=dr.findElement(By.xpath("//div[@class='content-area']")).getText();
		System.out.println("***Signup Details****");
		System.out.println(text1);
		
		System.out.println("");
		String text2=dr.findElement(By.xpath("//div[@class='brand-area']")).getText();
		System.out.println("***MaxHire field Details****");
		System.out.println(text2);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@type='email']")).sendKeys("vgaikwad12@gmail.com");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Maxi@123");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[@class='signin btn btn-primary']")).click();
		Thread.sleep(1000);
		
		dr.close();
	}
}
