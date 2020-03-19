package DemoWbShopTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.LoginPOM;

public class VerifyLogin
{

		@Test
		public void checkLogin()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//driver.manage().window().fullscreen();
			driver.get("http://demowebshop.tricentis.com/login");
			LoginPOM login=new LoginPOM(driver);
			login.enteremail("tilakseegu12@gmail.com");
			login.enterpassword("Vishal@12");
			login.clicklogin();
			
			
		}
}
