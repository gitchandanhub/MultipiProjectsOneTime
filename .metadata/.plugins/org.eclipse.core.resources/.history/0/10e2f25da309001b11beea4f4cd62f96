package Execution;

import java.util.List;

import java.util.concurrent.atomic.AtomicInteger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.AppDriver;
import Pages.CreateSO;
import Pages.Dashboard;
import Pages.DetailPO;
import Pages.Inventory;
import Pages.Loginpage;
import Pages.Logout;
import Pages.POmaster;
import Pages.SOdetails;
import Pages.Setup_tab;
import Utility.VerifyImages;


@Listeners(Listen.TestNG_Listeners.class)
public class Testcases extends AppDriver 
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
              public void Addpomaster() throws InterruptedException
              {
            	  Dashboard dbobj = new Dashboard();
            	  dbobj.Clickreceiving();
            	  dbobj.Clickpo();
            	  dbobj.Addpo();
            	  POmaster poobj = new POmaster();
            	  poobj.clickvendor();
            	  poobj.SavePO();
              }
              @Test(priority =3)
              public void podetail() throws InterruptedException
              {
            	  DetailPO dpobj = new   DetailPO();
            	  dpobj.clickporow();
            	  //dpobj.clickpocheckbox();
            	 
            	  Dashboard dbobj = new Dashboard();
            	  
            	  dbobj.clickDetailPO();
            	  Thread.sleep(3000);
                  
                   try
                   {
                	   dpobj.selectItem();
                	   dpobj.EnterItemquantity();
                	   dpobj.clickquickadd();
                   }
                   catch(Exception e)
                   {
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
            	 Thread.sleep(2000);
            	 driver.switchTo().defaultContent();
            	 Thread.sleep(2000);
                   }
              }
             @Test(priority =4)
              public void CreateSalesOrder() throws InterruptedException
              {
            	  CreateSO CSobj = new CreateSO();
            	  CSobj.createSO();
            	  List<WebElement> filist = driver.findElements(By.tagName("iframe"));
            	     System.out.println(filist.size());
            	      driver.switchTo().frame(filist.get(0));
            	      Thread.sleep(2000);
            	      CSobj.EnterShipordernumber(config.getProperty("Shipmentnumber"));
            	  CSobj.clickpicktype();
            	  CSobj.savebutton();
              }
             @Test(priority =5)
              public void SOdetail() throws InterruptedException
              {
            	  SOdetails  soobj = new SOdetails();
            	  soobj.SelectSORow();
            	  soobj.ClickDetailSO();
            	  soobj.SelectItem();
            	  soobj.EnterItemQuantity(3);
            	  soobj.ClickQuickadd();
            	  Thread.sleep(5000);
              }
              
              @Test(priority = 7)

              public void inventory() throws InterruptedException
              {
              	  Inventory inventory= new Inventory();
              	  
              	  inventory.Click_inventory_tab();
              	System.out.println("Inventory tab clicked");
              	 
              	  inventory.Click_master_inventory_add();
              	System.out.println("inventory add started");
              
              	  inventory.Click_location_and_quantities();
              	System.out.println("location and quantity");
              	           	
              	 inventory.item_delete1();
             	System.out.println("item deleted");
              	 
              	inventory.edit_item_details();
            	System.out.println("item edited");

              	Thread.sleep(5000);
              }

                  
                

@Test(priority = 6)

public void SOdetails() throws InterruptedException
{
	  Pages.SOdetails1 Sodetails= new Pages.SOdetails1();
	  
	  
	 Sodetails.edit_delete_SO();
	 Sodetails.addSO();
	 
	  Sodetails.SelectSORow();
	 Sodetails.ClickDetailSO();
	 Sodetails.SelectItem();
	 
	 Sodetails.EnterItemQuantity();
	 Sodetails.ClickQuickadd();
	 Sodetails.manuallypick();
	 Sodetails.unpick();
	 
	 Sodetails.addSO();
	 
	  Sodetails.SelectSORow();
	  Sodetails.ClickDetailSO();
	 Sodetails.SelectItem();
	 
	 Sodetails.EnterItemQuantity();
	 Sodetails.ClickQuickadd();
	 
	 Sodetails.quickpick();

	 Thread.sleep(5000);
}
@Test(priority  = 8)
public void out() throws InterruptedException
{
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	Logout lobj = new Logout();
	lobj.logouts();
	System.out.println("Log out button is clicked");
	driver.close();
}
	
              
              
              
}
