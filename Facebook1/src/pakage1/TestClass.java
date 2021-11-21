package pakage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

		WebDriver driver1;
		LoginPage loginpage;
		
		@BeforeClass
		public void beforeClass() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
//			System.setProperty("webdriver.chrome.driver", "D:\\vitthal selnium 09092021\\chromedriver.exe\\");----old path
			driver1 = new ChromeDriver();
			Thread.sleep(1000);
		}
		@BeforeMethod
		public void beforeMethod() throws InterruptedException
		{

			driver1.get("https://www.google.com/intl/en-GB/gmail/about/#");
			Thread.sleep(1000);
			loginpage = new LoginPage(driver1);
		}
		@Test
		public void testA()
		{
			loginpage.Sendusername();
			loginpage.Sendpass();
			loginpage.Clickonlogin();
		}
		
		@AfterMethod
		public void afterMethod()
		{
	
			System.out.println("hi");
//			loginpage.Logout();
		}
		
		@AfterClass
		public void afterClass() throws InterruptedException
		{
			Thread.sleep(2000);
			driver1.close();
		}
		
		
	}


