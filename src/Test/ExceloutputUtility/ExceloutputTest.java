package Test.ExceloutputUtility;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;

import Pages.ExcelOutputUtility.ExcelOutputUtility;
import Utilities.ExcelWriteandRead;

public class ExceloutputTest {

	WebDriver driver;
	ExcelOutputUtility rm;
	ExcelWriteandRead rd;
	
	
	public ExceloutputTest(WebDriver driver) throws InterruptedException {
		rm=new ExcelOutputUtility(driver);
		rd= new ExcelWriteandRead("D:\\Ajay_new_selenium work\\TestData.xlsx");
		
		rm.exceloutput().click();
		rm.reportmast().click();
		rm.Addbutton().click();
		rm.reporttitle().sendKeys("Rtitle");
		rm.reportfrequency1().click();
		rm.reportfrequency().click();
		rm.browsebutton().sendKeys("D:\\JKGB Reports testing_14052018\\Fraud report\\FMS 1 part A,B\\FMS_1_Report_on_actual_2F_suspected_frauds_detected_during_the_Reporting_Period_26-Dec-17.xlsx");
		rm.clickcelender().click();
		System.out.println("Ajjuu1");
		rm.clickdate().click();
		System.out.println("Ajjuu");
		rm.savebutton().click();
		rm.datamap().click();
		rm.sheetname().sendKeys("fms121");
		rm.sql().sendKeys("Rpt-10750");
		Thread.sleep(4000);
		rm.save2().click();
		
	}

}
