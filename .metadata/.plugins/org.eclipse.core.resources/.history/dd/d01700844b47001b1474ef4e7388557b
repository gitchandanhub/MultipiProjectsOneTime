package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.AppDriver;

public class Setuptab  extends AppDriver 
{
    
	Actions actions = new Actions(driver);
	Actions builder = new Actions(driver);
	
	public Setuptab()
     {
    	 PageFactory.initElements(driver, this);
     }
	
	//WebElements for Cube Tab
	@FindBy (xpath = "//span[contains(text(),'Setup')]") WebElement setup;
	@FindBy (xpath = "//span[@class='rtsTxt'][contains(text(),'Cube')]") WebElement Cube;
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_CubeGrid_ctl00_ctl02_ctl00_btnAdd_input']") WebElement add_button;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtCubeId']") WebElement Cube_ID;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement Desp;
	@FindBy (xpath = "//span[@class='rbText rbPrimary'][contains(text(),'Location')]") WebElement Cube_type;
	@FindBy (xpath = "//span[contains(text(),'Cube By Volume')]") WebElement Cube_Measure;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtLength']" ) WebElement Length;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtWidth']") WebElement width;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtHeight']") WebElement Height;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtVolume']") WebElement Volume;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtWeight']") WebElement Weight;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$CubeGrid$ctl00$ctl02$ctl00$btnSave']") WebElement Click_Save;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$CubeGrid$ctl00$ctl02$ctl03$FilterTextBox_Description']") WebElement search_desc_textbox;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$CubeGrid$ctl00$ctl02$ctl03$Filter_Description']") WebElement click_filter;
	@FindBy (xpath = "//span[contains(text(),'Contains')]")   WebElement click_filter1;
	@FindBy (xpath = "//span[contains(text(),'NoFilter')]")   WebElement click_filter2;
	@FindBy (xpath = "//div[@class='rgDataDiv']") WebElement Grid_Selector;
	@FindBy (xpath = "//tr[@class='rgRow rgSelectedRow']") WebElement Cube_Row_Selected; 
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$CubeGrid$ctl00$ctl04$columnSelectCheckBox']") WebElement Row_Selected_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$CubeGrid$ctl00$ctl04$EditButton']") WebElement Cube_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$CubeGrid$ctl00$ctl04$gbcDelete']") WebElement Cube_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement Cube_Delete_Confirm;
	
	//WebElements for Zone Tab
	@FindBy (xpath = "//span[@class='rtsTxt'][contains(text(),'Zone')]") WebElement Zone;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ZoneGrid$ctl00$ctl02$ctl00$btnAdd']") WebElement Zone_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtZone']") WebElement Zone_Zone;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement Zone_Desc;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$dpLastCycleCount$dateInput']") WebElement Zone_LastCycle;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtNextCycleCount']") WebElement Zone_NextCycle;
	@FindBy (xpath = "//td[@class='rspPane rspFirstItem rspLastItem']//td[1]//span[1]//span[1]") WebElement Zone_pick;
	@FindBy (xpath = "//span[contains(text(),'Zone Replenish')]") WebElement Zone_Replenish;
	@FindBy (xpath = "//span[contains(text(),'Zone PutAway')]") WebElement Zone_Putaway;
	@FindBy (xpath = "//span[contains(text(),'Zone Cycle')]") WebElement Zone_cycle;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ZoneGrid$ctl00$ctl02$ctl00$btnSave']") WebElement Zone_Save;
	@FindBy (xpath = "//div[@class='rgHeaderDiv']//table[@class='rgMasterTable rgClipCells rgClipCells']") WebElement Zone_Grid;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ZoneGrid$ctl00$ctl02$ctl03$FilterTextBox_Zone1']") WebElement Zone_Filter;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_ZoneGrid_ctl00_ctl02_ctl03_Filter_Zone1\"]") WebElement Zone_Filter_Icon;
	@FindBy (xpath = "//span[contains(text(),'Contains')]") WebElement Zone_Filter_Contains;
	@FindBy (xpath = "//span[contains(text(),'NoFilter')]") WebElement Zone_Filter_NoFilter;
	@FindBy (xpath = "//div[@class='rgDataDiv']") WebElement Zone_Grid1;
	@FindBy (xpath = "//tr[@class='rgRow']") WebElement Zone_Row;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ZoneGrid$ctl00$ctl04$EditButton']") WebElement Zone_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ZoneGrid$ctl00$ctl04$gbcDelete']") WebElement Zone_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement Zone_Delete_Ok;
	
	//WebElements for UOM Tab
	@FindBy (xpath = "//span[contains(text(),'UOM Type')]") WebElement UOM_Tab;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$UnitQtyGrid$ctl00$ctl02$ctl00$btnAdd']") WebElement UOM_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtTypeID']") WebElement UOM_Type;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement UOM_Desc;
	@FindBy (xpath = "//span[@class='rbPrimaryIcon rbToggleCheckbox']") WebElement Default_UOM;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$UnitQtyGrid$ctl00$ctl02$ctl00$btnSave']") WebElement UOM_Save;
	@FindBy (xpath = "//tr[@class='rgFilterRow']") WebElement UOM_Filter_Grid;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$UnitQtyGrid$ctl00$ctl02$ctl03$FilterTextBox_Type']") WebElement UOM_Filter_Type;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$UnitQtyGrid$ctl00$ctl02$ctl03$Filter_Type']") WebElement UOM_Filter;
	@FindBy (xpath = "//div[@class='RadMenu RadMenu_Hay RadMenu_Context RadMenu_Hay_Context']//li[6]//a[1]//span[1]") WebElement UOM_Filter_Equal;
	@FindBy (xpath = "//div[@class='rgDataDiv']") WebElement UOM_Added_Grid;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$UnitQtyGrid$ctl00$ctl04$EditButton']") WebElement UOM_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$UnitQtyGrid$ctl00$ctl04$btnDelete']") WebElement UOM_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement UOM_Delete_Ok;
	
	//WebElements for User Defined Status Tab
	@FindBy (xpath= "//span[contains(text(),'User Defined Status')]") WebElement User_defined_Status_Tab;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$StatusGrid$ctl00$ctl02$ctl00$btnAdd']") WebElement Status_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$cmbReference']") WebElement Status_Ref;
	@FindBy (xpath = "//li[contains(text(),'Ship Order')]") WebElement Status_selection;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtStatus']") WebElement Status_Status;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement Status_Desc;
	@FindBy (xpath = "//span[@class='rbPrimaryIcon rbToggleCheckboxChecked']") WebElement Status_Active;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$StatusGrid$ctl00$ctl02$ctl00$btnSave']") WebElement Status_Save;
	@FindBy (xpath = "//tr[@class='rgFilterRow']") WebElement Status_Grid;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$StatusGrid$ctl00$ctl02$ctl03$FilterTextBox_Status']") WebElement Status_Filter_Box;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$StatusGrid$ctl00$ctl02$ctl03$Filter_Status']") WebElement Status_Filter;
	@FindBy (xpath = "//span[@class='rmText'][contains(text(),'EqualTo')]") WebElement Status_Filter_Equal;
	@FindBy (xpath = "//tr[@class='rgRow']") WebElement Filtered_Grid;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$StatusGrid$ctl00$ctl04$EditButton']") WebElement Status_Edit;
	
	//WebElements for Project Master Tab
	@FindBy (xpath = "//span[contains(text(),'Project Master')]") WebElement ProjectMaster_Tab;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ProjectMasterGrid$ctl00$ctl02$ctl00$btnAdd']") WebElement PM_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtProjectNo']") WebElement PM_ProjectNo;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement PM_Desc;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$dpProjectStartDate$dateInput']") WebElement PM_StartDate;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$cmbProjectStatus']") WebElement PM_Status;
	@FindBy (xpath = "//li[contains(text(),'Open')]") WebElement PM_Status_selection;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ProjectMasterGrid$ctl00$ctl02$ctl00$btnSave']") WebElement PM_Save;
	@FindBy (xpath = "//tr[@class='rgFilterRow']") WebElement PM_Grid;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ProjectMasterGrid$ctl00$ctl02$ctl03$FilterTextBox_ProjectNo']") WebElement PM_ProjectNo_FilterBox;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ProjectMasterGrid$ctl00$ctl02$ctl03$Filter_ProjectNo']") WebElement PM_ProjectNo_Filter;
	@FindBy (xpath = "//div[@class='RadMenu RadMenu_Hay RadMenu_Context RadMenu_Hay_Context']//li[6]//a[1]//span[1]") WebElement PM_ProjectNo_Equal;
	@FindBy (xpath = "//span[contains(text(),'NoFilter')]") WebElement PM_NoFilter;
	@FindBy (xpath = "//div[@class='rgDataDiv']//tbody//tr[1]") WebElement PM_Row_Selected;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ProjectMasterGrid$ctl00$ctl04$EditButton']") WebElement PM_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$ProjectMasterGrid$ctl00$ctl04$gbcDelete']") WebElement PM_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'OK')]") WebElement PM_Delete_OK;
	
	
	public void Click_setup() throws InterruptedException
     {
    	 setup.click();
    	 Thread.sleep(2000);
    	 System.out.println("Clicked on setup");
    	 log.info("Clicked on setup");
     }
    
    public void Click_cube() throws InterruptedException
    {
    	Thread.sleep(1000);
    	Cube.click();
    	Thread.sleep(2000);
    	System.out.println("Clicked on Cube");
    	log.info("Clicked on Cube");
    }
    
   public void click_Cube_add() throws InterruptedException
    {
    	add_button.click();
    	Thread.sleep(2000);
    	System.out.println("Click on Add button to add Cube");
    	log.info("Click on Add button to add Cube");
    }
    public void click_Cube_save() throws InterruptedException
    {
    	int L= 20;
    	int w= 20;
    	int h= 15;
   // 	int v=10;
    	int we=20;
    	Thread.sleep(1000); 
    	Cube_ID.clear();
    	Cube_ID.click();
    	Cube_ID.sendKeys("Cube-01");
    	Desp.clear();
    	Desp.click();
    	Desp.sendKeys("Auto Description1");
    	Length.clear();
    	Length.sendKeys(String.valueOf(L));
    	width.clear();
    	width.sendKeys(String.valueOf(w));
    	Height.clear();
    	Height.sendKeys(String.valueOf(h));
    	Weight.clear();
    	Weight.sendKeys(String.valueOf(we));
    	Thread.sleep(2000);    	
    	Click_Save.click();
    	Thread.sleep(1000);
    	System.out.println("New Cube saved successfully");
   	    log.info("New Cube saved successfully");
    }
    	public void Cube_search_desc_textbox() throws InterruptedException
    	{
    		Thread.sleep(1000);
    		search_desc_textbox.clear();
    		search_desc_textbox.click();
    		Thread.sleep(2000);
    		search_desc_textbox.sendKeys("Description");
    		Thread.sleep(2000);
    		click_filter.click();
    		Thread.sleep(2000);
    		click_filter1.click();
    		System.out.println("Cube searched successfully");
       	    log.info("Cube searched successfully");
   
    	}
    	
    	public void Edit_Cube() throws InterruptedException
    	{
    		Thread.sleep(2000);
    		Grid_Selector.click();
    		Thread.sleep(1000);
    		Row_Selected_Edit.click();
    		Thread.sleep(1000);
    		Cube_Edit.click();
    		Thread.sleep(2000);
    		Desp.click();
    		Desp.clear();
    		Desp.sendKeys("Description Edit");
    		Thread.sleep(1000);
    		Click_Save.click();
    		System.out.println("Cube Description Edited successfully");
       	    log.info("Cube Description Edited successfully");
    		
    	}
    	public void Delete_Cube() throws InterruptedException
    	{
    		Thread.sleep(1000);
    		Grid_Selector.click();
    		Thread.sleep(1000);
    		Cube_Delete.click();
    		Thread.sleep(1000);
    		Cube_Delete_Confirm.click();
    		System.out.println("Cube deleted succcessfully");
      	    log.info("Cube deleted successfully");
      	    Thread.sleep(2000);
      	    click_filter.click();
      	    Thread.sleep(2000);
      	    click_filter2.click();
      	   Thread.sleep(1000);
    		
    	}
    	
    	 public void Click_Zone() throws InterruptedException
    	    {
    		 	Thread.sleep(1000);	
    		 	Zone.click();
    	    	Thread.sleep(500);
    	    	System.out.println("Clicked on Zone");
    	    	log.info("Clicked on Zone");
    	    }
    	
    	 public void Zone_Add_Button() throws InterruptedException
    	 {
    		Zone_Add.click();
    		Thread.sleep(1000);
 	    	System.out.println("Clicked on Add button to add Zone");
 	    	log.info("Clicked on Add button to add Zone");
    	 }
    	 
    	 public void Zone_Save() throws InterruptedException
    	 {
    		 int NextCycle=10;
    		 Thread.sleep(1000);
    		 Zone_Zone.click();
    		 Zone_Zone.clear();
    		 Zone_Zone.sendKeys("TestZone-1");
    		 Zone_Desc.click();
    		 Zone_Desc.sendKeys("Zone Description-1");
    		 Thread.sleep(1000);
    		 Zone_NextCycle.click();
    		 Zone_NextCycle.sendKeys(String.valueOf(NextCycle));
    		 Zone_pick.click();
    		 Zone_cycle.click();
    		 Zone_Save.click();
    		 Thread.sleep(1000);
    		 System.out.println("Zone added successfully");
  	    	 log.info("Zone added successfully");
    	 }
    	 public void Zone_Filter() throws InterruptedException
    	 {
    		 Zone_Grid.click();
    		 Thread.sleep(1000);
    		 Zone_Filter.click();
    		 Zone_Filter.clear();
    		 Thread.sleep(1000);
    		 Zone_Filter.sendKeys("TestZone-1");
    		 Thread.sleep(1000);
    		 Zone_Filter_Icon.click();
    		 Thread.sleep(1000);
    		 Zone_Filter_Contains.click();
    		 Thread.sleep(1000);
    		 System.out.println("Zone searched succcessfully");
       	    log.info("Zone searched successfully");
    	 }
    	 public void Zone_Edit_Delete() throws InterruptedException
    	 {
    		 Zone_Grid1.click();
    		 Thread.sleep(1000);
    		 Zone_Row.click();
    		 Thread.sleep(1000);
    		 Zone_Edit.click();
    		 Thread.sleep(1000);
    		 Zone_Desc.click();
    		 Thread.sleep(1000);
    		 Zone_Desc.clear();
    		 Thread.sleep(1000);
    		 Zone_Desc.sendKeys("Description Edit");
    		 Thread.sleep(1000);
    		 Zone_Save.click();
    		 System.out.println("Zone Description Edited succcessfully");
        	 log.info("Zone Desciption Edited successfully");
        	 Zone_Row.click();
        	 Thread.sleep(1000);
    		 Zone_Delete.click();
    		 Thread.sleep(1000);
    		 Zone_Delete_Ok.click();
    		 Thread.sleep(1000);
    		 System.out.println("Zone Deleted succcessfully");
        	 log.info("Zone Deleted successfully");
    	 }

    	 public void Click_UOMType() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 UOM_Tab.click();
    		 Thread.sleep(1000);
    		 System.out.println("Clicked on UOM Type");
    		 log.info("Clicked on UOM Type");
    	 }
    	 
    	 public void UOM_Add_Save() throws InterruptedException
    	 {
    		 UOM_Add.click();
    		 Thread.sleep(1000);
    		 UOM_Type.click();
    		 Thread.sleep(1000);
    		 UOM_Type.sendKeys ("Test1");
    		 Thread.sleep(1000);
    		 UOM_Desc.click();
       		 UOM_Desc.sendKeys("UOM Description");
    		 Thread.sleep(1000);
      		 UOM_Save.click();
    		 Thread.sleep(1000);
    		 System.out.println("UOM Type Added successfully");
    		 log.info("UOM Type Added successfully");
    	 }
    	 
    	 public void UOM_Filter() throws InterruptedException
    	 {
    		 UOM_Filter_Grid.click();
    		 Thread.sleep(1000);
    		 UOM_Filter_Type.click();
    		 Thread.sleep(1000);
    		 UOM_Filter_Type.sendKeys("Test1");
    		 Thread.sleep(1000);
    		 UOM_Filter.click();
    		 Thread.sleep(1000);
    		 UOM_Filter_Equal.click();
    		 Thread.sleep(1000);
    		 System.out.println("UOM Type filtered successfully");
    		 log.info("UOM Type filtered successfully");
    		 
    	 }
    	 public void UOM_Edit() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 UOM_Added_Grid.click();
    		 Thread.sleep(1000);
    		 UOM_Edit.click();
    		 Thread.sleep(1000);
    		 UOM_Desc.click();
    		 Thread.sleep(1000);
    		 UOM_Desc.clear();
    		 UOM_Desc.sendKeys("Description edit");
    		 UOM_Save.click();
    		 Thread.sleep(1000);
    		 System.out.println("UOM Type edited successfully");
    		 log.info("UOM Type edited successfully");
    	 }
    	 public void UOM_Delete() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 UOM_Added_Grid.click();
    		 Thread.sleep(1000);
    		 UOM_Delete.click();
    		 Thread.sleep(1000);
    		 UOM_Delete_Ok.click();
    		 System.out.println("UOM deleted successfully");
    		 log.info("UOM deleted successfully");
    	 }
    	 
    	 public void Click_User_Defined_Status() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 User_defined_Status_Tab.click();
    		 Thread.sleep(1000);
    		 System.out.println("Clicked on User Defined Status tab");
    		 log.info("Clicked on User Defined Status tab");
    	 }
    	 
    	 public void User_Defined_Status_Add_Save() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 Status_Add.click();
    		 Thread.sleep(1000);
    		 Status_Ref.click();
    		 Thread.sleep(500);
    		 Status_selection.click();
    		 Thread.sleep(500);
    		 Status_Status.click();
    		 Status_Status.clear();
    		 Thread.sleep(500);
    		 Status_Status.sendKeys("Test_Status");
    		 Status_Desc.click();
    		 Thread.sleep(500);
    		 Status_Desc.clear();
    		 Status_Desc.sendKeys("Status Description");
    		 Thread.sleep(500);
    		 Status_Active.click();
    		 Thread.sleep(500);
    		 Status_Save.click();
    		 System.out.println("Status Added successfully");
    		 log.info("Status Added successfully");
    	 }
    	 
    	 public void Status_Filter_Edit() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 Status_Grid.click();
    		 Status_Filter_Box.click();
    		 Status_Filter_Box.clear();
    		 Thread.sleep(1000);
    		 Status_Filter_Box.sendKeys("Test_Status");
    		 Status_Filter.click();
    		 Thread.sleep(1000);
    		 Status_Filter_Equal.click();
    		 Thread.sleep(1000);
    		 System.out.println("Status Filtered successfully");
    		 log.info("Status Filtered successfully");
    		 Filtered_Grid.click();
    		 Thread.sleep(1000);
    		 Status_Edit.click();
    		 Thread.sleep(1000);
    		 Status_Desc.click();
    		 Status_Desc.clear();
    		 Thread.sleep(1000);
    		 Status_Desc.sendKeys("Desciption Edit");
    		 Status_Save.click();
    		 System.out.println("Status edited successfully");
    		 log.info("Status edited successfully");
    	 }
    	 
    	 public void Click_ProjectMaster() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 ProjectMaster_Tab.click();
    		 Thread.sleep(1000);
    		 System.out.println("Clicked on Project Master tab");
    		 log.info("Clicked on Project Master tab");
    	 }
    	 
    	 public void Add_ProjectMaster() throws InterruptedException
    	 {
    		 PM_Add.click();
    		 Thread.sleep(1000);
    		 PM_ProjectNo.click();
    		 PM_ProjectNo.clear();
    		 Thread.sleep(1000);
    		 PM_ProjectNo.sendKeys("Test Project-1");
    		 PM_Desc.click();
    		 PM_Desc.clear();
    		 Thread.sleep(1000);
    		 PM_Desc.sendKeys("Project Description");
    		 PM_StartDate.click();
    		 PM_StartDate.sendKeys("8/31/2020");
    		 Thread.sleep(1000);
    		 PM_Status.click();
    		 PM_Status_selection.click();
    		 Thread.sleep(1000);
    		 PM_Save.click();
    		 Thread.sleep(1000);
    		 System.out.println("Project Master added successfully");
    		 log.info("Project Master added successfully");
    	 }
    	 
    	 public void PM_Filter_Edit_Delete() throws InterruptedException
    	 {
    		 Thread.sleep(1000);
    		 PM_Grid.click();
    		 PM_ProjectNo_FilterBox.click();
    		 Thread.sleep(1000);
    		 PM_ProjectNo_FilterBox.sendKeys("Test Project-1");
    		 PM_ProjectNo_Filter.click();
    		 Thread.sleep(1000);
    		 PM_ProjectNo_Equal.click();
    		 Thread.sleep(1000);
    		 System.out.println("Project Master Filtered successfully");
    		 log.info("Project Master Filtered successfully");
    		 PM_Row_Selected.click();
    		 Thread.sleep(1000);
    		 PM_Edit.click();
    		 Thread.sleep(1000);
    		 PM_Desc.click();
    		 PM_Desc.clear();
    		 Thread.sleep(1000);
    		 PM_Desc.sendKeys("Description Edit");
    		 Thread.sleep(1000);
    		 PM_Save.click();
    		 Thread.sleep(1000);
    		 System.out.println("Project Master Edited successfully");
    		 log.info("Project Master Edited successfully");
    		 PM_Delete.click();
    		 Thread.sleep(1000);
    		 PM_Delete_OK.click();
    		 Thread.sleep(1000);
    		 System.out.println("Project Master Deleted successfully");
    		 log.info("Project Master Deleted successfully");
    		 Thread.sleep(1000);
    		 PM_ProjectNo_Filter.click();
    		 PM_NoFilter.click();   
    		 Thread.sleep(2000);
    	 }
    	 
   } 	 

    
    	 
    
	
     

