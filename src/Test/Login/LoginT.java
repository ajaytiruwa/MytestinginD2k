package Test.Login;

import org.openqa.selenium.WebDriver;

import Pages.Login.LoginP;


public class LoginT {
	LoginP LP;
	WebDriver Driver;
	
	public LoginT(WebDriver Driver,String username, String password) {
		
		this.Driver = Driver;
		LP = new LoginP(Driver);
		LP.getUserName().clear();
		LP.getUserName().sendKeys(username);
		LP.getPassWord().clear();
		LP.getPassWord().sendKeys(password);
		LP.getSubmitButton().click();
		

	}

}