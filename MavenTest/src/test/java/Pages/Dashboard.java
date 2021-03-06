package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class Dashboard  extends AppDriver 
{
     public Dashboard()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath = "//tbody/tr[@id='RAD_SPLITTER_PANE_TR_ctl00_Menu']/td[@id='ctl00_Menu']/div[@id='RAD_SPLITTER_PANE_CONTENT_ctl00_Menu']/div[2]/div[2]/ul[1]/li[2]/span[1]/img[1]")   WebElement receiving;
     @FindBy(xpath = "//a[@class='rtsLink rtsAfter underfirstline']//span[@class='rtsTxt'][contains(text(),'Receiving')]")   WebElement receiving1;
     @FindBy(xpath = "//tbody/tr[@id='RAD_SPLITTER_PANE_TR_ctl00_Menu']/td[@id='ctl00_Menu']/div[@id='RAD_SPLITTER_PANE_CONTENT_ctl00_Menu']/div[2]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]/img[1]") WebElement purchaseorder;
     @FindBy(xpath = "//a[@class='rtsLink underfirstline']//span[@class='rtsTxt'][contains(text(),'Purchase Order')]") WebElement purchaseorder1;
     @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadTabStrip']/div/ul/li[2]/a/span/span/span") WebElement Podetails;
     @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_POGrid_ctl00_ctl02_ctl00_btnAdd']")  WebElement addbutton;
     @FindBy(xpath = "//tbody/tr[@id='RAD_SPLITTER_PANE_TR_ctl00_Menu']/td[@id='ctl00_Menu']/div[@id='RAD_SPLITTER_PANE_CONTENT_ctl00_Menu']/div[2]/div[2]/ul[1]/li[4]/span[1]/img[1]")  WebElement pickpackshiptab;
     @FindBy(xpath = "//span[contains(text(),'Pick')]")  WebElement pickpackshiptab1;
     @FindBy(xpath = "//tbody/tr[@id='RAD_SPLITTER_PANE_TR_ctl00_Menu']/td[@id='ctl00_Menu']/div[@id='RAD_SPLITTER_PANE_CONTENT_ctl00_Menu']/div[2]/div[2]/ul[1]/li[4]/div[1]/ul[1]/li[1]/a[1]/img[1]") WebElement Salesordertab;
     @FindBy(xpath = "//a[@class='rtsLink underfirstline']//span[@class='rtsTxt'][contains(text(),'Sales Order')]")   WebElement Salesordertab1;
     @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ShipOrderGrid_ctl00_ctl02_ctl00_btnAdd']/span")  WebElement addsalesorderbtn;
     
     public void Clickreceiving() throws InterruptedException
     {
    	 receiving.click();
    	 Thread.sleep(2000);
    	 System.out.println("clicked on receiving");
     }
     public void Clickpo() throws InterruptedException
     {
    	 purchaseorder.click(); 
    	 Thread.sleep(2000);
    	 System.out.println("clicked on PO");
     }
     public void Addpo() throws InterruptedException
     {
    	 addbutton.click(); 
    	 Thread.sleep(3000);
    	 System.out.println("clicked on ADD button");
    	 driver.switchTo().frame("winPopup");
    	 System.out.println("Switched to popup window");
    	 log.info("Switched to popup window");
    	 Thread.sleep(4000);
    	 
    	 
     }
     public void clickDetailPO()
     {
    	 Podetails.click();
    	 System.out.println("Details PO is clicked");
    	 log.info("Details PO is clicked");
     }
     public void clickpickpackship()
     {
    	 pickpackshiptab.click();
    	 System.out.println("Sales Order Tab is clicked");
    	 log.info("Sales order tab is clicked");
     }
     
     public void clickSOtab()
     {
    	 Salesordertab.click();
    	 System.out.println("Sales Order Tab is clicked");
    	 log.info("Sales order tab is clicked");

     }
     public void clickaddbtnSO()
     {
    	 addsalesorderbtn.click();
    	 System.out.println("Add button  is clicked");
    	 log.info("Add button is clicked");
 
     }
}
