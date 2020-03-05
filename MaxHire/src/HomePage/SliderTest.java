package HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTest

{
	@Test
	
	public void SlideTest() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","../MaxHire/Browser/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		dr.get("http://demo.automationtesting.in/Slider.html");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		System.out.println("****Webpage displayed*****");
		
		WebElement slider=dr.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		Thread.sleep(2000);
		
		System.out.println("****Slider bar Element clicked*****");
		
		Actions act=new Actions(dr);
		
		act.clickAndHold(slider).moveByOffset(334, 101).release().perform();
		Thread.sleep(2000);
		//slider.click();
		
		System.out.println("****Slider bar Moved****");
		
		dr.close();
		
		
	}
}
