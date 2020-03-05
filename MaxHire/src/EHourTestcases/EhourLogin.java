package EHourTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import EHour.LoginPage;

public class EhourLogin 

{
	
	@Test
	public void VerifyValidLogin() throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		dr.get("https://ehourapp.com/login.html");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		String Pagetext=dr.findElement(By.xpath("//body//div[@class='login-wrapper']")).getText();
		System.out.println("***Ehour Login Page Text***");
		System.out.println(Pagetext);
		
		
		LoginPage lp=new LoginPage(dr);
		lp.LoginintoEhour("vgaikwad@maximaconsulting.net", "Arush@9900");
		System.out.println("");
		System.out.println("***Login Successful***");
		Thread.sleep(2000);
		
//		lp.TypeUsername("Vgaikwad");
//		Thread.sleep(1000);
//		
//		lp.TypePassword("1234");
//		Thread.sleep(1000);
//		
//		lp.ClickLoginButton();
//		Thread.sleep(1000);
		
		
		
		dr.close();
	}
}
