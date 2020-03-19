package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM 
{
	WebDriver driver;
	By gender=By.id("gender-male");
	By firstName=By.id("FirstName");
	By lastName=By.xpath("//input[@id='LastName']");
	By email=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By confirmpassword=By.xpath("//input[@id='ConfirmPassword']");
	By register=By.xpath("//input[@id='register-button']");
	
	public  RegisterPOM(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void entergender()
	{
		driver.findElement(gender).click();
	}
	
	public void enterFirstName(String fstname)
	{
		driver.findElement(firstName).sendKeys(fstname);
	}
	
	public void enterlastname(String lstname)
	{
		driver.findElement(lastName).sendKeys(lstname);
	}
	public void enteremail(String emid)
	{
		driver.findElement(email).sendKeys(emid);
	}
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void enterconfirmpassword(String confpwd)
	{
		driver.findElement(confirmpassword).sendKeys(confpwd);
	}
	public void clickregister()
	{
		driver.findElement(register).click();
	}
}
