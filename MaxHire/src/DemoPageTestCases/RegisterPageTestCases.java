package DemoPageTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoAutoPage.DemoLoginPage;

public class RegisterPageTestCases 

{
	@Test
	
	public void RegPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(16, TimeUnit.SECONDS);
		
		
		dr.get("http://demo.automationtesting.in/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		DemoLoginPage dp=new DemoLoginPage(dr);
		dp.LoginintoDemo("VIVEK","Gaikwad","Ravet","vgaikwad@maximaconsulting.net","7507979806","Movies","Hindi");
		Thread.sleep(2000);
		
		
		
		dr.close();
		
	}
	
}


