import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample {

	@BeforeTest
   @Parameters("broswerType")
	
          public void mailTest(String broswerType) throws MalformedURLException{

                   DesiredCapabilities dr=null;

                   if(broswerType.equals("firefox")){

                   dr=DesiredCapabilities.firefox();

                   dr.setBrowserName("firefox");

                   dr.setPlatform(Platform.WINDOWS);

                   }else{

                            dr=DesiredCapabilities.internetExplorer();
                          dr.setBrowserName("iexplore");

                           dr.setPlatform(Platform.WINDOWS);

                   }

                   RemoteWebDriver driver=new RemoteWebDriver(new     URL("http://192.168.0.4:5566/wd/hub"), dr);

                   driver.navigate().to("http://gmail.com");

                   driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");

                   driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");

                   driver.close();
                   
          }
}
