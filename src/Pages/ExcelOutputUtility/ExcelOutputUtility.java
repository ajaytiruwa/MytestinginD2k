package Pages.ExcelOutputUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExcelOutputUtility {

WebDriver driver;
	
	@FindBy(xpath=".//span[contains(text(),'Excel Output Utility')]")
    WebElement exceloutput;
	
	
	@FindBy(xpath=".//a[text()='Report Master for Excel Output Utility']")
    WebElement reportmast;
	
	@FindBy(xpath=".//button[@uib-tooltip='Add']")
    WebElement Addbutton;
	
	@FindBy(xpath=".//*[@id='ReportTitle']")
    WebElement reporttitle;
	
	@FindBy(xpath="(.//input[@aria-label='Report Frequency'])[2]")
    WebElement reportfrequency1;
	
	@FindBy(xpath=".//*[@id='ul-4']/li[2]/md-autocomplete-parent-scope/span")
    WebElement reportfrequency;
	
	@FindBy(xpath=".//*[@id='Browse']")
    WebElement browsebutton;
	
	@FindBy(xpath=".//*[@id='NewScr']/div/div[2]/div/div/div/md-input-container[4]/md-datepicker/div/button")
    WebElement clickcelender;

	@FindBy(xpath="//td[@id='md-3-month-2018-10-4']")
    WebElement clickdate;
	
	@FindBy(xpath=".//*[@id='btnSave']")
    WebElement savebutton;
	
	@FindBy(xpath=".//*[@id='btnMapping']")
    WebElement datamap;
	
	@FindBy(xpath=".//*[@id='SheetName']")
    WebElement sheetname;
	
	@FindBy(xpath=".//*[@id='SQL']")
    WebElement sql;
	
	@FindBy(xpath="(.//*[@id='btnSave' and @name='Save'])[2]")
    WebElement save2;
	
	   @FindBy(xpath="html/body/div[3]/span[3]")
	    WebElement message1;
	   
	   @FindBy(xpath="html/body/div[3]/span[3]")
	    WebElement message2;
	
	
	public ExcelOutputUtility(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement exceloutput() {
		return exceloutput;
	}
	
	public WebElement reportmast() {
		return reportmast;
	}
	
	public WebElement Addbutton() {
		return Addbutton;
	}

	
	public WebElement reporttitle() {
		return reporttitle;
	}
	
	public WebElement reportfrequency1() {
		return reportfrequency1;
	}
	
	public WebElement reportfrequency() {
		return reportfrequency;
	}
	
	public WebElement browsebutton() {
		return browsebutton;
	}
	
	public WebElement clickcelender() {
		return clickcelender;
	}
	
	public WebElement clickdate() {
		return clickdate;
	}
	
	public WebElement savebutton() {
		return savebutton;
	}
	
	
	
	/*public void  message1() {
		
		String  actual_msg=message1.getText();
		String expected="Record Saved Successfully";
		
		Assert.assertEquals(actual_msg, expected);
		String text=msg.getText();
		
		if(actual_msg.equals("Record Already Exist")){
            System.out.println("Duplicate record"+actual_msg);
            driver.close();

        }
		else
		{
               
		System.out.println("Message After saving the record== "+actual_msg);
		}
		
	}*/
	
	public WebElement datamap() {
		return datamap;
	}
	
	public WebElement sheetname() {
		return sheetname;
	}

	
	public WebElement sql() {
		return sql;
	}

	
	public WebElement save2() {
		return save2;
	}

	public void  message2() {
		
		String actual_msg=message2.getText();
		String expected="Record Saved Successfully";
		
		Assert.assertEquals(actual_msg, expected);
		
		System.out.println("Message After saving the record second time== "+actual_msg);
	}
}
