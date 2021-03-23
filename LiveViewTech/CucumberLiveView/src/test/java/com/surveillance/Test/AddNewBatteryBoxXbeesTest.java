package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.surveillance.pages.AddNewBatteryBoxXbeesPage;
import com.surveillance.pages.AddaNewModemModelPage;
import com.surveillance.pages.AdminPage;
import com.surveillance.pages.HardwareBatteryBoxXbees;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class AddNewBatteryBoxXbeesTest extends BaseTest{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	LoginTest loginTest=new LoginTest();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	AdminPage adminPage=new AdminPage();
	AddaNewModemModelPage addaNewModemModelPage=new AddaNewModemModelPage();
	HardwareBatteryBoxXbees hardwareBatteryBoxXbees=new HardwareBatteryBoxXbees();
	AddNewBatteryBoxXbeesPage addNewBatteryBoxXbeespage=new AddNewBatteryBoxXbeesPage();
	public AddNewBatteryBoxXbeesTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);		
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewBatteryBoxXbeesTestwithsaveButton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New Battery Box Xbees Test with save button");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	addNewBatteryBoxXbeespage.clickonBatteryBoxXbees();
	passLog();
	Thread.sleep(5000);
	passLog();
	addNewBatteryBoxXbeespage.clickonNewBatteryBoxXBeeManufacturer();
	passLog();
	addNewBatteryBoxXbeespage.enterManufacturer(h2.get("Manufacturer"));
	passLog();
	addNewBatteryBoxXbeespage.enterModel(h2.get("Model"));
	passLog();
	addNewBatteryBoxXbeespage.enterStreet(h2.get("Street"));
	passLog();
	addNewBatteryBoxXbeespage.enterCity(h2.get("City"));
	passLog();
	addNewBatteryBoxXbeespage.enterState(h2.get("State"));
	passLog();
	addNewBatteryBoxXbeespage.enterZip(h2.get("Zip"));
	passLog();
	addNewBatteryBoxXbeespage.enterCountry(h2.get("Country"));
	passLog();
	addNewBatteryBoxXbeespage.enterSalesContact(h2.get("SalesContact"));
	passLog();
	addNewBatteryBoxXbeespage.enterSalesPhone(h2.get("SalesPhone"));
	passLog();
	addNewBatteryBoxXbeespage.enterSalesEmail(h2.get("SalesEmail"));
	passLog();
	addNewBatteryBoxXbeespage.enterSupportContact(h2.get("SupportContact"));
	passLog();
	addNewBatteryBoxXbeespage.enterSupportEmail(h2.get("SupportEmail"));
	passLog();
	addNewBatteryBoxXbeespage.enterSupportPhone(h2.get("SupportPhone"));
	passLog();
	addNewBatteryBoxXbeespage.clickonSave();
	passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewBatteryBoxXbeesTestwithBackToIndexButton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New Battery Box Xbees Test with BackToIndex button");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	addNewBatteryBoxXbeespage.clickonBatteryBoxXbees();
	passLog();
	Thread.sleep(5000);
	addNewBatteryBoxXbeespage.clickonNewBatteryBoxXBeeManufacturer();
	passLog();
	addNewBatteryBoxXbeespage.clickonBackToIndex();
	passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewBatteryBoxXbeesTestwithSearchButton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New Battery Box Xbees Test with Search button");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	addNewBatteryBoxXbeespage.clickonBatteryBoxXbees();
	passLog();
	addNewBatteryBoxXbeespage.enterBatteryBoxXBeeManufacturers(h2.get("BatteryBoxXBeeManufacturers"));
	passLog();
	addNewBatteryBoxXbeespage.clickonSearch();
	passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewBatteryBoxXbeesTestErrorValidationForManufacturer(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New Battery Box Xbees Test Error Validation");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	addNewBatteryBoxXbeespage.clickonBatteryBoxXbees();
	passLog();
	Thread.sleep(5000);
	passLog();
	addNewBatteryBoxXbeespage.clickonNewBatteryBoxXBeeManufacturer();
	passLog();
	addNewBatteryBoxXbeespage.clickonSave();
	passLog();
	s_assert = new SoftAssert();
	String actualManufacturerisrequired=addNewBatteryBoxXbeespage.verifyManufacturerisrequired();
	s_assert.assertEquals(actualManufacturerisrequired, "Manufacturer is required");
	passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewBatteryBoxXbeesTestErrorValidationForMOdel(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New Battery Box Xbees Test Error Validation");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	addNewBatteryBoxXbeespage.clickonBatteryBoxXbees();
	passLog();
	addNewBatteryBoxXbeespage.clickonNewBatteryBoxXBeeManufacturer();
	passLog();
	addNewBatteryBoxXbeespage.clickonSave();
	passLog();
	s_assert = new SoftAssert();
	String actualModelisrequired=addNewBatteryBoxXbeespage.verifyModelisrequired();
	s_assert.assertEquals(actualModelisrequired, "Model is required");
	passLog();
	}
	@DataProvider
	public Object[][] setData1(){
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("AddNewBatteryBoxXbeesTest", "AddNewBatteryBoxXbeesTest", xls);  
}
}
