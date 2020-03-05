package HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBox 

{
	@Test
	public void AlertPage() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe"); 
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		dr.get("http://demo.automationtesting.in");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//button[@id='btn2']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		Thread.sleep(1000);
		
		
		dr.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		
		//*************************************************//
		
		Alert alert = dr.switchTo().alert();
		
		String alertMessage= dr.switchTo().alert().getText();
		
		System.out.println(alertMessage);	
		Thread.sleep(1000);
       
        alert.accept();
        
        //*************************************************//
        
        dr.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
        Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Thread.sleep(1000);
		
		
        Alert at = dr.switchTo().alert();
		
		String atm= dr.switchTo().alert().getText();
		
		System.out.println(atm);	
		Thread.sleep(1000);
       
        at.dismiss();
        
        //*************************************************//
        
        dr.findElement(By.xpath("//a[@href='#Textbox']")).click();
        Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(1000);
		
		Alert at1 = dr.switchTo().alert();
		
		String atm1= dr.switchTo().alert().getText();
		at1.sendKeys("Vivek");
		
		System.out.println(atm1);
		at1.accept();
		Thread.sleep(3000);
		
		dr.close();
	}
	}
