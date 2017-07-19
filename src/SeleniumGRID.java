import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumGRID {

	  WebDriver driver;
	  String baseUrl,nodeUrl;
	  
	  @BeforeTest
	  public void setUp() throws MalformedURLException{
		  
		  baseUrl = "http://newtours.demoaut.com/";
		  nodeUrl ="http://192.168.0.4:5566/wd/hub";
		  
		  DesiredCapabilities cap = DesiredCapabilities.firefox();
		  cap.setBrowserName("firefox");
		  cap.setPlatform(Platform.WINDOWS);
		  
		  driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		  
	  }
	  @AfterTest
	  public void aftertest(){
		  driver.quit();
	  }
	  @Test
	  public void simpleTest(){
		  driver.get(baseUrl);
		  driver.manage().window().maximize();
		  Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	  }

}
