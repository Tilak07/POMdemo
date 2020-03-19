package DemoWbShopTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DemoWebShopPOM.FindByDEMO;
import DemoWebShopPOM.LoginPOM;

public class FindByDEMO_Login
{

		@Test
		public void checkLogin()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//driver.manage().window().fullscreen();
			driver.get("http://demowebshop.tricentis.com/login");
			FindByDEMO log=PageFactory.initElements(driver, FindByDEMO.class);
			log.enteremail("tilakseegu12@gmail.com");
			log.enterpassword("Vishal@12");
			log.clicklogin();
		}
}
