package WMSTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestWMSRandom 
{
	WebDriver driver;
@Test
public void g() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Chandan Software\\Drivers\\chromedriver_83\\chromedriver.exe");
     System.setProperty("webdriver.chrome.silentOutput", "true");
     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// To Accept SSL certificate
     capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--incognito");
     
     capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  driver = new ChromeDriver(capabilities);
	  driver.navigate().to("https://wms.accentcontrols.com/NorthstarWMS-GR9-QA/login.aspx");
	  driver.manage().window().maximize();
      try
	  {
		  driver.findElement(By.xpath("//*[@id='details-button']")).click();
		  System.out.println("Advanced option clicked");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
		  Thread.sleep(2000);
	  }
	  catch(Exception e)
	  {
		  
	  }
      Thread.sleep(4000);
      driver.findElement(By.id("Login1_UserName")).sendKeys("GR9_QA");
      driver.findElement(By.id("Login1_Password")).sendKeys("welcome@1");
      driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[@id='ctl00_MenuTab']/div[1]/ul/li[2]/a/span/span/span")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id='ctl00_MenuTab']/div[2]/ul[2]/li[1]/a/span/span/span")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00__0']/td[4]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_RadTabStrip']/div/ul/li[2]/a/span/span/span")).click();
      Thread.sleep(3000);
      List<WebElement> flist = driver.findElements(By.tagName("iframe"));
      System.out.println(flist.size());
       driver.switchTo().frame(flist.get(0));
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id='PODetailGrid_ctl00_ctl02_ctl00_cmbItem_Arrow']")).click();
       Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@id='PODetailGrid_ctl00_ctl02_ctl00_cmbItem_DropDown']/div[2]/ul/li[2]/table/tbody/tr/td[2]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='PODetailGrid_ctl00_ctl02_ctl00_txtOrderQty']")).sendKeys(String.valueOf(2));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='PODetailGrid_ctl00_ctl02_ctl00_btnQuickAdd_input']")).click();
	 driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='ctl00_MenuTab']/div[1]/ul/li[4]/a/span/span/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='ctl00_MenuTab']/div[2]/ul[4]/li[1]/a/span/span/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_btnAdd']/span")).click();
	 Thread.sleep(2000);
	 List<WebElement> filist = driver.findElements(By.tagName("iframe"));
     System.out.println(filist.size());
      driver.switchTo().frame(filist.get(0));
      Thread.sleep(2000);
      if(driver.findElement(By.xpath("//span[@id='rdbManualId']//span[@class='rbText rbPrimary'][contains(text(),'No')]")).isSelected())
	   {
	   
	   Thread.sleep(1000);
	   }
	   else
	   {
		   driver.findElement(By.xpath("//span[@id='rdbManualId']//span[@class='rbText rbPrimary'][contains(text(),'No')]")).click();
		   Thread.sleep(1000);
	   }
      driver.findElement(By.xpath("//*[@id='txtShipOrderNo']")).sendKeys("bajitest001");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id='cmbPickType_Input']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id='cmbPickType_DropDown']/div/ul/li[1]")).click();
      
    		  }
}
