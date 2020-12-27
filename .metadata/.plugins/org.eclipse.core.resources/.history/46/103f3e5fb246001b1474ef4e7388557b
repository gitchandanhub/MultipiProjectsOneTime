package Pages;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.AppDriver;

public class Setup_tab  extends AppDriver 
{
    
	Actions actions = new Actions(driver);
	Actions builder = new Actions(driver);
	
	
	
	public Setup_tab()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath = "//span[contains(text(),'Setup')]")   WebElement setup;
     @FindBy(xpath = "//span[contains(text(),'Warehouse')]")   WebElement warehouse;
     @FindBy(xpath = "//span[@id='ctl00_ContentPlaceHolder1_WhouseGrid_ctl00_ctl02_ctl00_btnAdd']")   WebElement add_button;
     @FindBy(xpath = "//input[@id='txtWhouseName']")   WebElement warehouse_name;
     @FindBy(xpath = "//input[@name='txtCompanyName']")   WebElement company_name;
    @FindBy(xpath = "//input[@id='txtAddress']")   WebElement address;
     @FindBy(xpath = "//input[@id='txtCity']")   WebElement city;
    @FindBy(xpath = "//input[@id='txtState']")   WebElement state;
    @FindBy(xpath = "//input[@id='txtZipCode']")   WebElement pincode;
    @FindBy(xpath = "//input[@id='btnSave_input']")   WebElement click_save;
    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_WhouseGrid_ctl00_ctl02_ctl03_FilterTextBox_DesignatedName']")   WebElement search_textbox;
    @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_WhouseGrid_ctl00_ctl02_ctl03_Filter_DesignatedName']")   WebElement click_filter;
    @FindBy(css = ".rmItem:nth-child(6) .rmText")   WebElement click_filter1;
    @FindBy(css = ".rmItem:nth-child(1) .rmText")   WebElement click_filter2;
    
    @FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolder1_WhouseGrid_GridData']")   WebElement click_grid;
    
   @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_WhouseGrid_ctl00_ctl04_btnCopy']")   WebElement copy_warehouse; 
   
   @FindBy(xpath = "//td[contains(text(),'Pisoftektest')]")   WebElement Edit_warehouse;
   
   @FindBy(xpath = "//span[@id='ctl00_ContentPlaceHolder1_WhouseGrid_ctl00_ctl02_ctl00_btnDelete']")   WebElement Delete_warehouse;
   
   @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]")   WebElement click_delete_ok;
 
   @FindBy(xpath = "//span[contains(text(),'Settings')]")   WebElement click_setting_tab;
 
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$WarehouseSettingGrid$ctl00$ctl02$ctl03$FilterTextBox_WarehouseId']")   WebElement searchtext_warehouse_setting;
 
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$WarehouseSettingGrid$ctl00$ctl02$ctl03$Filter_WarehouseId']")   WebElement filter_warehouse_setting;
 
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$WarehouseSettingGrid$ctl00$ctl04$gbcDelete']")   WebElement click_delete_icon_setting;
 
   
   /*Goto Location/Bin tab and  perform test scenarios*/
   
   @FindBy(xpath = "//ul[8]//li[2]//a[1]//span[1]//span[1]//span[1]")   WebElement click_location_bin;

   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$LocationGrid$ctl00$ctl02$ctl00$btnAdd']")   WebElement click_add_button ;
   @FindBy(xpath = "//input[@name='txtLocation']")   WebElement location_bin_name ;
   @FindBy(xpath = "//span[contains(text(),'Pick')]")   WebElement location_pick ;
   @FindBy(xpath = "//td[1]//div[1]//table[1]//tbody[1]//tr[1]//td[2]//a[1]")   WebElement location_pick_zone ;
   @FindBy(xpath = "//input[@name='cmbPickZone']")   WebElement select_location_zone ;
   @FindBy(xpath = "//input[@name='btnSave']")   WebElement location_click_save ;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$LocationGrid$ctl00$ctl02$ctl03$FilterTextBox_Bin']")   WebElement location_filter_textbox ;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$LocationGrid$ctl00$ctl02$ctl03$Filter_Bin']")   WebElement location_filter1 ;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$LocationGrid$ctl00$ctl04$EditButton']")   WebElement location_edit ;
   @FindBy(xpath = "//input[@name='txtDescription']")   WebElement location_edit_description ;
   @FindBy(xpath = "//span[contains(text(),'Temp')]")   WebElement location_edit_type;

   @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement click_ok;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$LocationGrid$ctl00$ctl04$gbcDelete']") WebElement click_delete_location_bin ;
 
   @FindBy(xpath = "//div[@class='rgDataDiv']//td[4]") WebElement click_location_delete;
   @FindBy(xpath = " //tr//tr//tr[1]//td[4]") WebElement click_location;
   
   
   
   /*Goto users tab and  perform test scenarios    */
   @FindBy(xpath = "//span[contains(text(),'Users')]")   WebElement click_user ;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl02$ctl00$btnAdd']")   WebElement click_add ;
   @FindBy(xpath = "//body/form/div[@class='RadAjaxPanel']/div/div/table/tbody/tr/td/div/div[@class='RadMultiPage RadMultiPage_Hay multiPage']/div[@class='rmpView']/fieldset[@class='PageViewFieldset']/div/fieldset[@class='TabbedFieldset']/table/tbody/tr/td/div[@class='RadComboBox RadComboBox_Hay']/table/tbody/tr[@class='rcbReadOnly']/td[@class='rcbArrowCell rcbArrowCellRight']/a[1]")   WebElement select_warehouse ;
   @FindBy(xpath = "//*[@id=\"cmbWarehouse_DropDown\"]/div/ul/li[61]")   WebElement select_warehouse1 ;
   
   @FindBy(xpath = "//div[@class='rmpView']//div[2]//fieldset[1]//table[1]//tbody[1]//tr[1]//td[1]//span[1]//span[1]")   WebElement click_setup_option ;
   @FindBy(xpath = "//*[@id=\"chkAddChangeItem\"]/span[1]")   WebElement click_inventory_add ;
   @FindBy(xpath = "//*[@id=\"chkAddChangePickingOrder\"]/span[1]")   WebElement click_pick ;
   @FindBy(xpath = "//span[contains(text(),'Operator Details')]")   WebElement click_operator_details ;
   @FindBy(xpath = "//input[@name='txtName']")   WebElement click_operator_details_name;
   @FindBy(xpath = "//input[@name='txtPassword']")   WebElement click_operator_details_password ;
   @FindBy(xpath = "//input[@name='txtLogonId']")   WebElement click_operator_details_login ;
   @FindBy(xpath = "//*[@id=\"ChkSupervisor\"]/span[1]")   WebElement click_operator_details_login_admin ;
   @FindBy(xpath = "//input[@name='btnSave']")   WebElement click_operator_details_login_save ;
   
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl02$ctl03$Filter_OperatorName']") WebElement click_filter_button;
   
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl02$ctl03$FilterTextBox_OperatorName']")   WebElement click_user_filter ;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl04$EditButton']")   WebElement click_edit ;
   @FindBy(xpath = "//*[@id=\"chkAddChangeRecvOrder\"]/span[1]")   WebElement click_operation_receiving ;
   @FindBy(xpath = "//input[@name='txtPhone']")   WebElement click_operation_phone ;

   @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]")   WebElement click_user_delete_ok;

   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl04$gbcDelete']")   WebElement click_user_delete ;

   @FindBy(xpath ="//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl02$ctl03$FilterTextBox_Warehouse']") WebElement click_warehouse_filter;

   @FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$UserListGrid$ctl00$ctl02$ctl03$Filter_Warehouse']") WebElement click_warehouse_filter1;
 
 
   
   
   /*Goto Reason_for_adjust tab and  perform test scenarios    */
   
   @FindBy(xpath = "//span[contains(text(),'Reason for Adjust')]") WebElement click_reason_for_adjsut;
   
 
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ReasonGrid$ctl00$ctl02$ctl00$btnAdd']") WebElement click_reason_for_adjsut_add;
   
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtReason']") WebElement click_reason_for_adjsut_textbox;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement click_reason_for_adjsut_description;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ReasonGrid$ctl00$ctl02$ctl00$btnSave']") WebElement click_reason_for_adjsut_save;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ReasonGrid$ctl00$ctl04$EditButton']") WebElement click_reason_for_adjsut_edit;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ReasonGrid$ctl00$ctl04$gbcDelete']") WebElement click_reason_for_adjsut_delete;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ReasonGrid$ctl00$ctl02$ctl03$FilterTextBox_Reason']") WebElement click_reason_for_adjsut_filter;
   @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement click_reason_for_adjsut_delete_ok;
   @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ReasonGrid$ctl00$ctl02$ctl03$Filter_Reason']") WebElement click_reason_for_adjsut_filter2;
 
   
   
   /*Goto ship mode tab and  perform test scenarios    */

