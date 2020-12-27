package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Base.AppDriver;

public class Inventory extends AppDriver


{

	
int no;
	Actions actions = new Actions(driver);
	Actions builder = new Actions(driver);
	
	public Inventory()
     {
    	 PageFactory.initElements(driver, this);
     }
	
	
	@FindBy(xpath = "//li[@class='rtsLI']//a[@class='rtsLink underfirstline']//span[@class='rtsTxt'][contains(text(),'Inventory')]")   WebElement inventory ;
	@FindBy(xpath = "//*[@id='ctl00_MenuTab']/div[1]/ul/li[3]/a/span/span/span")  WebElement inventory2;
	@FindBy(xpath = "//*[@id=\"ctl00_MenuTab\"]/div[2]/ul[3]/li[1]/a/span/span/span")   WebElement master_inventory_profile;
	
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_ItemGrid_ctl00_ctl02_ctl00_btnAdd")   WebElement master_inventory_add_item;
	@FindBy(xpath = "//input[@name='txtItemNumber']")   WebElement master_inventory_add_item_number;
	@FindBy(xpath = "//textarea[@name='txtDescription']")   WebElement master_inventory_add_item_description;
	@FindBy(xpath = "//input[@name='cmbCustOwner']")   WebElement master_inventory_add_item_customer_owner;
	@FindBy(xpath = "//input[@name='cmbCountryofOrigin']")   WebElement master_inventory_add_item_number_country_of_origin;
	
	@FindBy(xpath = "//input[@id='cmbCountryofOrigin_ClientState']")   WebElement test1;
	
	@FindBy(xpath = "//input[@name='btnSave']")   WebElement master_inventory_add_item_save ;
	
