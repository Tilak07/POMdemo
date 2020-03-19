package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByDEMO 
{
	WebDriver driver;
	
	@FindBy(name="Email")
	WebElement Email;
	
	@FindBy(name="Password")
	WebElement Password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement loginBtn;
	
	
	public  FindByDEMO(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String emid)
	{
		Email.sendKeys(emid);
	}
	
	public void enterpassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginBtn.click();
	}	
}
