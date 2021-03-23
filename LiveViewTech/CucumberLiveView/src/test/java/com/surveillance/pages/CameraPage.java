package com.surveillance.pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;
import org.openqa.selenium.WebElement;

public class CameraPage
{
PropertySingleton _instance = null;
	
	public CameraPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("CameraPage");

	public CameraPage clickOnLiveUnit()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LiveUnit1"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnSubLiveUnit()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LiveSubUnit1"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnSelectSubCameraFirstLInk()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LINK_SelectSubCameraFirstLInk"));
		keywords.waitForPageLoad();
		return this;
	}
	public CameraPage clickOnCameraLink()
	{
		keywords.jsClick("xpath", _instance.getValue("CameraPage.LinkCameraLink"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnAdditionalButtons() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.AdditionalButtons"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.AdditionalButtons"));
		keywords.waitForPageLoad();
		return this;
	}
 
	public CameraPage clickOnGoToLiveUnit() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_GoToLiveUnit"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_GoToLiveUnit"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnDeactive() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_Deactive"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_Deactive"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnActive() throws Throwable
	{
		
		keywords.waitForPageLoad();
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_Active"));
		keywords.waitForPageLoad();
		Thread.sleep(10000);
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_Active"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage enterSerialNumber(String SerialNumber) throws Throwable
	{
		keywords.EntertextInAlert(SerialNumber);

//		Robot rb =new Robot();
//
//			String string="MAC00232";
//			rb.keyPress(KeyEvent.VK_CAPS_LOCK);
//			rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
//			for (int i = 0; i < string.length (); ++i) {
//
//				char c = string.charAt(i);
//
//				int j = (int)c;
//				System.out.println("ASCII OF "+c +" = " + j + ".");
//				rb.keyPress(j);
//				rb.keyRelease(j);
//		}
//		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
//		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//
		
		return this;
	}
	
	public CameraPage DismisOrActivePopUp(String confirm) throws Throwable
	{
		
		keywords.handleAlert(confirm);

		
		return this;
	}
	
	public String getSerialNumber() throws Throwable 
	{
		String text=keywords.getText("xpath", _instance.getValue("CameraPage.SerialNumber"));
		//WebElement elem = keywords.elementFind("xpath", "//h2/following::td[5]");
		keywords.driver.findElement(By.xpath("//h2/following::td[5]")).click();
		//Actions actions = new Actions(keywords.driver);
		//actions.doubleClick(elem).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		return text;
	}
	
	public boolean verifyActiveButton() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
	boolean active=	keywords.isDisplayed("xpath", _instance.getValue("CameraPage.BTN_Active"));

		 
		return active;
	}
	public boolean verifyDeActiveButton() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
	boolean active=	keywords.isDisplayed("xpath", _instance.getValue("CameraPage.BTN_Deactive"));

		
		return active;
	}
	
	public CameraPage clickOnInvoiceDataReport() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public boolean verifyInvoiceDataReport() throws Throwable
	{
	keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
	boolean invoice=	keywords.isDisplayed("xpath", _instance.getValue("CameraPage.InvoiceDataReport"));
	return invoice;
	}
	
	public CameraPage clickOnReturntoLiveUnit() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.ReturntoLiveUnit"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.ReturntoLiveUnit"));
//		keywords.waitForPageLoad();
		return this;
	}
	public CameraPage SelectLiveViewTechnologies(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CameraPage.Dropdown_LiveViewTechnologies"), Data);
		return this;
	}
	
	public CameraPage verifyInvoicePage() throws Throwable
	{
		keywords.verifyTitle("LiveView Technologies QA - System Management - Billing Transactions");
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage clickOnSetDemo() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("CameraPage.BTN_SetDemo"));
		keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_SetDemo"));
