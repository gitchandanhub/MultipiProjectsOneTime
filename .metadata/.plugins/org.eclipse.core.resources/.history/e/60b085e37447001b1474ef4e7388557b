package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class SOdetails1 extends AppDriver
{
	int i;
	
	Actions actions = new Actions(driver);
	public SOdetails1()
	{
		PageFactory.initElements(driver, this);
	}
        @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00__0']")  WebElement  SOrowone;
        @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00__1']")  WebElement SOrowtwo;
        @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadTabStrip']/div/ul/li[2]/a/span/span/span") WebElement DetailSOtab;
        @FindBy(xpath = "//*[@id='SoDetailGrid_ctl00_ctl02_ctl00_cmbItem_Arrow']")  WebElement itemarrow;
      //  @FindBy(xpath = "//*[@id='SoDetailGrid_ctl00_ctl02_ctl00_cmbItem_DropDown']/div[2]/ul/li["+i+"]")  WebElement itemnumtwo;
        @FindBy(xpath = "//*[@id='SoDetailGrid_ctl00_ctl02_ctl00_cmbItem_DropDown']/div[2]/ul/li[2]")  WebElement itemnumtwo;
        @FindBy(xpath = "//*[@id='SoDetailGrid_ctl00_ctl02_ctl00_cmbItem_DropDown']/div[2]/ul/li[4]")  WebElement itemnumfour;
        @FindBy(xpath = "//*[@id='SoDetailGrid_ctl00_ctl02_ctl00_txtOrderQty']")  WebElement itmqtybox;
        @FindBy(xpath = "//*[@id='SoDetailGrid_ctl00_ctl02_ctl00_btnQuickAdd_input']")  WebElement quickadd;
        
        @FindBy(xpath = "//*[@id='ctl00_MenuTab']/div[1]/ul/li[4]/a/span/span/span")   WebElement click_pick_pack_ship ;
        @FindBy(xpath = "//*[@id='ctl00_MenuTab']/div[2]/ul[4]/li[1]/a/span/span/span")   WebElement click_SO ;
        
        @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_txtScanOrder\"]")   WebElement click_search_SO ;

        @FindBy(xpath = "//*[@id='btnSave_input']")   WebElement click_SO_save ;

        @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_btnAdd']/span")   WebElement click_add_SO ;

        @FindBy(xpath = "//tr[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00__0']//td[5]")   WebElement click_SO_row1 ;
        
        @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl04_gbcDelete\"]")   WebElement click_SO_delete ;
        @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]")   WebElement click_SO_delete_ok;
        
        @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]")   WebElement click_SO_delete_ok_1;
      
        @FindBy(xpath = "//span[contains(text(),'Ship Info')]")   WebElement click_SO_edit_shipinfo ;
        @FindBy(xpath = "//input[@name='txtCustPo']")   WebElement click_SO_edit_shipinfo_custpo ;
        @FindBy(xpath = "//input[@name='txtCaseSalesPrice']")   WebElement click_SO_edit_shipinfo_salesprice ;
      
        @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00__0\"]/td[4]")   WebElement click_SO_edit ;
        @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_TopPager\"]/thead/tr/td/div[2]")   WebElement click_search ;
        
        
        @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_btnQuickPick_input\"]") WebElement click_quick_pick;
        @FindBy(xpath = "//input[@name='btnAllocate']") WebElement click_pick;
        @FindBy(xpath = "//span[contains(text(),'SO Detail')]") WebElement click_SO_Details;
        @FindBy(xpath = "//*[@id=\"btnRelease_input\"]") WebElement click_release;
        @FindBy(xpath = "//span[@id='SoDetailGrid_ctl00_ctl02_ctl00_btnPick']") WebElement click_manually_pick;
        
        @FindBy(xpath = "//input[@id='ManualAllocationGrid_ctl00_ctl04_txtAllocateQty']") WebElement click_manually_pick_quantity;
      
      
        @FindBy(xpath = "//tr[@id='SoDetailGrid_ctl00__0']//td[1]") WebElement click_manually1;
        
        @FindBy(xpath = "//html//body//form//div//table//tbody//tr//td//div//div//div//a//span//span[contains(text(),'Yes')]") WebElement click_manuallypick;
      
        @FindBy(xpath = "//input[@name='btnClose']") WebElement click_manually_close;
      
        @FindBy(id = "//input[@name='ctl00$ContentPlaceHolder1$ShipOrderGrid$ctl00$ctl02$ctl03$Filter_SONo']")   WebElement click_filter ;
        @FindBy(css = ".rmItem:nth-child(1) .rmText")  WebElement click_filter1 ;
        
        @FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ShipOrderGrid$ctl00$ctl02$ctl03$FilterTextBox_SONo']")  WebElement click_filter_text ;
        @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl03_Filter_SONo']")   WebElement select_item1 ;
      
        @FindBy(css = ".rmItem:nth-child(1) .rmText")   WebElement select_item2;
    	
        
        @FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_btnQuickPick_input']")  WebElement click_quick_pick1 ;
        
        @FindBy(xpath = "//div[@id='AutoAllocationGrid_GridData']//td[3]") WebElement click_quick_click_row;
      
        @FindBy(xpath = "//input[@id='btnAllocate_input']") WebElement click_quick_click_pick;
      
        @FindBy(xpath = "//div[@id='ManualAllocationGrid_GridData']//td[10]") WebElement click_manually_pick_1;
      
        @FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_GridData']") WebElement click_grid;
      
        @FindBy(xpath = "//span[contains(text(),'SO Master')]") WebElement click_SO_master;
      
        @FindBy(xpath = "//body/form[@id='AutoAllocation']/div[@id='divTabStrip']/table[@id='filterTable']/tbody/tr/td/div/div/div[2]") WebElement click_quick_pick_2;
      
        
        @FindBy(xpath = " //td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement click_qucik_pick_ok;
     
        @FindBy(xpath = "//*[@id=\"btnClose_input\"]") WebElement click_quick_close;
        
        @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_btnUnPick_input\"]") WebElement click_unpick;
      
        @FindBy(xpath = "//input[@name='gridUnPick$ctl00$ctl06$Detail10$ctl04$txtUnPickQty']") WebElement click_unpick_quanity;
        
        @FindBy(xpath = "//body//tbody//tbody//td[3]") WebElement click_unpick_row;
      
        @FindBy(xpath = "//input[@id='btnUnPick_input']") WebElement click_unpick1;
       
        @FindBy(xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement click_unpick_ok;
      
        
        public void addSO() throws InterruptedException
        {
        	
        	Thread.sleep(3000);
        	
        	click_pick_pack_ship.click();
        	Thread.sleep(2000);
        	click_SO.click();
        	Thread.sleep(2000);
        	click_add_SO.click();
        	Thread.sleep(2000);
        	driver.switchTo().frame("winQuickPick");
        	Thread.sleep(2000);
        	click_SO_save.click();
        	Thread.sleep(5000);
        	
        	for (String handle : driver.getWindowHandles()) {
        		  try {
        		    driver.switchTo().window(handle);
        		  } catch (NoSuchWindowException e) {
        			  
        		    
        		  }
        		}
        	String SO = click_SO_row1.getText();
        	
        	click_SO_row1.click();
        	Thread.sleep(2000);
        	click_search_SO.click();
        	click_search_SO.clear();
        	Thread.sleep(2000);
        	
        	click_search_SO.sendKeys(SO);
        	Thread.sleep(2000);
        	click_search_SO.sendKeys(Keys.ENTER);
        	Thread.sleep(3000);
        	System.out.println("New SO created succesfully ");
        	System.out.println("New SO searched  succesfully ");
        	
        	log.info("New SO created succesfully");
        	log.info("New SO searched succesfully");
        	
        	
       
        	
        	
        	
        	
        	
        }
        
        public void edit_delete_SO() throws InterruptedException
        {
        
        	int i=100;
        	
        	
        	click_pick_pack_ship.click();
        	Thread.sleep(2000);
        	click_SO.click();
        	Thread.sleep(2000);
        	click_add_SO.click();
        	Thread.sleep(2000);
        	driver.switchTo().frame("winQuickPick");
        	Thread.sleep(2000);
        	click_SO_save.click();
        	Thread.sleep(5000);
        	
        	
        	Thread.sleep(5000);
        	click_SO_row1.click();
        	
        	
        	
        	
        	Thread.sleep(3000);
        	actions.doubleClick(click_SO_edit).perform();
        	//click_SO_edit.click();
        	Thread.sleep(3000);
        	driver.switchTo().frame("winQuickPick");
        	click_SO_edit_shipinfo.click();
        	Thread.sleep(2000);
        	click_SO_edit_shipinfo_custpo.clear();
        	Thread.sleep(2000);
        	click_SO_edit_shipinfo_custpo.click();
        	Thread.sleep(2000);
        	click_SO_edit_shipinfo_custpo.sendKeys("Test");
        	Thread.sleep(2000);
        	click_SO_edit_shipinfo_salesprice.clear();
        	Thread.sleep(2000);
        	click_SO_edit_shipinfo_salesprice.click();
        	Thread.sleep(2000);
        	click_SO_edit_shipinfo_salesprice.sendKeys(String.valueOf(i));
        	Thread.sleep(2000);
        	click_SO_save.click();
        	Thread.sleep(2000);
        	click_SO_delete.click();
        	Thread.sleep(2000);
        	click_SO_delete_ok.click();
        	Thread.sleep(2000);
        	click_SO_delete_ok_1.click();
        	System.out.println("New SO added succesfully ");
        	System.out.println("New SO edited succesfully ");
        	System.out.println("New SO deleted  succesfully ");
        	
        	log.info("New SO added succesfully");
        	log.info("New SO edited succesfully");
        	log.info("New SO deleted succesfully");
        }
        
        
        public void SelectSORow() throws InterruptedException
        {
        	
        	
        	SOrowone.click();
        	Thread.sleep(2000);
        	System.out.println("SO row has been selected");
        	log.info("SO row has been selected");
        }
        public void ClickDetailSO() throws InterruptedException
        {
        	DetailSOtab.click();
        	System.out.println("Detail SO has been clicked");
        	log.info("Detail SO has been clicked");
        	Thread.sleep(2000);
        }
        public void SelectItem() throws InterruptedException
        {
        	Thread.sleep(2000);
        	List<WebElement> alist = driver.findElements(By.tagName("iframe"));
     	   driver.switchTo().frame(alist.get(0));
     	   Thread.sleep(2000);
     	  itemarrow.click();
     	 Thread.sleep(3000);
     	itemnumtwo.click();
     	System.out.println("Item has been Selected");
    	log.info("Item has been Selected");
        }
        public void EnterItemQuantity() throws InterruptedException
        {
        	
        	int x= 5;
        	itmqtybox.sendKeys(String.valueOf(x));
        	System.out.println("Item Quantity has been Entered");
        	log.info("Item Quantity has been Entered");
        	 Thread.sleep(2000);
        }
        public void ClickQuickadd() throws InterruptedException
        {
        	
        	
        	quickadd.click();
        	
        	 Thread.sleep(2000);
        	 driver.switchTo().frame("winPopup");
        	 Thread.sleep(6000);
        	 click_release.click();
        	 
        	 
        	 System.out.println("item has been released successfully");
         	log.info("item has been released successfully");
        	
        }
         	
        public void manuallypick() throws InterruptedException
        {	
        	int x= 3;
        	
        	Thread.sleep(3000);
        	
        	click_SO.click();
        	
        	
        	Thread.sleep(5000);
        	
        	for (String handle : driver.getWindowHandles()) {
        		  try {
        		    driver.switchTo().window(handle);
        		  } catch (NoSuchWindowException e) {
        			  
        		    
        		  }
        		}
        	String SO = click_SO_row1.getText();
        	
        	click_SO_row1.click();
        	Thread.sleep(2000);
        	click_search_SO.click();
        	click_search_SO.clear();
        	Thread.sleep(2000);
        	
        	click_search_SO.sendKeys(SO);
        	Thread.sleep(2000);
        	click_search_SO.sendKeys(Keys.ENTER);
        	Thread.sleep(2000);
        	DetailSOtab.click();
        	
        	
        	
         	         	Thread.sleep(2000);
         	         	driver.switchTo().frame(0);
         	         	Thread.sleep(2000);
         	         	click_manually1.click();
         	         	Thread.sleep(2000);
         	click_manually_pick.click();
         	Thread.sleep(2000);
         	
         	driver.switchTo().frame("winPopupRelease");
         	
         	click_manually_pick_1.click();
         	click_manually_pick_quantity.clear();
         	Thread.sleep(2000);
         	click_manually_pick_quantity.click();
         	Thread.sleep(2000);
         	click_manually_pick_quantity.sendKeys(String.valueOf(x));
         	Thread.sleep(2000);
         	click_pick.click();
         	Thread.sleep(2000);
         	//click_manuallypick.click();
         	Thread.sleep(2000);
         	driver.switchTo().defaultContent();
         	click_SO.click();
         	Thread.sleep(2000);
         	
         	click_grid.click();
         	Thread.sleep(2000);
         	select_item1.click();
         	Thread.sleep(2000);
         	select_item2.click();
         	
         	System.out.println("item has been manually picked  successfully");
         	log.info("item has been manually picked  successfully");
         	
         	
        
        }
        
        public void unpick() throws InterruptedException
        {	
        
        	
     	click_SO_row1.click();
    	Thread.sleep(2000);
    	
    	
    	click_unpick.click();
    	System.out.println("clicked on  un-pick");
     	log.info("clicked on un- pick");
     	driver.switchTo().frame("winQuickPick");
     	
     	Thread.sleep(2000);
     	click_unpick_row.click();
     	Thread.sleep(2000);
     	
     	click_unpick1.click();
     	System.out.println("Item successfully un-picked");
     	log.info("Item successfully un-picked");
     	
     	click_unpick_ok.click();
     	
     	click_quick_close.click();
     	
        }
        public void quickpick() throws InterruptedException
        {	
        	int i=1;
        	Thread.sleep(2000);
        	
        	click_SO_master.click();
         	Thread.sleep(2000);
        	click_SO_row1.click();
        	Thread.sleep(2000);
        	click_quick_pick1.click();
        	System.out.println("clicked on quick pick");
         	log.info("clicked on quick pick");
        	driver.switchTo().frame("winQuickPick");
        	
        	click_quick_click_row.click();
        	Thread.sleep(2000);
        	click_quick_pick_2.click();
        	Thread.sleep(2000);
        	click_quick_click_pick.click();
        	Thread.sleep(2000);
        	click_qucik_pick_ok.click();
        	
        	click_quick_close.click();
        	System.out.println("Item has been picked successfully via quick pick button");
         	log.info("Item has been picked successfully via quick pick button");
        	
        }
        
        
        
        
}