@FindBy(xpath = "//span[contains(text(),'Ship Modes')]") WebElement click_ship_modes;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipModeGrid$ctl00$ctl02$ctl00$btnAdd']") WebElement click_ship_modes_add;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtShipMode']") WebElement click_ship_modes_name;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtShippingMethod']") WebElement click_ship_modes_method;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipModeGrid$ctl00$ctl02$ctl00$btnSave']") WebElement click_ship_modes_save;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipModeGrid$ctl00$ctl02$ctl03$FilterTextBox_ShipMode']") WebElement click_ship_modes_filter;

@FindBy(xpath = "//span[@class='rbPrimaryIcon rbToggleCheckbox']") WebElement click_ship_modes_auto_release;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipModeGrid$ctl00$ctl04$EditButton']") WebElement click_ship_modes_edit;
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipModeGrid$ctl00$ctl04$btnDelete']") WebElement click_ship_modes_delete;


@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipModeGrid$ctl00$ctl02$ctl03$Filter_ShipMode']") WebElement click_ship_modes_filter2;

@FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement click_ship_modes_delete_ok;
   
@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtPriority']") WebElement click_ship_modes_priority;
   

    public void Click_setup() throws InterruptedException
     {
    	 setup.click();
    	 Thread.sleep(3000);
    	 System.out.println("Clicked on setup");
    	 log.info("Clicked on setup");
     }
     public void Click_warehouse() throws InterruptedException
     {
    	 warehouse.click(); 
    	 Thread.sleep(2000);
    	 System.out.println("Clicked on warehouse");
    	 log.info("Clicked on warehouse");
     }
     
     public void Click_add_button() throws InterruptedException
     {
    	 add_button.click(); 
    	 Thread.sleep(2000);
    	 System.out.println("Clicked on add button");
     log.info("Clicked on add button");
     
    }
 
     
     public void add_warehouse_details_click_save() throws InterruptedException
     {
    	 
    	 Thread.sleep(2000);
    	 int i=201301;
    	 driver.switchTo().frame("winPopup");
    	 warehouse_name.clear();
    	 warehouse_name.click(); 
    	 warehouse_name.sendKeys("Pisoftektest");
    	 company_name.sendKeys("PItest");
    	 address.sendKeys("Noida");
    	 city.sendKeys("Noida");
    	 state.sendKeys("UP");
    	 pincode.sendKeys(String.valueOf(i));
    	 Thread.sleep(2000);
    	 click_save.click();
    	 
    	 
    	 Thread.sleep(2000);
    	 System.out.println("New warehouse created successfully");
     log.info("New warehouse created successfully");
     
    }
 
     public void Search_and_copy_warehouse() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 search_textbox.clear();
    	 search_textbox.click(); 
    	 search_textbox.sendKeys("Pisoftektest");
    	 Thread.sleep(2000);
    	 click_filter.click();
    	 Thread.sleep(2000);
    	 click_filter1.click();
    	 System.out.println("Warehouse searched succcessfully");
    	 log.info("Warehouse searched successfully");
    	 Thread.sleep(3000);
    	click_grid.click();
    	Thread.sleep(2000);
    	 copy_warehouse.click();
    	 driver.switchTo().frame("winPopup");
    	 Thread.sleep(2000);
    	 warehouse_name.clear();
    	 warehouse_name.sendKeys("Pisoftektest_copy");
    	 Thread.sleep(2000);
    	 click_save.click();
    	 
    	 
    	 Thread.sleep(2000);
    	 
    	 
   
    	 
    	 System.out.println("Warehouse copied succcessfully");
    	 
     log.info("Warehouse copied successfully");
     
    }
     
     
     public void Edit_warehouse_details() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 search_textbox.clear();
    	 search_textbox.click(); 
    	  
    	 search_textbox.sendKeys("Pisoftektest_copy");
    	 Thread.sleep(2000);
    	 click_filter.click();
    	 Thread.sleep(2000);
    	 click_filter1.click();
    	 System.out.println("Warehouse searched succcessfully");
    	 log.info("Warehouse searched successfully");
    	 Thread.sleep(2000);
    	 actions.doubleClick(Edit_warehouse).perform();
    	 
    	 Thread.sleep(2000);
    	 driver.switchTo().frame("winPopup");
    	 Thread.sleep(2000);
    	
    	 company_name.clear();
    	 company_name.sendKeys("PItest_edit");
    	 address.clear();
    	 address.sendKeys("Noida_edit");
    	 Thread.sleep(2000);
    	 click_save.click();
    	 System.out.println("Warehouse edited succcessfully");
    	 log.info("Warehouse edited successfully");
    	 
     }
     
     public void Goto_setting_tab() {
 		
    	 
    	 for (String handle : driver.getWindowHandles()) {
    		  try {
    		    driver.switchTo().window(handle);
    		  } catch (NoSuchWindowException e) {
    			  
    		    
    		  }
    		}
    	 
    	 click_setting_tab.click();
    	 
    	 
    	 
 	}
     
     public void Delete_warehouse_from_setting() throws InterruptedException
     {
    	 
    	 
    	 Thread.sleep(3000);
    	 searchtext_warehouse_setting.clear();
    	 searchtext_warehouse_setting.click(); 
    	 
    	 searchtext_warehouse_setting.sendKeys("Pisoftektest");
    	 
    	 filter_warehouse_setting.click();
    	
    	 click_filter1.click();
    	 
    	
    	 System.out.println("Warehouse searched succcessfully in setting tab");
    	 log.info("Warehouse searched successfully in setting tab");
    	 
    	 
    	 Thread.sleep(6000);
    	 click_delete_icon_setting.click();
    	 
    
    	 click_delete_ok.click();
    	 
    	 
    	 Thread.sleep(6000);
    	 
    	 searchtext_warehouse_setting.clear();
    	 searchtext_warehouse_setting.click(); 
    	 
    	 searchtext_warehouse_setting.sendKeys("Pisoftektest_copy");
    	 Thread.sleep(3000);
    	 filter_warehouse_setting.click();
    	 Thread.sleep(3000);
    	 click_filter1.click();
    	 
    	 Thread.sleep(6000);
    	 click_delete_icon_setting.click();
    	 Thread.sleep(2000);
    	
    	 click_delete_ok.click();
    	 
    	 System.out.println("Warehouse deleted succcessfully from setting tab");
    	 log.info("Warehouse deleted successfully from setting tab");
    	 
    }
     
     
     public void Delete_warehouse() throws InterruptedException
     {
    	 
    	 warehouse.click(); 
    	 
    	 System.out.println("Clicked on warehouse tab");
    	 log.info("Clicked on warehouse tab");
    	 Thread.sleep(3000);
    	 search_textbox.clear();
    	 search_textbox.click(); 
    	  
    	 search_textbox.sendKeys("Pisoftektest");
    	 Thread.sleep(2000);
    	 click_filter.click();
    	 Thread.sleep(2000);
    	 click_filter1.click();
    	 
    	 Thread.sleep(3000);
    	 System.out.println("Warehouse searched succcessfully");
    	 log.info("Warehouse searched successfully");
    	 
    	 actions.click(Edit_warehouse).perform();
    	 
    	 Delete_warehouse.click();
    	 
    	
    	 click_delete_ok.click();
    	 
    	 Thread.sleep(3000);
    	 search_textbox.clear();
    	 search_textbox.click(); 
    	  
    	 search_textbox.sendKeys("Pisoftektest_copy");
    	 Thread.sleep(2000);
    	 click_filter.click();
    	 Thread.sleep(2000);
    	 click_filter1.click();
    	 System.out.println("Warehouse searched succcessfully");
    	 log.info("Warehouse searched successfully");
    	 
    	 actions.click(Edit_warehouse).perform();
    	 
    	 Delete_warehouse.click();
    	 
    	
    	 click_delete_ok.click();
    	 
    	 Thread.sleep(3000);
    	 
    	 
    	 System.out.println("Warehouse deleted succcessfully");
    	 log.info("Warehouse deleted successfully");
    	 
    	 /*Goto Location/Bin tab and  perform test scenarios*/
    }
	
     
     public void click_location_tab() throws InterruptedException
     {
    	 
    	 
    	 
    	 click_location_bin.click();
    	 Thread.sleep(2000);
    	 
    	 System.out.println("clicked on Location/bin tab");
    	 log.info("clicked on Location/bin tab");
     }
     
     public void click_add_button_location() throws InterruptedException
     {
    	 click_add_button.click();
    	 driver.switchTo().frame("winPopup");
    	 Thread.sleep(2000);
    	 location_bin_name.sendKeys("Noida62");
    	 Thread.sleep(2000);
    	 location_pick.click();
    	 location_pick_zone.click();
    	 select_location_zone.sendKeys("Supply");
    	 Thread.sleep(3000);
    	 
    	 
    	 
    	location_click_save.click();
    	Thread.sleep(3000);
  		
  			  
 
    	 
    	 System.out.println("New location/Bin created successfully");
    	 log.info("New location/Bin created successfully");
    	 
     }
     
     public void location_filter_and_edit_location() throws InterruptedException
     {
    	 
    	 Thread.sleep(3000);
    	 for (String handle : driver.getWindowHandles()) {
     		  try {
     		    driver.switchTo().window(handle);
     		  } catch (NoSuchWindowException e) {
     			  
     		    
     		  }
     		}
    	 
    	 
    	 
    	 location_filter_textbox.click();
    	 Thread.sleep(3000);
    	 location_filter_textbox.sendKeys("Noida62");
    	 Thread.sleep(3000);
    	 location_filter1.click();
    	 Thread.sleep(3000);
    	 click_filter1.click();
    	 Thread.sleep(3000);
    	 location_edit.click();
    	 Thread.sleep(3000);
    	 driver.switchTo().frame("winPopup");
    	 location_edit_description.clear();
    	 Thread.sleep(3000);
    	 location_edit_description.click();
    	 Thread.sleep(3000);
    	 location_edit_description.sendKeys("editdone");
    	 Thread.sleep(3000);
    	 location_edit_type.click();
    	 Thread.sleep(3000);
    	 location_click_save.click();
    	 Thread.sleep(3000);
    	 System.out.println("Location/Bin searched and edit successfully");
    	 log.info("Location/Bin searched and edit successfully");
    	 
     }
     public void click_delete_location() throws InterruptedException
     {
    	 for (String handle : driver.getWindowHandles()) {
      		  try {
      		    driver.switchTo().window(handle);
      		  } catch (NoSuchWindowException e) {
      			  
      		    
      		  }
      		}
       	 
    	 
    	 //click_location.click();
    	 Thread.sleep(2000);
    	 
    	 click_delete_location_bin.click();
    	
    	 Thread.sleep(2000);
    	 click_ok.click();
    	 
    	 System.out.println("Location/Bin deleted successfully");
    	 log.info("Location/Bin delted successfully");
    	 
     }
     
     public void click_user_add() throws InterruptedException
     {
     
    	 Thread.sleep(2000);
    	 click_user.click();
    	 Thread.sleep(2000);
    	 click_add.click();
    	 Thread.sleep(2000);
    	 driver.switchTo().frame("winPopup");
    	 
    	 select_warehouse.click();
    	 
    	 Thread.sleep(2000);
    	 
    	 select_warehouse1.click();
    	 Thread.sleep(2000);
    	 click_setup_option.click();
    	 Thread.sleep(2000);
    	 click_inventory_add.click();
    	 Thread.sleep(2000);
    	 click_pick.click();
    	 Thread.sleep(2000);
    	 click_operator_details.click();
    	 Thread.sleep(2000);
    	 click_operator_details_name.sendKeys("PIuser");
    	 Thread.sleep(2000);
    	 click_operator_details_password.sendKeys("PIuser");
    	 Thread.sleep(2000);
    	 click_operator_details_login.sendKeys("PIuser");
    	 Thread.sleep(2000);
    	 click_operator_details_login_admin.click();
    	 Thread.sleep(2000);
    	 click_operator_details_login_save.click();
    	 Thread.sleep(2000);
    	 
    	 System.out.println("New user created successfully");
    	 log.info("New user created successfully");
    	 
     }
     
     public void click_user_edit_delete() throws InterruptedException
     {
    	 
    	 
    	 click_user.click();
    	 
    	 click_warehouse_filter.clear();
    	 Thread.sleep(2000);
    	   	 
    	 click_warehouse_filter1.click();
    	 Thread.sleep(2000);
    	 click_filter2.click();
    	 Thread.sleep(2000);
    	 
    	 Thread.sleep(5000);
    	 click_user_filter.clear();
    	 click_user_filter.sendKeys("PIuser");
    	 Thread.sleep(2000);
    	 click_filter_button.click();
    	 Thread.sleep(2000);
    	 click_filter1.click();
    	 Thread.sleep(3000);
    	 click_edit.click();
    	 driver.switchTo().frame("winPopup");
    	 Thread.sleep(3000);
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,1000)");
    	 
    	 click_operation_receiving.click();
    	 Thread.sleep(3000);
    	 click_operator_details.click();
    	 Thread.sleep(3000);
    	 click_operation_phone.clear();
    	 click_operation_phone.sendKeys("989104234");
    	 
    	 Thread.sleep(3000);
    	 click_operator_details_login_save.click();
    	 Thread.sleep(2000);
    	 
    	 
    	 click_user_delete.click();
    	 Thread.sleep(2000);
    	 click_user_delete_ok.click();
    	 
    	 System.out.println("User edited and deleted successfully");
    	 log.info(" User edited and deleted successfully");
    	 
    	 
     }
     
     
     
     public void click_reason_for_adjust() throws InterruptedException
     {
    	 for (String handle : driver.getWindowHandles()) {
      		  try {
      		    driver.switchTo().window(handle);
      		  } catch (NoSuchWindowException e) {
      			  
      		    
      		  }
      		}
       
    	
    	 Thread.sleep(2000);
    	 click_reason_for_adjsut.click();
    	 
    	
    	 Thread.sleep(2000);
    	 
    	 
    	 System.out.println("Clicked on Reason for adjust tab");
    	 log.info("Clicked on Reason for adjust tab");
    	 
     }
     
     public void click_reason_for_adjust_add_and_save() throws InterruptedException
     {
     
    	 click_reason_for_adjsut_add.click();
    	 Thread.sleep(2000);
    	 
    	 click_reason_for_adjsut_textbox.clear();
    	 click_reason_for_adjsut_textbox.click();
    	 click_reason_for_adjsut_textbox.sendKeys("PItest");
    	 click_reason_for_adjsut_description.clear();
    	 click_reason_for_adjsut_description.click();
    	 click_reason_for_adjsut_description.sendKeys("Pi description");
    	 Thread.sleep(3000);
    	 click_reason_for_adjsut_save.click();
    	 Thread.sleep(3000);
    	 
    	 System.out.println("New reason for adjust created successfully");
    	 log.info("New reason for adjust created successfully");
    	 
     }
     
     public void click_reason_for_adjust_edit_delete() throws InterruptedException
     {
    	 
    	 Thread.sleep(3000);
    	 click_reason_for_adjsut_filter.clear();
    	 click_reason_for_adjsut_filter.click();
    	 
    	 click_reason_for_adjsut_filter.sendKeys("PItest");
    	 Thread.sleep(3000);
    	 click_reason_for_adjsut_filter2.click();
    	 Thread.sleep(3000);
    	 click_filter1.click();
    	 Thread.sleep(6000);
    	 click_reason_for_adjsut_edit.click();
    	 Thread.sleep(3000);
    	 click_reason_for_adjsut_textbox.clear();
    	 click_reason_for_adjsut_textbox.click();
    	 click_reason_for_adjsut_textbox.sendKeys("PItest_edit");
    	 click_reason_for_adjsut_description.clear();
    	 click_reason_for_adjsut_description.click();
    	 click_reason_for_adjsut_description.sendKeys("Pi description_edit");
    	 click_reason_for_adjsut_save.click();
    	 Thread.sleep(3000);
    	 click_reason_for_adjsut_filter.clear();
    	 click_reason_for_adjsut_filter.click();
    	 
    	 click_reason_for_adjsut_filter.sendKeys("PItest_edit");
    	
    	 click_reason_for_adjsut_filter2.click();
    	 Thread.sleep(2000);
    	 click_filter1.click();
    	 Thread.sleep(6000);
    	 click_reason_for_adjsut_delete.click();
    	 Thread.sleep(3000);
    	 click_reason_for_adjsut_delete_ok.click();
    	 System.out.println("Reason for adjust edited and deleted successfully");
    	 log.info("Reason for adjust edited and deleted successfully");
    	 
     }
    
     
     public void click_ship_mode() throws InterruptedException
     {
    	 for (String handle : driver.getWindowHandles()) {
     		  try {
     		    driver.switchTo().window(handle);
     		  } catch (NoSuchWindowException e) {
     			  
     		    
     		  }
     		}
      
   	
   	 Thread.sleep(2000);
   	click_ship_modes.click();
   	 
   	
   	 Thread.sleep(2000);
   	 
   	 
   	 System.out.println("Clicked on ship mode tab");
   	 log.info("Clicked on ship mode tab");
   	
     }
     
     public void click_ship_mode_add_save() throws InterruptedException
     {
    	 
    	 int i= 5;
    	 click_ship_modes_add.click();
    	 Thread.sleep(2000);
    	 
    	 click_ship_modes_name.clear();
    	 click_ship_modes_name.click();
    	 click_ship_modes_name.sendKeys("PI_UPS");
    	 click_ship_modes_method.clear();
    	 click_ship_modes_method.click();
    	 click_ship_modes_method.sendKeys("PI_UPS");
    	 
    	 click_ship_modes_priority.clear();
    	 click_ship_modes_priority.sendKeys(String.valueOf(i));
    	 Thread.sleep(2000);
    	 click_ship_modes_auto_release.click();
    	 Thread.sleep(3000);
    	 click_ship_modes_save.click();
    	 Thread.sleep(3000);
    	 
    	 System.out.println("New new ship mode  created successfully");
    	 log.info("New ship mode  created successfully");
     }
     
     public void click_ship_mode_edit_delete() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 click_ship_modes_filter.clear();
    	 click_ship_modes_filter.click();
    	 
    	 click_ship_modes_filter.sendKeys("PI_UPS");
    	 Thread.sleep(3000);
    	 click_ship_modes_filter2.click();
    	 Thread.sleep(3000);
    	 click_filter1.click();
    	 Thread.sleep(6000);
    	 click_ship_modes_edit.click();
    	 Thread.sleep(3000);
    	 click_ship_modes_name.clear();
    	 click_ship_modes_name.click();
    	 click_ship_modes_name.sendKeys("PI_UPS_edit");
    	 click_ship_modes_method.clear();
    	 click_ship_modes_method.click();
    	 click_ship_modes_method.sendKeys("PI_UPS_edit");
    	 
    	 Thread.sleep(3000);
    	 click_ship_modes_save.click();
    	 Thread.sleep(3000);
    	 click_ship_modes_filter.clear();
    	 click_ship_modes_filter.click();
    	 
    	 click_ship_modes_filter.sendKeys("PI_UPS_edit");
    	
    	 click_ship_modes_filter2.click();
    	 Thread.sleep(3000);
    	 click_filter1.click();
    	 Thread.sleep(6000);
    	 click_ship_modes_delete.click();
    	 Thread.sleep(3000);
    	 click_ship_modes_delete_ok.click();
    	 System.out.println("Ship mode edited and deleted successfully");
    	 log.info("ship mode edited and deleted successfully");
     }
     
     
     
   
}
