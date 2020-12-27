package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class DetailPO  extends AppDriver 
{
           public DetailPO()
           {
        	   PageFactory.initElements(driver, this);
           }
           @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00_ctl04_columnSelectCheckBox']")   WebElement firstchecbox;
         
           @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00_ctl06_columnSelectCheckBox']")   WebElement secondchecbox;
           @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00_ctl10_columnSelectCheckBox']")   WebElement thirdchecbox;
           @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00_ctl12_columnSelectCheckBox']")   WebElement fourthchecbox;
           @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00__0']/td[4]")  WebElement firstporow;
           @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00__0']/td[6]")  WebElement secondporow;
           @FindBy(xpath = "//*[@id='PODetailGrid_ctl00_ctl02_ctl00_cmbItem_Input']")  WebElement itembox;
           @FindBy(xpath = "//div[@id='ContentPlaceHolder1_DetailPage']//iframe")  WebElement itembox1;
           @FindBy(xpath = "//*[@id='PODetailGrid_ctl00_ctl02_ctl00_cmbItem_Arrow']")  WebElement Itemarrow;
           @FindBy(xpath = "//*[@id='PODetailGrid_ctl00_ctl02_ctl00_cmbItem_DropDown']/div[2]/ul/li[2]/table/tbody/tr/td[2]")  WebElement selectitem2;
           @FindBy(xpath = "//*[@id='PODetailGrid_ctl00_ctl02_ctl00_cmbItem_DropDown']/div[2]/ul/li[3]/table/tbody/tr/td[2]")  WebElement selectitem3;
           @FindBy(xpath = "//*[@id='PODetailGrid_ctl00_ctl02_ctl00_txtOrderQty']") WebElement qunatity;
           @FindBy(xpath = "//div[@id='ContentPlaceHolder1_DetailPage']//iframe") WebElement qunatity1;
           @FindBy(xpath = "//*[@id='PODetailGrid_ctl00_ctl02_ctl00_btnQuickAdd_input']") WebElement quickadd;
           @FindBy(xpath = "//div[@id='ContentPlaceHolder1_DetailPage']//iframe") WebElement quickadd1;
           
           public void clickporow() throws InterruptedException
           {
        	   firstporow.click();
        	   System.out.println("First PO row has been selected");
        	   Thread.sleep(2000);
           }
           public void clickpocheckbox() throws InterruptedException
           {
        	   firstchecbox.click();
        	   System.out.println("First PO Checkbox has been selected");
        	   Thread.sleep(2000);
           }
           public void clickdetailPO()
           {
        	   Dashboard dbobj = new Dashboard();
        	   dbobj.clickDetailPO();
           }
           public void selectItem() throws InterruptedException
           {
        	   List<WebElement> alist = driver.findElements(By.tagName("iframe"));
        	   driver.switchTo().frame(alist.get(0));
        	   Thread.sleep(2000);
        	   try
        	   {
        		   Itemarrow.click(); 
        		   System.out.println("Item input box arrow clicked");
        	   }
        	   catch(Exception e)
        	   {
        	   try
        	   {
        		   itembox.click();
        	   }
        	   catch(Exception ee)
        	   {
        	      
        	    	   itembox1.click();
        	    	   System.out.println("Item input box 1 clicked");
        	   }
        	   }
        	   System.out.println("Item input box clicked");
        	   Thread.sleep(2000);
        	   selectitem3.click();
           }
           public void EnterItemquantity() throws InterruptedException
           {
        	   try
        	   {
        	   qunatity.sendKeys(String.valueOf(2));
        	   }
        	   catch(Exception e)
        	   {
        		  
        			   qunatity1.sendKeys(String.valueOf(2));    		  
        		  
        	   }
        	   System.out.println("Item quantity has been entered");
        	   Thread.sleep(2000);
           }
           public void clickquickadd() throws InterruptedException
           {
        	   try
        	   {
        		   quickadd.click();
        	   }
        	   catch(Exception e)
        	   {
        		   quickadd1.click();
        	   }
        	   System.out.println("Item quickadd button clicked");
        	   Thread.sleep(2000);
        	   driver.switchTo().defaultContent();
           }
}
