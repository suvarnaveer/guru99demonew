package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	public static void captureScreenshot(WebDriver driver,String Screenshotname) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("./ScreenShots/"+Screenshotname+".png"));
			System.out.println("Screenshot");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while taking screenshot:"+e.getMessage());
		} 
	}
}
