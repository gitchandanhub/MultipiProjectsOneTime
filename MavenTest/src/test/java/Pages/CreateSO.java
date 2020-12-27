package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class CreateSO extends AppDriver
{
       public CreateSO()
       {
    	   PageFactory.initElements(driver, this);
       }
       @FindBy(xpath = "//span[@id='rdbManualId']//span[@class='rbText rbPrimary'][contains(text(),'No')]") WebElement noradiobtn;
       @FindBy(xpath = "//*[@id='rdbManualId']/span[2]")  WebElement noradiobtn1;
       @FindBy(xpath = "//*[@id='txtShipOrderNo']")  WebElement soinputbox;
       @FindBy(xpath = "//*[@id='cmbPickType_Input']")       WebElement picktype;
       @FindBy(xpath = "//*[@id='cmbPickType_DropDown']/div/ul/li[1]")       WebElement picktypeshiporder;
       @FindBy(xpath = "//*[@id='cmbPickType_DropDown']/div/ul/li[2]")       WebElement picktypestageorder;
       @FindBy(xpath = "//*[@id='cmbPickType_DropDown']/div/ul/li[3]")       WebElement picktypepackorder;
       @FindBy(xpath = "//*[@id='btnSave_input']")  WebElement  savebtn;
       
       public void createSO() throws InterruptedException
       {
    	   Dashboard  dbobj = new Dashboard();
    	   dbobj.clickpickpackship();
    	   System.out.println("pick/pack/ship is clicked");
    	   log.info("Pick/Pack/Ship is clicked");
    	   Thread.sleep(2000);
    	   dbobj.clickSOtab();
    	   System.out.println("SO tab is clicked");
    	   log.info("SO tab is clicked");
    	   Thread.sleep(2000);
    	   dbobj.clickaddbtnSO();    	   
    	   System.out.println("Add button is clicked");
    	   log.info("Add button is clicked");
    	   Thread.sleep(3000);
    	  
       }
       
       public void EnterShipordernumber(String SONum) throws InterruptedException
       {
    	   
    	   try
    	   {
    	   soinputbox.clear();
    	   soinputbox.sendKeys(SONum);
    	   System.out.println("SO Number is entered");
           log.info("SO Number is entered");
    	   }
    	   catch(Exception e)
    	   {
    		   
    	   }
       }
       public void clickpicktype() throws InterruptedException
       {
    	   picktype.click();
    	   System.out.println("pick type is clicked");
           log.info("pick type is clicked");
           Thread.sleep(2000);
           picktypeshiporder.click();
           System.out.println("pick type Ship order is clicked");
           log.info("pick type ship order is clicked");
       }
       
       public void savebutton() throws InterruptedException
       {
    	   savebtn.click();
    	   System.out.println("SO save button is clicked");
           log.info("SO save button  is clicked");
           Thread.sleep(2000);
           
       }
}
