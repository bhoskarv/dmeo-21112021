package pakage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		private WebDriver driver1;
		
		@FindBy (xpath= "//input[@id='email']")
		private WebElement username;
		
		@FindBy (xpath= "//input[@id='pass']")
		private WebElement pass;
		
		@FindBy (xpath= "//button[@name='login']")
		private WebElement login;
		
		@FindBy (xpath= "//a[text()='Log Out']")
		private WebElement logout;
		
		public LoginPage(WebDriver driver1) {
			this.driver1=driver1;
			PageFactory.initElements(driver1, this);  //.initElement is method & PageFactory is Class
		}
		public void Sendusername() {
			username.sendKeys("bhoskarvitthal@gmail.com");
		}
		public void Sendpass() 
		{
			pass.sendKeys("abcd12345");
		}

		public void Clickonlogin() 
		{
			login.click();
		}
		public void Logout()
		{
			logout.click();
		}
		

	}

	
