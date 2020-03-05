package EHour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 

{
	WebDriver driver;
	
	
	By firstname=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By loginbutton=By.xpath("//button[@id='submit']");
	By pagedetails=By.xpath("//body//div[@class='login-wrapper']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void LoginintoEhour(String username1,String pwd1)
	{
		driver.findElement(firstname).sendKeys(username1);
		driver.findElement(password).sendKeys(pwd1);
		driver.findElement(loginbutton).click();
		
	}
	
	public void Mainpagedetails()
	{
		driver.findElement(pagedetails);
		
	}
	
	
	
	
	
//	public void TypeUsername(String uname)
//	{
//		driver.findElement(firstname).sendKeys(uname);
//	}
//	
//	public void TypePassword(String pwd)
//	{
//		driver.findElement(password).sendKeys(pwd);
//	}
//	
//	public void ClickLoginButton()
//	{
//		driver.findElement(loginbutton).click();
//	}
	
}
