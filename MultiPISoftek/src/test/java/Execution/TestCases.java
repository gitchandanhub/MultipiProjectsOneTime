package Execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.AppDriver;
import Pages.ContactUs;
import Utility.NavigateUrl;
import Utility.Verifylinks;

@Listeners(Listen.TestNG_Listeners.class)
public class TestCases extends AppDriver
{
      @Test(priority = 0)
      public void verifylinks() throws IOException, InterruptedException
      {
    	  int x = Integer.parseInt(config.getProperty("loopcount"));
    	  for(int i = 0; i<x; i++)
    	  {
    		  driver.navigate().to(config.getProperty("Url"));
	          Thread.sleep(3000);
    	  Verifylinks obj = new Verifylinks();
    	  NavigateUrl nuobj = new NavigateUrl();
    	  try {
    	  obj.linktest();
    	  
    	  }
    	  catch(Exception e)
    	  {
    		  
    	  }
    	 // nuobj.openurl();
    	  ContactUs con = new ContactUs();
    	  con.opencontactpage();
    	  con.EnterName(config.getProperty("Name"));
    	  con.EnterEmail(config.getProperty("Email"));
    	  con.Entermobile(config.getProperty("Mobile"));
    	  con.EnterDetail(config.getProperty("Details"));
    	  con.clicksubmit();
    	  con.getmsg();
    	  con.navigatehome();
    	  }
    	  
      }
      @Test(priority = 1, enabled = false)
      public void verifyContact() throws InterruptedException
      {
    	  ContactUs con = new ContactUs();
    	  con.opencontactpage();
    	  con.EnterName(config.getProperty("Name"));
    	  con.EnterEmail(config.getProperty("Email"));
    	  con.Entermobile(config.getProperty("Mobile"));
    	  con.EnterDetail(config.getProperty("Details"));
    	  con.clicksubmit();
    	  con.getmsg();
    	  con.navigatehome();
      }
}
