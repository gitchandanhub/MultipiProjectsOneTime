package Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.AppDriver;

public class WIP extends AppDriver 
{

	Actions actions = new Actions(driver);
	Actions builder = new Actions(driver);
	String SO;
	
	public WIP()
     {
    	 PageFactory.initElements(driver, this);
     }
	
	@FindBy (xpath = "//span[contains(text(),'WIP')]") WebElement WIP;
	
	@FindBy (xpath = "//li[@class='rtsLI rtsFirst']//span[@class='rtsTxt'][contains(text(),'Machine')]") WebElement WIP_Machine_Tab;
	@FindBy (xpath ="//input[@name='ctl00$ContentPlaceHolder1$gridMachine$ctl00$ctl02$ctl00$btnAdd']") WebElement Machine_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtMachineNumber']") WebElement Machine_number;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtMachineName']") WebElement Machine_Name;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$cmbMachineLocation']") WebElement Machine_Location;
	@FindBy (xpath = "//li[contains(text(),'1005')]") WebElement Location_selection;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtMaxOperators']") WebElement Max_operators;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtMaxJobCapacity']") WebElement Max_Job_Capacity;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridMachine$ctl00$ctl02$ctl00$btnSave']") WebElement Machine_Save;

	@FindBy (xpath = "//tr[@class='rgFilterRow']") WebElement Filter_Row;
	@FindBy (xpath= "//input[@name='ctl00$ContentPlaceHolder1$gridMachine$ctl00$ctl02$ctl03$FilterTextBox_Number']") WebElement Machine_Filter;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridMachine$ctl00$ctl02$ctl03$Filter_Number']") WebElement Machine_Filter_Icon;
	@FindBy (xpath = "//span[contains(text(),'Contains')]") WebElement Machine_Contains;
	@FindBy (xpath = "//span[contains(text(),'NoFilter')]") WebElement Machine_NoFilter;
	@FindBy (xpath = "//div[@class='rgDataDiv']") WebElement Filtered_Grid;
	@FindBy (xpath = "//tr[@class='rgRow']//td[1]") WebElement Machine_Row_Selected;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridMachine$ctl00$ctl04$EditButton']") WebElement Machine_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridMachine$ctl00$ctl04$gbcDelete']") WebElement Machine_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'Yes')]") WebElement Delete_yes;
	
	@FindBy (xpath = "//*[@id=\"ctl00_MenuTab\"]/div[2]/ul[11]/li[2]/a/span/span/span") WebElement Operation;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridOperation$ctl00$ctl02$ctl00$btnAdd']") WebElement Operation_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtOperationNumber']") WebElement Operation_Number;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtOperation']") WebElement Operation_Name;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtMaxTime']") WebElement MaxTime;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtMinTime']") WebElement MinTime;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridOperation$ctl00$ctl02$ctl00$btnSave']") WebElement Save_operation;
	@FindBy (xpath = "//tr[@class='rgFilterRow']") WebElement Filter_RowOperation;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridOperation$ctl00$ctl02$ctl03$FilterTextBox_OperationName']") WebElement OperationName_Filter;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridOperation$ctl00$ctl02$ctl03$Filter_OperationName']") WebElement Operation_Filter;
	@FindBy (xpath = "//span[contains(text(),'Contains')]") WebElement OperationName_Contains;
	@FindBy (xpath = "//span[contains(text(),'NoFilter')]") WebElement OperationName_NoFilter;
	@FindBy (xpath = "//div[@class='rgDataDiv']") WebElement Filtered_Operation_Grid;
	@FindBy (xpath = "//tr[@class='rgRow']//td[1]") WebElement Filtered_Row_Selected;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridOperation$ctl00$ctl04$EditButton']") WebElement Operation_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridOperation$ctl00$ctl04$gbcDelete']") WebElement Operation_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'Yes')]") WebElement Operation_Delete_Yes;
	
	@FindBy (xpath = "//span[contains(text(),'Labor Type')]") WebElement LaborType_Tab;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridLaborType$ctl00$ctl02$ctl00$btnAdd']") WebElement LaborType_Add;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtCode']") WebElement LaborCode;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$txtDescription']") WebElement LaborDesc;
	@FindBy (xpath = "//span[@class='rbPrimaryIcon rbToggleCheckbox']") WebElement Special;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridLaborType$ctl00$ctl02$ctl00$btnSave']") WebElement Labor_Save;
	@FindBy (xpath = "//tr[@class='rgFilterRow']") WebElement Labor_FilterRow;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridLaborType$ctl00$ctl02$ctl03$FilterTextBox_Description']") WebElement Desc_Filter;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridLaborType$ctl00$ctl02$ctl03$Filter_Description']") WebElement DescFilter_Icon;
	@FindBy (xpath = "//span[contains(text(),'Contains')]") WebElement Desc_Contains;
	@FindBy (xpath = "//span[contains(text(),'NoFilter')]") WebElement Desc_NoFilter;
	@FindBy (xpath = "//div[@class='rgDataDiv']") WebElement Grid_select;
	@FindBy (xpath = "//tr[@class='rgRow']//td[1]") WebElement Row_Selected;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridLaborType$ctl00$ctl04$EditButton']") WebElement Labor_Edit;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridLaborType$ctl00$ctl04$gbcDelete']") WebElement Labor_Delete;
	@FindBy (xpath = "//td[@class='rwWindowContent']//span[@class='rwInnerSpan'][contains(text(),'Yes')]") WebElement Delete_Yes; 
		
	@FindBy (xpath = "//span[contains(text(),'Job Operations')]") WebElement JobOperations_Tab;
	@FindBy (xpath = "//input[@name='ctl00$ContentPlaceHolder1$gridJobOperation$ctl00$ctl02$ctl03$WHouseFilterCombo']") WebElement Warehouse_Filter;
	@FindBy (xpath = "//div[contains(@class,'rcbAutoWidth rcbAutoWidthResizer')]//li[1]") WebElement Warehouse_All;
	@FindBy (xpath = "//input[contains(@name,'ctl00$ContentPlaceHolder1$gridJobOperation$ctl00$ctl02$ctl00$btnAdd')]") WebElement JobOperations_Add;
	@FindBy (xpath = "//td[contains(@class,'rcbInputCell rcbInputCellLeft')]//input[contains(@name,'cmbWorkOrder')]") WebElement Workorder_Number;
	@FindBy (xpath = "//*[@id=\"cmbWorkOrder_DropDown\"]/div[1]/ul/li") WebElement WorkOrder_Selection;
	@FindBy (xpath ="//input[@name='cmbOperations']") WebElement JobOperation_OperatiopnName;
	@FindBy (xpath ="//*[@id=\"cmbOperations_DropDown\"]/div[1]/ul/li[1]") WebElement Operation_Selection;
	@FindBy (xpath ="//input[@id='cmbMachines_Input']") WebElement Machine_JobOperation;
	@FindBy (xpath ="//*[@id=\"cmbMachines_DropDown\"]/div[1]/ul/li[1]") WebElement Machine_Selection;
	@FindBy (xpath = "//input[@id='btnAddGridMachineUsers_input']") WebElement User_Add;
	@FindBy (xpath = "//input[@id='cmbUsers_Input']") WebElement User_Dropdown;
	@FindBy (xpath = "//*[@id=\"cmbUsers_DropDown\"]/div/ul/li[1]") WebElement User_Selection;
	@FindBy (xpath = "//*[@id=\"GridMachineUsers_ctl00__0\"]/td[3]") WebElement User_Selected;
	@FindBy (xpath = "//input[@id='cmbLaborType_Input']") WebElement LabourType_dropdown;
	@FindBy (xpath = "//*[@id=\"cmbLaborType_DropDown\"]/div[1]/ul/li[1]") WebElement LabourType_Selection;
	@FindBy (xpath = "//input[@id='btnSaveGridMachineUsers_input']") WebElement Machine_User_Save;
	@FindBy (xpath = "//*[@id=\"btnSave\"]") WebElement Save_JobOperation;
	@FindBy (xpath = "//span[contains(text(),'Job Start')]") WebElement Job_Start_Stop;
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_OperationsGrid_ctl00_ctl02_ctl00_cmbUsers_Input']") WebElement EUS;
	@FindAll (@FindBy (xpath = "//*[@id='ctl00_ContentPlaceHolder1_OperationsGrid_ctl00_ctl02_ctl00_cmbUsers_DropDown']/div/ul/li"))  List<WebElement> list;
	 
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_OperationsGrid_ctl00_ctl02_ctl03_WHouseFilterCombo_Input']") WebElement Warehouse_Filter_JobSS;
	@FindBy (xpath = "//div[@id='ctl00_ContentPlaceHolder1_OperationsGrid_ctl00_ctl02_ctl03_WHouseFilterCombo_DropDown']//li[1]") WebElement Warehouse_All_JobSS;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_OperationsGrid_ctl00__0\"]") WebElement Operation_Grid_JobSS;
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_OperationsGrid_ctl00_ctl04_btnStart']") WebElement JobSS_Start;
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_OperationsGrid_ctl00_ctl04_btnStop']") WebElement JobSS_Stop;
	@FindBy (xpath = "//textarea[@id='txtComment']") WebElement Stop_Comments;
	@FindBy (xpath = "//input[@id='cmbAction_Input']") WebElement Stop_Action;
	@FindBy (xpath = "//*[@id=\"cmbAction_DropDown\"]/div/ul/li[2]") WebElement Stop_Action_selection;
	@FindBy (xpath = "//input[@id='btnSave_input']") WebElement Stop_Action_Save;
	
	@FindBy (xpath = "//span[contains(text(),'Job View')]") WebElement JobView_Tab;
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_gridWOJobView_ctl00_ctl02_ctl03_WHouseFilterCombo_Input']") WebElement JobView_Warehouse;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_gridWOJobView_ctl00_ctl02_ctl03_WHouseFilterCombo_DropDown\"]/div/ul/li[1]") WebElement JobView_Warehouse_All;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_gridWOJobView_ctl00_ctl02_ctl03_WorkOrderFilterCombo_Input\"]") WebElement JobView_WorkOrder;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_gridWOJobView_ctl00_ctl02_ctl03_WorkOrderFilterCombo_DropDown\"]/div[1]/ul/li") WebElement JobView_Workorder_Selection;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_gridWOJobView_ctl00__0\"]") WebElement JobView_grid;
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_gridWOJobView_ctl00_ctl04_GECBtnExpandColumn']") WebElement JobView_Expand;
	@FindBy (xpath = "//span[contains(text(),'Machine View')]") WebElement MachineView_Tab;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_gridMachineView_ctl00_ctl02_ctl03_WorkOrderFilterCombo_Input\"]") WebElement MachineView_WorkOrder;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_gridMachineView_ctl00_ctl02_ctl03_WorkOrderFilterCombo_DropDown\"]/div[1]/ul/li") WebElement MachineView_WorkOrder_Selection;
	
	
	//WebElements for Work Order creation in Operations tab
	@FindBy (xpath ="//div[@class='rtsLevel rtsLevel1']//span[@class='rtsTxt'][contains(text(),'Operations')]") WebElement Operations;
	@FindBy (xpath ="//li[@class='rtsLI rtsFirst']//span[@class='rtsTxt'][contains(text(),'Work Orders')]") WebElement Operations_WorkOrder;
	@FindBy (xpath ="//span[@id='ctl00_ContentPlaceHolder1_WorkOrderGrid_ctl00_ctl02_ctl00_btnAdd']") WebElement WorkOrder_Add;
	@FindBy (xpath ="//input[@id='cmbStageLocation_Input']") WebElement Stage_Location;
	@FindBy (xpath ="//*[@id=\"cmbStageLocation_DropDown\"]/div[1]/ul/li") WebElement Stage_Location_selection;
	@FindBy (xpath = "//span[@id='chkAllowWIP']//span[@class='rbPrimaryIcon rbToggleCheckbox']") WebElement Allow_WIP;
	@FindBy (xpath = "//input[@id='btnSave_input']") WebElement WorkOrder_Save;
	@FindBy (xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_WorkOrderGrid_ctl00__0\"]/td[5]") WebElement WorkOrder_Added;
	
	
	public void Click_WIP() throws InterruptedException
    {
	 Thread.sleep(2000);
   	 WIP.click();
   	 Thread.sleep(2000);
   	 System.out.println("Clicked on WIP");
   	 log.info("Clicked on WIP");
    }
	
	public void Click_Machine() throws InterruptedException
	{
		Thread.sleep(2000);
		WIP_Machine_Tab.click();
		Thread.sleep(2000);
	   	System.out.println("Clicked on Machine Tab");
	   	log.info("Clicked on Machine Tab");
	}
	
	public void Machine_Save() throws InterruptedException
	{
		Thread.sleep(2000);
		Machine_Add.click();
		Thread.sleep(1000);
		Machine_number.click();
		Machine_number.clear();
		Thread.sleep(2000);
		Machine_number.sendKeys("M-Test1");
		Thread.sleep(2000);
		Machine_Name.click();
		Machine_Name.clear();
		Thread.sleep(2000);
		Machine_Name.sendKeys("Test Machine");
		Thread.sleep(2000);
		Machine_Location.click();
		Thread.sleep(1000);
		Location_selection.click();
		Thread.sleep(1000);
		Max_operators.click();
		Thread.sleep(2000);
		Max_operators.sendKeys("10");
		Thread.sleep(1000);
		Max_Job_Capacity.click();
		Thread.sleep(2000);
		Max_Job_Capacity.sendKeys("20");
		Machine_Save.click();
		Thread.sleep(2000);
		System.out.println("Machine Added successfully");
		log.info("Machine Added successfully");
	}
	public void Machine_Filter() throws InterruptedException
	{
		Filter_Row.click();
		Thread.sleep(2000);
		Machine_Filter.click();
		Machine_Filter.clear();
		Thread.sleep(1000);
		Machine_Filter.sendKeys("Test1");
		Thread.sleep(2000);
		Machine_Filter_Icon.click();
		Thread.sleep(1000);
		Machine_Contains.click();
		Thread.sleep(2000);
		System.out.println("Machine Filtered successfully");
		log.info("Machine Filtered successfully");
	}
	
	public void Machine_Edit() throws InterruptedException
	{
		Thread.sleep(1000);
		Filtered_Grid.click();
		Thread.sleep(1000);
		Machine_Row_Selected.click();
		Thread.sleep(1000);
		Machine_Edit.click();
		Thread.sleep(2000);
		Machine_Name.click();
		Thread.sleep(1000);
		Machine_Name.clear();
		Machine_Name.sendKeys("Name Edit");
		Thread.sleep(1000);
		Machine_Save.click();
		System.out.println("Machine Edited successfully");
		log.info("Machine Edited successfully");
		
	}
	
	public void Machine_Delete() throws InterruptedException
	{
		Thread.sleep(1000);
		Machine_Row_Selected.click();
		Thread.sleep(1000);
		Machine_Delete.click();
		Thread.sleep(1000);
		Delete_yes.click();
		Thread.sleep(1000);
		System.out.println("Machine Deleted successfully");
		log.info("Machine Deleted successfully");
		Thread.sleep(1000);
		Machine_Filter_Icon.click();
		Thread.sleep(1000);
		Machine_NoFilter.click();
	}
	public void Click_Operation() throws InterruptedException
	{
		Thread.sleep(2000);
		Operation.click();
		Thread.sleep(2000);
	   	System.out.println("Clicked on Operation Tab");
	   	log.info("Clicked on Operation Tab");
	}
	
	public void Operation_Add() throws InterruptedException
	{
		Operation_Add.click();
		Thread.sleep(2000);
		Operation_Number.click();
		Operation_Number.clear();
		Thread.sleep(1000);
		Operation_Number.sendKeys("Test OP-1");
		Thread.sleep(1000);
		Operation_Name.click();
		Operation_Name.clear();
		Thread.sleep(1000);
		Operation_Name.sendKeys("Test Operation Name");
		Thread.sleep(1000);
		MaxTime.click();
		MaxTime.sendKeys("15");
		Thread.sleep(1000);
		MinTime.click();
		MinTime.sendKeys("3");
		Thread.sleep(1000);
		Save_operation.click();
		Thread.sleep(1000);
		System.out.println("Operation added successfully");
	   	log.info("Operation added successfully");
	 }
	public void Operation_Filter() throws InterruptedException
	{
		Filter_RowOperation.click();
		Thread.sleep(2000);
		OperationName_Filter.click();
		Thread.sleep(2000);
		OperationName_Filter.sendKeys("Test");
		Thread.sleep(2000);
		Operation_Filter.click();
		Thread.sleep(2000);
		OperationName_Contains.click();
		System.out.println("Operation filtered successfully");
	   	log.info("Operation Filtered successfully");		
	}
	public void Operation_Edit() throws InterruptedException
	{
		Thread.sleep(2000);
		Filtered_Operation_Grid.click();
		Thread.sleep(2000);
		Filtered_Row_Selected.click();
		Thread.sleep(1000);
		Operation_Edit.click();
		Thread.sleep(2000);
		Operation_Name.click();
		Operation_Name.clear();
		Thread.sleep(2000);
		Operation_Name.sendKeys("Test Operation Name Edit");
		Thread.sleep(2000);
		Save_operation.click();
		Thread.sleep(2000);
		System.out.println("Operation Edited successfully");
	   	log.info("Operation Edited successfully");		
	}
	
	public void Operation_Delete() throws InterruptedException
	{
		Operation_Delete.click();
		Thread.sleep(2000);
		Operation_Delete_Yes.click();
		Thread.sleep(2000);
		System.out.println("Operation Deleted successfully");
	   	log.info("Operation Deleted successfully");
	   	Thread.sleep(2000);
	   	Operation_Filter.click();
	   	Thread.sleep(2000);
	   	OperationName_NoFilter.click();
		
	}
	
	
	public void Click_LaborType() throws InterruptedException
	{
		Thread.sleep(2000);
		LaborType_Tab.click();
		Thread.sleep(2000);
	   	System.out.println("Clicked on Labor Type Tab");
	   	log.info("Clicked on Labor Type Tab");
	}
	
	public void Labor_Add() throws InterruptedException
	{
		LaborType_Add.click();
		Thread.sleep(2000);
		LaborCode.click();
		LaborCode.clear();
		Thread.sleep(1000);
		LaborCode.sendKeys("Test1");
		Thread.sleep(1000);
		LaborDesc.click();
		LaborDesc.clear();
		Thread.sleep(1000);
		LaborDesc.sendKeys("Labor Description");
		Special.click();
		Thread.sleep(1000);
		Labor_Save.click();
		System.out.println("Labor Type added successfully");
	   	log.info("Labor Type added successfully");
	 }
	
	public void Labor_Filter() throws InterruptedException
	{
		Labor_FilterRow.click();
		Thread.sleep(2000);
		Desc_Filter.click();
		Thread.sleep(2000);
		Desc_Filter.sendKeys("Description");
		Thread.sleep(2000);
		DescFilter_Icon.click();
		Thread.sleep(2000);
		Desc_Contains.click();
		System.out.println("Labor Type filtered successfully");
	   	log.info("Labor Type Filtered successfully");		
	}
	
	public void Labor_Edit() throws InterruptedException
	{
		Thread.sleep(2000);
		Grid_select.click();
		Thread.sleep(2000);
		Row_Selected.click();
		Thread.sleep(1000);
		Labor_Edit.click();
		Thread.sleep(2000);
		LaborDesc.click();
		LaborDesc.clear();
		Thread.sleep(2000);
		LaborDesc.sendKeys("Description Edit");
		Thread.sleep(2000);
		Labor_Save.click();
		Thread.sleep(2000);
		System.out.println("Labor Type Edited successfully");
	   	log.info("Labor Type Edited successfully");		
	}
	
	public void Labor_Delete() throws InterruptedException
	{
		Labor_Delete.click();
		Thread.sleep(2000);
		Delete_Yes.click();
		Thread.sleep(2000);
		System.out.println("Labor Type Deleted successfully");
	   	log.info("Labor Type Deleted successfully");
	   	Thread.sleep(2000);
	   	DescFilter_Icon.click();
	   	Thread.sleep(2000);
	   	Desc_NoFilter.click();
		
	}
	
