package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class SOdetails extends AppDriver
{
	int i;
	public SOdetails()
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
        public void EnterItemQuantity(int x) throws InterruptedException
        {
        	itmqtybox.sendKeys(String.valueOf(x));
        	System.out.println("Item Quantity has been Entered");
        	log.info("Item Quantity has been Entered");
        	 Thread.sleep(2000);
        }
        public void ClickQuickadd() throws InterruptedException
        {
        	quickadd.click();
        	System.out.println("Quick add button has clicked");
        	log.info("Quick add button has clicked");
        	 Thread.sleep(2000);
        	 driver.switchTo().defaultContent();
        }
}
