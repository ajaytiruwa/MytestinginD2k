package Pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginP {
	// Declaration of Web elements
		WebDriver Driver;

		// Finding Elements for Page Factory
		@FindBy(xpath = ".//*[@id='userName']")
		WebElement userName;

		@FindBy(xpath = ".//*[@id='Password']")
		WebElement passWord;

		@FindBy(xpath = ".//*[@type='submit']")
		WebElement submitButton;

		// Page Factory Initialization with Constructor
		public LoginP(WebDriver Driver) {

			this.Driver = Driver;
			PageFactory.initElements(Driver, this);

		}

		// make methods and return every webselemnts to Test
		public WebElement getUserName() {
			return userName;
		}

		public WebElement getPassWord() {
			return passWord;
		}

		public WebElement getSubmitButton() {
			return submitButton;
		}
		

	}
