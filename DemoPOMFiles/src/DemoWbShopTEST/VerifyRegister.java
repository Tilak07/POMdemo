package DemoWbShopTEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.RegisterPOM;

public class VerifyRegister 
{
	@Test
	public void checkLogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://demowebshop.tricentis.com/register");
		RegisterPOM reg=new RegisterPOM(driver);
		reg.entergender();
		reg.enterFirstName("tilak");
		reg.enterlastname("seegu");
		reg.enteremail("tilakseegu123@gmail.com");
		reg.enterpassword("Vishal@12");
		reg.enterconfirmpassword("Vishal@12");
		reg.clickregister();
	
		
		
	}
	

}
