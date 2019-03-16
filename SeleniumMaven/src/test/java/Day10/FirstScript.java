package Day10;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import util.Base2;
import util.BrowserSetup;


public class FirstScript extends Base2{
  @Test
  public void f() throws IOException 
  {
	  ExtentHtmlReporter htmlR = new ExtentHtmlReporter("Google.html");
	  htmlR.setAppendExisting(true);
	  ExtentReports ex=new ExtentReports();
	  ex.attachReporter(htmlR);
	  ExtentTest test=ex.createTest("TitleTest");
	  test.info("Opening URL");
	  driver.get("http://google.com");
	  test.info("Checking Title");
	  Assert.assertEquals(driver.getTitle(), "Google");
	  BrowserSetup.getScreenShot("title");
	  test.pass("title test pass");
	  test.addScreenCaptureFromPath("D:\\SeleniumScripts\\SeleniumMaven\\titleFri_Mar_15_15_17_34_IST_2019.png");
	  ex.flush();
  }
}