//		keywords.waitForPageLoad();
		return this;
	}
	
	public CameraPage SelectSetDemoDate() throws Throwable
	{
		
		keywords.selectSetDemoDate();
		return this;
	}
	public boolean gettextDemoDateCalender() throws Throwable
	{
	boolean text=false;
	String Acttext	=keywords.getText("xpath", _instance.getValue("CameraPage.TXT_SetDemoStatus"));
	String expectData="Changing the demo status will affect billing for this unit.";
	if(Acttext.equals(expectData))
	{
		text=true;
	}
		return text;
	}
	
	
	public boolean verifyLBLDemoEndDate() throws Throwable
	{
		boolean text=false;
		String Acttext	=keywords.getText("xpath", _instance.getValue("CameraPage.BTN_SetDemoEndDate"));
		String expectData="Set Demo End Date";
		if(Acttext.equals(expectData))
		{
			text=true;
		}
			return text;
		
	}

	/*public boolean VerifyActiveOrDeactive(String ActiveDeactive) throws Throwable
	{
		if(ActiveDeactive.equals("Active"))
		{
			keywords.isDisplayed("xpath", _instance.getValue("Archives.BTN_Active"));
		}
		else if(ActiveDeactive.equals("Deactive"))
		{
			keywords.isDisplayed("xpath", _instance.getValue("Archives.BTN_Active"));
		}
		
		
		return this;
	}*/
	public CameraPage enterFilterLiveUnits(String value) throws Exception {
		keywords.waitForPageLoad();
		keywords.enterData("xpath", _instance.getValue("CameraPage.TXT_FilterLiveUnits"), value);
		return this;
}
	
	public String getWaterMarkFilterLiveUnits() throws Exception
	{
		keywords.waitForPageLoad();
	String filterWaterMark=	keywords.getAttribute("xpath", _instance.getValue("CameraPage.TXT_FilterLiveUnits"), "placeholder");
		return filterWaterMark;
}
	  public String verifySearchForFirstElement() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("CameraPage.BTN_SearchForFirstElement"));
			return Data;
		}

	  public void clickSearchForFirstElement() throws Exception {
			keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_SearchForFirstElement"));
			
		}
	  
		public CameraPage clickOnSelectCameraFirstLInk() throws Throwable
		{
			
			keywords.jsClick("xpath", _instance.getValue("CameraPage.LINK_SelectCameraFirstLInk"));

			return this;
		}
	
		public CameraPage getHDR_ChargeAmount() throws Throwable
		{
			
			keywords.getText("xpath", _instance.getValue("CameraPage.HDR_ChargeAmount"));

			return this;
		}
		
		public CameraPage getLBL_EachBillingCycle() throws Throwable
		{
			
			keywords.getText("xpath", _instance.getValue("CameraPage.LBL_EachBillingCycle"));

			return this;
		}
		
		public CameraPage getLBL_MSRP() throws Throwable
		{
			
			keywords.getText("xpath", _instance.getValue("CameraPage.LBL_MSRP"));

			return this;
		}
		
		public CameraPage getLBL_LastAmount() throws Throwable
		{
			
			keywords.getText("xpath", _instance.getValue("CameraPage.LBL_LastAmount"));

			return this;
		}
		
		public CameraPage getLBL_Custom() throws Throwable
		{
			
			keywords.getText("xpath", _instance.getValue("CameraPage.LBL_Custom"));

			return this;
		}
		
		public CameraPage getLBL_invoice_info() throws Throwable
		{
			
			keywords.getText("xpath", _instance.getValue("CameraPage.LBL_invoice_info"));

			return this;
		}
		
		public boolean isEnableRadio_MSRP() throws Throwable
		{
			
			boolean	Radio_MSRP=keywords.isEnabled("xpath", _instance.getValue("CameraPage.Radio_MSRP"));

			return Radio_MSRP;
		}
		
		
		public boolean isEnableRadio_LastAmount() throws Throwable
		{
			
			boolean	Radio_LastAmount=keywords.isEnabled("xpath", _instance.getValue("CameraPage.Radio_LastAmount"));

			return Radio_LastAmount;
		}
		
		
		
		public boolean isEnableBTN_Submit() throws Throwable
		{
			
			boolean	BTN_Submit=keywords.isEnabled("xpath", _instance.getValue("CameraPage.BTN_Submit"));

			return BTN_Submit;
		}
		
		public boolean isEnableRadio_Custom() throws Throwable
		{
			
			boolean	Radio_Custom= keywords.isEnabled("xpath", _instance.getValue("CameraPage.Radio_Custom"));

			return Radio_Custom;
		}
		

		public CameraPage clickRadio_MSRP() throws Throwable
		{
			
			keywords.jsClick("xpath", _instance.getValue("CameraPage.Radio_MSRP"));

			return this;
		}
		
		
		public CameraPage clickRadio_LastAmount() throws Throwable
		{
			
			keywords.jsClick("xpath", _instance.getValue("CameraPage.Radio_LastAmount"));

			return this;
		}
		
		
		
		public CameraPage clickBTN_Submit() throws Throwable
		{
			
			keywords.click("xpath", _instance.getValue("CameraPage.BTN_Submit"));

			return this;
		}
		
		public CameraPage clickRadio_Custom() throws Throwable
		{
			
			 keywords.jsClick("xpath", _instance.getValue("CameraPage.Radio_Custom"));

			return this;
		}
		public CameraPage enterAnalyticsDevice(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("CameraPage.Edit_AnalyticsDevice"), value);
			return this;
	}

		public CameraPage clickonAddAnalyticsDevice()
		{
			keywords.jsClick("xpath", _instance.getValue("CameraPage.BTN_AddAnalyticsDevice"));
			
			return this;
		}
		public CameraPage clickonCameraLink()
		{
			keywords.jsClick("xpath", _instance.getValue("CameraPage.LINK_CameraLink"));
			
			return this;
		}
}

