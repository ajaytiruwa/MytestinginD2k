package BaseDsriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Test.ExceloutputUtility.ExceloutputTest;
import Test.Login.LoginT;
import Utilities.ExcelWriteandRead;

public class BaseClass {
	WebDriver Driver;
	LoginT lg;
	ExcelWriteandRead ex;
	ExceloutputTest et;
	
	@BeforeSuite
	public void BeforeSuite() {

		System.setProperty("webdriver.chrome.driver", "D:\\Report Automation\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		Driver.get("http://192.168.1.41:8445/APP/Login");
		Driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
	@Test(priority=0,description="Login into system")
	public void login() {
		ex= new ExcelWriteandRead("D:\\Ajay_new_selenium work\\TestData.xlsx");
		lg=new LoginT(Driver, ex.getData(0, 1, 0), ex.getData(0, 1, 1));
		
	}
	@Test(priority=1,description="for Excel Output Utility")
	public void exceloutpt() throws InterruptedException {
		et=new ExceloutputTest(Driver);
		
	}
	
}
