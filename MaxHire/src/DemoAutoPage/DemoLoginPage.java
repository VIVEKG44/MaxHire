package DemoAutoPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DemoLoginPage

{
	WebDriver driver;
	
	By Signinbutton=By.xpath("//button[contains(text(),'Skip Sign In')]");
	By RegisterTabbutton=By.xpath("//a[contains(text(),'Register')]");
	By Firstname=By.xpath("//input[@ng-model='FirstName']");
	By Lastname=By.xpath("//input[@ng-model='LastName']");
	By Address=By.xpath("//textarea[@ng-model='Adress']");
	By EmailAddress=By.xpath("//input[@ng-model='EmailAdress']");
	By Phone=By.xpath("//input[@ng-model='Phone']");
	By Gender=By.xpath("(//input[@ng-model='radiovalue'][1])[2]");
	By Hobbies=By.xpath("//div//input[@type='checkbox']");
	By Languages=By.xpath("//div[@id='msdd']");
	By LangDropdown=By.xpath("//div//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li//a");
	By Randomclick=By.xpath("//label[contains(text(),'Languages')]");  
	
	public DemoLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LoginintoDemo(String Fname,String Lname,String Addr,String emailA,String Phn,String Hob, String LangDD)
	{
		driver.findElement(Signinbutton).click();
		driver.findElement(RegisterTabbutton).click();
		driver.findElement(Firstname).sendKeys(Fname);
		driver.findElement(Lastname).sendKeys(Lname);
		driver.findElement(Address).sendKeys(Addr);
		driver.findElement(EmailAddress).sendKeys(emailA);
		driver.findElement(Phone).sendKeys(Phn);
		driver.findElement(Gender).click();
		
		
		List<WebElement> lr=driver.findElements(Hobbies);
		{
			System.out.println("***No of Hobbies in the Page***");
			System.out.println(lr.size());
		}
		
		for(int i=0;i<lr.size();i++)
		{
			System.out.println(lr.get(i).getText());
			if(lr.get(i).getText().equals(Hob));
			{
				lr.get(i).click();
				break;
			}
		}
		
		driver.findElement(Languages).click();
		
		
		//********Languages dropdown*****//
		List<WebElement> lr1=driver.findElements(LangDropdown);
		{
			System.out.println("***No of Languages in the Drop down***");
			System.out.println(lr1.size());
		}
		
		for(int i=0;i<lr1.size();i++)
		{
			System.out.println(lr1.get(i).getText());
			if(lr1.get(i).getText().equals(LangDD));
			{
				lr1.get(i).click();
				break;
			}
		}
		
		driver.findElement(Randomclick).click();
		
		
	}



}
	
	