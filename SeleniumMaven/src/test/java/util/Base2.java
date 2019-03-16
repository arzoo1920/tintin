package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import util.BrowserSetup;

public class Base2 {
 public WebDriver driver;
 
  @BeforeTest(alwaysRun=true)
  
  public void beforeTest()
  {
	 driver=BrowserSetup.browserStart("chrome");
	 
  }
  @AfterTest
  public void afterTest()
  {
	  driver.quit();
  }
  
}
