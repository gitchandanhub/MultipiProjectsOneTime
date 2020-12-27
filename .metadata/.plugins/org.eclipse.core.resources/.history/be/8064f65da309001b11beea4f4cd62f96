package Execution;
import java.util.List;

import java.util.concurrent.atomic.AtomicInteger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.AppDriver;
import Pages.Loginpage;
import Pages.Logout;
import Pages.Setup_tab;
import Utility.VerifyImages;

@Listeners(Listen.TestNG_Listeners.class)
public class WIPtab extends AppDriver

{
	AtomicInteger count = new AtomicInteger(1);
    @Test(priority =0)
    public void LoginTest() throws InterruptedException
    {
  	  Loginpage  lpobj = new Loginpage();
  	  lpobj.Enterusername(config.getProperty("Username"));
  	  lpobj.Enterpsswrd(config.getProperty("Password"));
  	  lpobj.clickbtn();
    }
    @Test(priority =1)
    public void verifyImages()
    {
  	  VerifyImages  viobj = new VerifyImages();
  	  viobj.ValidateImage();
    }

   @Test(priority = 2)
    public void WIP() throws InterruptedException
    {
  	  Pages.WIP dbobj = new Pages.WIP();
  	  dbobj.Click_WIP();
  	  dbobj.Click_Machine();
  	  dbobj.Machine_Save();
  	  dbobj.Machine_Filter();
  	  dbobj.Machine_Edit();
  	  dbobj.Machine_Delete();
  	  dbobj.Click_Operation();
  	  dbobj.Operation_Add();
  	  dbobj.Operation_Filter();
  	  dbobj.Operation_Edit();
  	  dbobj.Operation_Delete();
  	  dbobj.Click_LaborType();
  	  dbobj.Labor_Add();
  	  dbobj.Labor_Filter();
  	  dbobj.Labor_Edit();
  	  dbobj.Labor_Delete();
  	  dbobj.JobOperation_Add();
  	  	   
      }
   @Test(priority  = 3)
   public void out() throws InterruptedException
   {
   	Thread.sleep(2000);
   	Logout lobj = new Logout();
   	lobj.logouts();
   	System.out.println("Log out button is clicked");
   	driver.close();
   }
	
}