/*	public void Operations_WorkOrder() throws InterruptedException
	{
		Thread.sleep(2000);
		Operations.click();
		Thread.sleep(2000);
		Operations_WorkOrder.click();
		Thread.sleep(2000);
		WorkOrder_Add.click();
		Thread.sleep(2000);
		driver.switchTo().frame("winQuickPick");
		Thread.sleep(2000);
		Stage_Location.click();
		Thread.sleep(2000);
		Stage_Location_selection.click();
		Thread.sleep(2000);
		Allow_WIP.click();
		Thread.sleep(2000);
		WorkOrder_Save.click();
		Thread.sleep(2000);
		String SO = WorkOrder_Added.getText();
		//System.out.println("value of SO   "+ SO);
		
		System.out.println("Work Order with WIP checked created successfully");
		log.info("Work Order with WIP checked created successfully");
		
	} */
	
/*	public void Click_JobOperations() throws InterruptedException
	{
		Thread.sleep(2000);
		JobOperations_Tab.click();
		Thread.sleep(2000);
	   	System.out.println("Clicked on Job Operations Tab");
	   	log.info("Clicked on Job Operations Tab");
	} */
	
	public void JobOperation_Add() throws InterruptedException
	{
		
		Thread.sleep(2000);
		Operations.click();
		Thread.sleep(2000);
		Operations_WorkOrder.click();
		Thread.sleep(2000);
		WorkOrder_Add.click();
		Thread.sleep(2000);
		driver.switchTo().frame("winQuickPick");
		Thread.sleep(2000);
		Stage_Location.click();
		Thread.sleep(2000);
		Stage_Location_selection.click();
		Thread.sleep(2000);
		Allow_WIP.click();
		Thread.sleep(2000);
		WorkOrder_Save.click();
		Thread.sleep(2000);
		String SO = WorkOrder_Added.getText();
		System.out.println("value of SO   "+ SO);
		
		System.out.println("Work Order with WIP checked created successfully");
		log.info("Work Order with WIP checked created successfully");
		
		Thread.sleep(2000);
		WIP.click();
		
		Thread.sleep(2000);
		JobOperations_Tab.click();
		Thread.sleep(2000);
		
		Warehouse_Filter.click();
		Thread.sleep(2000);
		Warehouse_All.click();
		Thread.sleep(2000);
		JobOperations_Add.click();
		Thread.sleep(2000);
		driver.switchTo().frame ("winPopup");
		Thread.sleep(2000);
		Workorder_Number.click();
		Thread.sleep(2000);
		
		Workorder_Number.sendKeys(SO);
		Thread.sleep(2000);
		WorkOrder_Selection.click();
		Thread.sleep(2000);
		JobOperation_OperatiopnName.click();
		Thread.sleep(2000);
		Operation_Selection.click();
		Thread.sleep(2000);
		Machine_JobOperation.click();
		Thread.sleep(2000);
		Machine_Selection.click();
		Thread.sleep(2000);
		User_Add.click();
		Thread.sleep(2000);
		User_Dropdown.click();
		Thread.sleep(2000);
		User_Selection.click();

		Thread.sleep(2000);
		LabourType_dropdown.click();
		Thread.sleep(2000);
		LabourType_Selection.click();
		Thread.sleep(2000);
		Machine_User_Save.click();
		Thread.sleep(2000);
		System.out.println("WIP > Job Operation User Added successfully");
		log.info("WIP > Job Operation User Added successfully");
		Save_JobOperation.click();
		
		System.out.println("WIP > Job Operation created successfully");
		log.info("WIP > Job Operation created successfully");
		
		 String UName = User_Selected.getText();
		
		System.out.println("value of UName   "+ UName);
		Thread.sleep(2000);
		
		Job_Start_Stop.click();
		Thread.sleep(2000);
		Warehouse_Filter_JobSS.click();
		Thread.sleep(2000);
		Warehouse_All_JobSS.click();
		Thread.sleep(2000);
				
		Thread.sleep(2000);
		EUS.click();
		for(int i =0; i<list.size(); i++ )
	     {
	     String text = list.get(i).getText();
	     System.out.println(text);
	     }
		
	     for(int j =0; j<list.size(); j++ )
         {
	    
	    	 
         String text1 = list.get(j).getText();
         
         if(UName.equalsIgnoreCase(text1))
         {
         list.get(j).click();
         System.out.println("User selected successfully");
         }
         }
		Thread.sleep(2000);
		Operation_Grid_JobSS.click();
		Thread.sleep(2000);
		JobSS_Start.click();
		System.out.println("WIP > Job Started successfully");
		log.info("WIP > Job Started successfully");
		Thread.sleep(60000);
		JobSS_Stop.click();
		Thread.sleep(2000);
		driver.switchTo().frame("winPopup");
		Stop_Action.click();
		Thread.sleep(2000);
		Stop_Action_selection.click();
		Thread.sleep(2000);
		Stop_Comments.click();
		Thread.sleep(2000);
		Stop_Comments.sendKeys("Testing Stop Work Order");
		Thread.sleep(2000);
		Stop_Action_Save.click();
		System.out.println("Job Operation stopped successfully");
		log.info("Job Operation stopped successfully");
		
		Thread.sleep(8000);
		JobView_Tab.click();
		Thread.sleep(2000);
		JobView_Warehouse.click();
		Thread.sleep(2000);
		JobView_Warehouse_All.click();
		Thread.sleep(2000);
		JobView_WorkOrder.click();
		Thread.sleep(2000);
		JobView_WorkOrder.sendKeys(SO);
		Thread.sleep(2000);
		JobView_Workorder_Selection.click();
		Thread.sleep(2000);
		JobView_grid.click();
		Thread.sleep(2000);
		JobView_Expand.click();
		System.out.println("Job View seen for work order started");
		log.info("Job View seen for work order started");
		
		Thread.sleep(8000);
		MachineView_Tab.click();
		Thread.sleep(2000);
		MachineView_WorkOrder.click();
		Thread.sleep(2000);
		MachineView_WorkOrder.sendKeys(SO);
		Thread.sleep(2000);
		MachineView_WorkOrder_Selection.click();
		System.out.println("MachineView seen for work order started");
		log.info("MachineView seen for work order started");
		
	}
	
	 /*public void printall()
     {
     for(int i =0; i<list.size(); i++ )
     {
     String text = list.get(i).getText();
     System.out.println(text);
     }*/
     }
	/*public void JobStartStop() throws InterruptedException
	{
		Thread.sleep(2000);
		Job_Start_Stop.click();
		Thread.sleep(2000);
		Warehouse_Filter_JobSS.click();
		Thread.sleep(2000);
		Warehouse_All_JobSS.click();
		Thread.sleep(2000);
		User_JobSS.click();
		Thread.sleep(2000);
		User_JobSS.sendKeys("UName");
		Operation_Grid_JobSS.click();
		Thread.sleep(2000);
		JobSS_Start.click();
	}*/

