package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

public static void capturescreenshots(WebDriver driver, String Screenshotname, String filetype) throws IOException, InterruptedException {
        
        try {
                TakesScreenshot ts= (TakesScreenshot)driver;
                File s= ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(s, new File("./screenshots/"+Screenshotname+time()+filetype));
                System.out.println("Screenshot taken");
        	} catch (Exception e) {
                System.out.println(e.getMessage());
                
        	}
			}
	
	 			public static String time() {
	 			return new SimpleDateFormat("dd-MMMM-yyyy hh-mm-ss a").format(new Date());

}
}

