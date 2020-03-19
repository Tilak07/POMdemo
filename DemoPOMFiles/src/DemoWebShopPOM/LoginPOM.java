package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM 
{
	WebDriver driver;
	
	By email=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By login=By.xpath("//input[@class='button-1 login-button']");
	
	public  LoginPOM(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void enteremail(String emid)
	{
		driver.findElement(email).sendKeys(emid);
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	
	
}
