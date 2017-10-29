package is.ru.TicTacToe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public abstract class SeleniumTestWrapper {
  static WebDriver driver;
  static String baseUrl;

  @BeforeClass
  public static void openBrowser() {
	DesiredCapabilities caps = DesiredCapabilities.chrome();
	caps.setCapability("platform", "Windows 10");
	caps.setCapability("version", "61.0");
	try {
		driver = new RemoteWebDriver(new URL("http://PepsiGun:6f27147a-345a-4a0f-a5d2-85c4453cf6f0@ondemand.saucelabs.com:80/wd/hub"), caps);
	} catch (Exception e) {
		driver.quit();
	}
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    baseUrl = "http://tic-cat-dog.herokuapp.com/";
  }
  
  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}