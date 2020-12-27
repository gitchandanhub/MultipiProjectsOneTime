package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class POmaster extends AppDriver
{
           public POmaster()
           {
        	   PageFactory.initElements(driver, this);
           }
           
           @FindBy(id = "txtRefSoNos")  WebElement soref;
           @FindBy(id = "cmbVendor_Input")  WebElement vendor;
           @FindBy(xpath = "//*[@id='cmbVendor_DropDown']/div[1]/ul/li[2]")  WebElement vendoritem;
           @FindBy(xpath = "//*[@id='btnSave_input']")  WebElement save;
           public void clickvendor() throws InterruptedException
           {
        	   vendor.click();
        	   Thread.sleep(2000);
        	   vendoritem.click();
        	   log.info("Vendor has been selected");
        	   System.out.println("Vendor has been selected");
           }
           public void SavePO() throws InterruptedException
           {
        	   save.click();
        	   Thread.sleep(3000);
        	   System.out.println("PO Save button clicked");
        	   log.info("PO Save button clicked");
           }
}
