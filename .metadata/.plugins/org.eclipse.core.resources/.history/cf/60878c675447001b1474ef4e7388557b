package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;

public class Logout extends AppDriver
{
	public Logout()
    {
   	 PageFactory.initElements(driver, this);
    }   
	
	
	@FindBy(xpath = "//span[@class='rtbIn']//img[@class='rtbIcon']")  WebElement logout;
	
	public void logouts()
	{
		logout.click();
		System.out.println("Logout is clicked");
	}
}
