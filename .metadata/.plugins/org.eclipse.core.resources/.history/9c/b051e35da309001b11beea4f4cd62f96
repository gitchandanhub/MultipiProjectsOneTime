package Execution;

import java.util.concurrent.atomic.AtomicInteger;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.AppDriver;
import Pages.Loginpage;
import Pages.Logout;
import Pages.Setup_tab;
import Utility.VerifyImages;

@Listeners(Listen.TestNG_Listeners.class)
public class Setuptab extends AppDriver 

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
    public void setup_warehouse() throws InterruptedException
    {
  	  Setup_tab dbobj = new Setup_tab();
  	  dbobj.Click_setup();
  	 dbobj.Click_warehouse();
  	dbobj.Click_add_button();
  	  dbobj.add_warehouse_details_click_save( );
  	 dbobj.Search_and_copy_warehouse();
  	  dbobj.Edit_warehouse_details();
  	  Thread.sleep(5000);
  	  dbobj.Goto_setting_tab();
  	  dbobj.Delete_warehouse_from_setting();
  	  dbobj.Delete_warehouse();
  	  
  	  Thread.sleep(5000);
    }
    
    
  @Test(priority = 3)
    public void setup_location_bin() throws InterruptedException
    {
  	  Setup_tab location = new Setup_tab();
  	  location.Click_setup();
  	  //location.Click_warehouse();
  	  location.click_location_tab();
  	  location.click_add_button_location();
  	  location.location_filter_and_edit_location();
  	  location.click_delete_location( );
  	  Thread.sleep(5000);
  	 
    }
  @Test(priority = 4)
	  
    public void add_user() throws InterruptedException
    {
  	  Setup_tab add_user= new Setup_tab();
  	  
  	 add_user.Click_setup();
  	 
  	add_user.click_user_add();
  	 
  	 add_user.click_user_edit_delete();
  	 
  	 Thread.sleep(5000);

	  
}
  @Test(priority = 5)
	  
    public void reason_for_adjust() throws InterruptedException
    {
  	  Setup_tab Reason_for_adjust= new Setup_tab();
  	  
  	  Reason_for_adjust.Click_setup();
  	  Reason_for_adjust.click_reason_for_adjust();
  	  Reason_for_adjust.click_reason_for_adjust_add_and_save();
  	  Reason_for_adjust.click_reason_for_adjust_edit_delete();
  	 
  	  Thread.sleep(5000);

	  
}
    @Test(priority = 6)
	  
    public void ship_mode() throws InterruptedException
    {
  	  Setup_tab ship_mode= new Setup_tab();
  	  
  	  ship_mode.Click_setup();
  	  ship_mode.click_ship_mode();
  	  ship_mode.click_ship_mode_add_save();
  	  ship_mode.click_ship_mode_edit_delete();
  	 
  	  Thread.sleep(5000);

	  
}
    
    
    @Test(priority = 7, enabled = true)
    public void setup1() throws InterruptedException
    {
    	Pages.Setuptab dbobj = new Pages.Setuptab();
  	  dbobj.Click_setup();
  	log.info("Setup is clicked");
  	System.out.println("Setup is clicked");
  	  dbobj.Click_cube();
  	  dbobj.click_Cube_add();
  	  dbobj.click_Cube_save();
  	  dbobj.Cube_search_desc_textbox();
 	      dbobj.Edit_Cube();
 	  	  dbobj.Delete_Cube();
 	  	log.info("Cube completed");
 	  	System.out.println("Cube Completed");
 	  	  dbobj.Click_Zone();
  	  dbobj.Zone_Add_Button();
  	  dbobj.Zone_Save();
  	  dbobj.Zone_Filter();
  	  dbobj.Zone_Edit_Delete();
  	log.info("Zone Completed");
  	System.out.println("Zone Completed");
  	  dbobj.Click_UOMType();
  	  dbobj.UOM_Add_Save();
  	  dbobj.UOM_Filter();
  	  dbobj.UOM_Edit();
  	  dbobj.UOM_Delete();
  	log.info("UOM Completed");
  	System.out.println("UOM Completed");
  	  dbobj.Click_User_Defined_Status();
  	  dbobj.User_Defined_Status_Add_Save();
  	  
  	  dbobj.Status_Filter_Edit();
  	  dbobj.Click_ProjectMaster();
  	  dbobj.Add_ProjectMaster();
  	  dbobj.PM_Filter_Edit_Delete();

  	 
  	  
    }
    @Test(priority  = 8)
    public void out() throws InterruptedException
    {
    	Thread.sleep(2000);
    	Logout lobj = new Logout();
    	lobj.logouts();
    	System.out.println("Log out button is clicked");
    	driver.close();
    }
 	
    
}
