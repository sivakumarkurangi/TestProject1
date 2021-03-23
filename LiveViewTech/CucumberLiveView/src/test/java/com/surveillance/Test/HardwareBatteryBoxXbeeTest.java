package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.AddaNewModemModelPage;
import com.surveillance.pages.AdminPage;
import com.surveillance.pages.HardwareBatteryBoxXbees;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class HardwareBatteryBoxXbeeTest extends BaseTest {
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	LoginTest loginTest=new LoginTest();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	AdminPage adminPage=new AdminPage();
	AddaNewModemModelPage addaNewModemModelPage=new AddaNewModemModelPage();
	HardwareBatteryBoxXbees hardwareBatteryBoxXbees=new HardwareBatteryBoxXbees();
	public HardwareBatteryBoxXbeeTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);		
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void HardwareBatteryBoxXbeeTestwithsavebutton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Hardware Battery Box Xbee Test with save button");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	hardwareBatteryBoxXbees.clickonBatteryBoxXbees();
	passLog();
	hardwareBatteryBoxXbees.clickonNewBatteryBoxXbee();
	passLog();
	hardwareBatteryBoxXbees.SelectManufacturer(h2.get("Manufacturer"));
	passLog();
	hardwareBatteryBoxXbees.enterSerial(h2.get("Serial"));
	passLog();
	hardwareBatteryBoxXbees.SelectOwner(h2.get("Owner"));
	passLog();
	hardwareBatteryBoxXbees.clickonSave();
	passLog();
	
}
	@Test(priority = 0, dataProvider = "setData1")
	public void HardwareBatteryBoxXbeeTestwithbackbutton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Hardware Battery Box Xbee Test with BacktiIndex button");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	hardwareBatteryBoxXbees.clickonBatteryBoxXbees();
	passLog();
	hardwareBatteryBoxXbees.clickonNewBatteryBoxXbee();
	passLog();
	hardwareBatteryBoxXbees.clickonBackToIndex();
	passLog();
}
	@Test(priority = 0, dataProvider = "setData1")
	public void HardwareBatteryBoxXbeeTestwithSearchbutton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Hardware Battery Box Xbee Test with Search button");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	hardwareBatteryBoxXbees.clickonBatteryBoxXbees();
	passLog();
	hardwareBatteryBoxXbees.enterBatteryBoxXBees(h2.get("BatteryBoxXBees"));
	passLog();
	hardwareBatteryBoxXbees.clickonSearch();
	passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void HardwareBatteryBoxXbeeTestErrorValidation(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Hardware Battery Box Xbee Test Error Validation");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	hardwareBatteryBoxXbees.clickonHardware();
	passLog();
	hardwareBatteryBoxXbees.clickonBatteryBoxXbees();
	passLog();
	hardwareBatteryBoxXbees.clickonNewBatteryBoxXbee();
	passLog();
	hardwareBatteryBoxXbees.clickonSave();
	passLog();
	s_assert = new SoftAssert();
	String actualManufacturerisrequired=hardwareBatteryBoxXbees.verifyManufacturerisrequired();
	s_assert.assertEquals(actualManufacturerisrequired, "Manufacturer is required");
	passLog();
	String actualModelisrequired=hardwareBatteryBoxXbees.verifyModelisrequired();
	s_assert.assertEquals(actualModelisrequired, "Model is required");
	passLog();
	}
	
	@DataProvider
	public Object[][] setData1(){
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("HardwareBatteryBoxXbees", "HardwareBatteryBoxXbees", xls);  
}
	}