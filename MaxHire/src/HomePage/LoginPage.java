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

public class LoginPage 
{
	@Test
	public void LoginPage() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe"); 
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		dr.get("http://demo.automationtesting.in");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);	
		
		
		dr.findElement(By.xpath("//button[@id='btn2']")).click();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div//input[@placeholder='First Name']")).sendKeys("Vivek");
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div//input[@placeholder='Last Name']")).sendKeys("Gaikwad");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ravet");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Vgaikwad12@gmail.com");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("75079879807");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//input[@value='Male']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//input[@value='Movies']")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//div[@id='msdd']")).click();
		Thread.sleep(2000);
		
		List<WebElement> lr=dr.findElements(By.xpath("//li/a[@class='ui-corner-all']"));
				{
					System.out.println(lr.size());
				}
				
		
				
				for(int i=0;i<lr.size();i++)
				{
				System.out.println(lr.get(i).getText());
				if(lr.get(i).getText().equals("Hindi"))
				{
					lr.get(i).click();
					break;
					
				}
				}
				
			dr.findElement(By.xpath("//label[contains(text(),'Languages')]")).click();
				
				
		
//		dr.findElement(By.xpath("//select[@id='Skills']")).click();
//		Thread.sleep(2000);
//		
//		List<WebElement> lr2=dr.findElements(By.xpath("//select[@ng-model='Skill']"));
//		{
//			System.out.println(lr2.size());
//		}
//		
//		for(int i=0;i<lr2.size();i++)
//		{
//		System.out.println(lr2.get(i).getText());
//		if(lr2.get(i).getText().equals("Hindi"))
//		{
//			lr2.get(i).click();
//			break;
//			
//		}
//		}
		
		Select lt =new Select(dr.findElement(By.id("Skills")));
		lt.selectByVisibleText("Adobe Photoshop");
		lt.selectByIndex(2);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div//input[@id='checkbox3']")).click();
		Thread.sleep(3000);
		
		Select lt2 =new Select(dr.findElement(By.id("countries")));
		lt2.selectByVisibleText("India");
		lt2.selectByIndex(3);
		Thread.sleep(2000);
		
		Select lt21 =new Select(dr.findElement(By.xpath("//select[@id='country']")));
		lt21.selectByVisibleText("Bangladesh");
		lt21.selectByIndex(2);
		Thread.sleep(2000);
		
		
		Select lt3 =new Select(dr.findElement(By.id("yearbox")));
		lt3.selectByVisibleText("1919");
		lt3.selectByIndex(4);
		Thread.sleep(2000);
		
		Select lt4 =new Select(dr.findElement(By.xpath("//select[@placeholder='Month']")));
		lt4.selectByVisibleText("January");
		lt4.selectByIndex(1);
		Thread.sleep(2000);
		
		Select lt5 =new Select(dr.findElement(By.id("daybox")));
		lt5.selectByVisibleText("4");
		lt5.selectByIndex(4);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("2222");
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("4444");
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//li//a[@href='WebTable.html']")).click();
		Thread.sleep(3000);
		
		dr.close();
		
	
		
	System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
	WebDriver dr2=new ChromeDriver();
	dr2.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	dr2.get("https://money.rediff.com/mutual-funds/liquid");
	dr2.manage().window().maximize();
	dr2.manage().deleteAllCookies();
	dr2.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	
	
	List<WebElement> lr4=dr2.findElements(By.xpath("//form[@name='mututalfund']"));
			
	{
		System.out.println(lr4.size());
	}
	
	for(int i=0;i<lr4.size();i++)
	{
	System.out.println(lr4.get(i).getText());
	if(lr4.get(i).getText().equals("8.19"))
	{
		
		break;
		
	}
	}
	
	
	Thread.sleep(3000);
	dr2.close();

	}
}