	@FindBy(xpath = "//div[14]//div[1]//table[1]//tbody[1]//tr[1]//td[2]//a[1]")   WebElement select_country ;
	@FindBy(xpath = "//td[contains(text(),'Australia')]")   WebElement select_country2 ;
	
	
	@FindBy(xpath = "//body//div[@class='rmpView']//fieldset[@class='TabbedFieldset']//fieldset[@class='TabbedFieldset']//div[1]//span[1]//span[1]") WebElement master_inventory_add_item_source;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_ItemGrid_ctl00_ctl02_ctl03_FilterTextBox_ItemNo")   WebElement click_filter ;
	@FindBy(css = ".rmItem:nth-child(6) .rmText")  WebElement click_filter1 ;
	@FindBy(xpath = "//div[@class='rgDataDiv']//td[3]")   WebElement select_item1 ;
	
	
	
	
	@FindBy(xpath = "//body/form/div[@class='master']/div/table[@class='RadSplitter RadSplitter_Hay']/tbody/tr/td[@class='rspPaneHorizontal']/div/div[@class='masterContent']/div/table[@class='RadSplitter RadSplitter_Hay rspNested']/tbody/tr/td[@class='rspPane rspFirstItem rspLastItem']/div/div/div[@class='RadAjaxPanel']/div[@class='RadAjaxPanel']/div/div/div[@class='RadMultiPage RadMultiPage_Hay multiPage']/div[@class='rmpView pageAutoHeight']/div[@class='RadGrid RadGrid_Hay minHeight']/table[@class='rgMasterTable rgClipCells']/thead/tr[@class='rgCommandRow']/td[@class='rgCommandCell']/div/div/div[1]/span[2]")   WebElement click_delete_button ;
	@FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]")   WebElement click_delete_ok ;
	
	@FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement click_delete_ok_2;
	
	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ItemGrid$ctl00$ctl02$ctl03$Filter_ItemNo']")  WebElement click_filter2 ;
	
	@FindBy(xpath = "//*[@id=\"rdbManufactured\"]/span[2]") WebElement Click_item_source;
	
	
	
	
	/*Location & quantities tab*/
	
	@FindBy(css = "#ctl00_MenuTab > div.rtsLevel.rtsLevel2 > ul:nth-child(3) > li:nth-child(2) > a > span > span > span")   WebElement click_location_and_quantities ;
	
	@FindBy(xpath = "//td[@class='rgCommandCell']")   WebElement click_location_panel ;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ItemLocation_ctl00_ctl02_ctl00_btnAdd")   WebElement click_add_button ;
	@FindBy(css = "#cmbItemNo_Input")   WebElement click_item_number ;
	
	@FindBy(xpath = "//input[@name='cmbLocationBin']")   WebElement click_location ;
	
	@FindBy(xpath = "//li[contains(text(),'Northwoods')]")   WebElement click_wharehouse2 ;
	
	@FindBy(id = "cmbWareHouse_Arrow")   WebElement click_warehouse ;
	@FindBy(xpath = "//input[@name='cmbWareHouse']")   WebElement select_warehouse ;
	@FindBy(xpath = "//li[contains(text(),'Shipping')]']")   WebElement select_location ;
	@FindBy(xpath = "//input[@name='txtQuantity']")   WebElement click_quantity ;
	@FindBy(xpath = "//div[contains(@class,'rcbScroll rcbWidth')]//td[1]")   WebElement select_item ;
	
	@FindBy(xpath = "//body/form/div/span[1]/input[1]")   WebElement click_save ;
	
	@FindBy(xpath = "//textarea[@name='txtReasonComment']")   WebElement click_comment ;
	@FindBy(xpath = "//li[contains(text(),'Shipping')]")   WebElement select_location1;
	@FindBy(id = "cmbLocationBin_Arrow")   WebElement click_loc1 ;
	@FindBy(id = "cmbReason_Arrow")   WebElement click_reason ;
	@FindBy(xpath = "//li[contains(text(),'Add')]")   WebElement click_reason1 ;
	
	@FindBy(xpath = "//*[@id=\"txtRopMin\"]")   WebElement recorder_minimum;
	
	@FindBy(id = "//td[@class='rgCommandCell']")   WebElement shift ;
	
	@FindBy(id = "//span[contains(text(),'Item Status')]")   WebElement item_tab ;
	
	
	
	public void Click_inventory_tab() throws InterruptedException
    {
   	 
		Thread.sleep(2000);
	   // driver.navigate().back();
	    Thread.sleep(2000);
	   // driver.navigate().back();
	    Thread.sleep(2000);
	    try
	    {
		inventory.click();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	inventory2.click();
	    }
		
		Thread.sleep(5000);
   	 
   	 System.out.println("Clicked on inventory");
   	 log.info("Clicked on inventory");
    }
	
	
	public void Click_master_inventory_add() throws InterruptedException
    {
		
		
		for (String handle : driver.getWindowHandles()) {
	  		  try {
	  		    driver.switchTo().window(handle);
	  		  } catch (NoSuchWindowException e) {
	  			  
	  		    
	  		  }
	  		}
		
		Thread.sleep(3000);
		master_inventory_profile.click();
		
		Thread.sleep(5000);
		master_inventory_add_item.click();
		
		driver.switchTo().frame("winPopup");
		Thread.sleep(2000);
		master_inventory_add_item_number.clear();
		Thread.sleep(2000);
			
		
		
		master_inventory_add_item_number.sendKeys("Mobile_item_2");
		
		Thread.sleep(2000);
				master_inventory_add_item_source.click();
				Thread.sleep(3000);
				master_inventory_add_item_description.clear();
				master_inventory_add_item_description.sendKeys("Lenovo_Laptop_test ");
				Thread.sleep(3000);
				master_inventory_add_item_customer_owner.click();
				master_inventory_add_item_customer_owner.sendKeys("MISHEH MILON");
				Thread.sleep(3000);
			
				select_country.click();
				Thread.sleep(3000);
				
				
				
				master_inventory_add_item_number_country_of_origin.sendKeys("A");
			
				
				Thread.sleep(3000);
				master_inventory_add_item_source.click();
				Thread.sleep(3000);
				master_inventory_add_item_save.click();
								Thread.sleep(6000);
				
				System.out.println("Item added successfully in inventory" );
			   	 log.info("Item added successfully in inventory");
		
		
		
		
    }
	
	public void edit_item_details() throws InterruptedException
    {
   	 
		
		
		Thread.sleep(8000);
		
		
	int i=345;
		click_filter.clear();
		
		
		click_filter.sendKeys("Mobile_item");
				Thread.sleep(3000);
		click_filter2.click();
		Thread.sleep(3000);
		click_filter1.click();
		Thread.sleep(6000);
		
		select_item1.click();
		Thread.sleep(3000);
		actions.doubleClick(select_item1).perform();
		Thread.sleep(6000);
		driver.switchTo().frame("winPopup");
		Thread.sleep(3000);
		
		Click_item_source.click();
		recorder_minimum.clear();
		recorder_minimum.sendKeys(String.valueOf(i));
		
		
		Thread.sleep(3000);
		master_inventory_add_item_customer_owner.click();
		Thread.sleep(3000);
		//master_inventory_add_item_customer_owner.sendKeys("Northstar Automation");
		Thread.sleep(3000);
		master_inventory_add_item_save.click();
		
		Thread.sleep(8000);
		
		System.out.println("Item edited successfully from inventory" );
	   	 log.info("Item edited successfully from inventory");
		
    }
	
	public void Click_location_and_quantities() throws InterruptedException
    {
	
		
		int i=5;
	
		Thread.sleep(3000);
		
		click_location_and_quantities.click();
		
		Thread.sleep(2000);
		
		click_location_panel.click();
		Thread.sleep(3000);
		click_add_button.click();
		
		driver.switchTo().frame("winPopup");
		
		
				Thread.sleep(2000);
				
				click_item_number.clear();
				
				
				
					click_item_number.sendKeys("Mobile_item_2");
				
				
		
		Thread.sleep(5000);
		select_item.click();
		Thread.sleep(3000);
		
		
	click_warehouse.click();
	Thread.sleep(3000);
	
	click_wharehouse2.click();
		
		Thread.sleep(3000);
	
		click_loc1.click();
		Thread.sleep(3000);
		select_location1.click();
		Thread.sleep(3000);
		
		

	
		Thread.sleep(3000);
		click_quantity.clear();
		Thread.sleep(3000);
		click_quantity.sendKeys(String.valueOf(i));
		Thread.sleep(3000);
		click_reason.click();
		Thread.sleep(3000);
		click_reason1.click();
		click_comment.sendKeys("Laptop");
		
		Thread.sleep(3000);
		click_save.click();
		
		
		
		
		System.out.println("Location/warehouse for item added successfully" );
	   	 log.info("Location/warehouse for item added successfully");
    }
	
	
	
	public void item_delete1() throws InterruptedException
    {

		
		
		for (String handle : driver.getWindowHandles()) {
	  		  try {
	  		    driver.switchTo().window(handle);
	  		  } catch (NoSuchWindowException e) {
	  			  
	  		    
	  		  }
	  		}
		
		Thread.sleep(3000);
		master_inventory_profile.click();
		
				Thread.sleep(3000);
		click_filter.clear();
		
		
			click_filter.sendKeys("Mobile_item_2");
		
		
		
		Thread.sleep(3000);
		click_filter2.click();
		Thread.sleep(3000);
		click_filter1.click();
		Thread.sleep(6000);
		select_item1.click();
		Thread.sleep(3000);
		click_delete_button.click();
		Thread.sleep(3000);
		click_delete_ok.click();
		Thread.sleep(3000);
		
		try {
		click_delete_ok_2.click();
	
		System.out.println("Item deleted successfully from inventory" );
	   	 log.info("Item deleted successfully from inventory");}
		catch(Exception e) {}
		
    }
	
	
	
	
}
