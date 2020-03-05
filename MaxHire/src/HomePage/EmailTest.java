package HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

public class EmailTest 

{
	@Test
	
	public void SelectEmail() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		dr.get("http://demo.automationtesting.in/");
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(16,TimeUnit.SECONDS);
		
		
		System.out.println("*******Demo Testing Page displayed*********");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//button[@id='btn2']")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
		Thread.sleep(1000);
		
		List<WebElement>  lt= dr.findElements(By.xpath("//div[@class='ui-grid-canvas']//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-0005']"));
		//div[@class='ui-grid-canvas']//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-0005']
		{
			System.out.println("***Webtable size*****");
			System.out.println(lt.size());
			System.out.println("");
		}
		
		System.out.println("****Email Details****");
		for( int i=0; i<lt.size();i++)
		{	
			System.out.println(lt.get(i).getText());
		if(lt.get(i).getText().equals("teste.2228@teste.io"))
		{	
			System.out.println("");
			System.out.println("Details matched terminating the loop");
			lt.get(i).click();
			break;
		}
		}
		
		
		dr.close();
		
		
	}
	}
	
