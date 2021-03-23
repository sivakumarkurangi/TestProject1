package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.AddNewLiveUnitPage;
import com.surveillance.pages.HomePage;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class AddNewLiveUnitTest  extends BaseTest {
	
	
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage =new HomePage();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	AddNewLiveUnitPage addnewliveunitpage=new AddNewLiveUnitPage();
	
	public AddNewLiveUnitTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	
	

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
		
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewLiveUnitTest1(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New LiveUnit Test With Mandatory Fields");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addnewliveunitpage.clickonInstallations();
	passLog();
	addnewliveunitpage.clickonLiveUnits();
	passLog();
	addnewliveunitpage.clickonAddaNewLiveUnit();
	passLog();
	addnewliveunitpage.enterSerialNumber(h2.get("SerialNumber"));
	passLog();
	addnewliveunitpage.SelectClient(h2.get("Client"));
	passLog();
	addnewliveunitpage.clickonAddNewLiveUnit();
	passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewLiveUnitTest2(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New LiveUnit Test With Mandatory Fields Cancel BUtton");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addnewliveunitpage.clickonInstallations();
	passLog();
	addnewliveunitpage.clickonLiveUnits();
	passLog();
	addnewliveunitpage.clickonAddaNewLiveUnit();
	passLog();
	addnewliveunitpage.enterSerialNumber(h2.get("SerialNumber"));
	passLog();
	addnewliveunitpage.SelectClient(h2.get("Client"));
	passLog();
	addnewliveunitpage.clickonCancel();
	passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewLiveUnitTest3(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add New LiveUnit Test With All Fields");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addnewliveunitpage.clickonInstallations();
	passLog();
	addnewliveunitpage.clickonLiveUnits();
	passLog();
	addnewliveunitpage.clickonAddaNewLiveUnit();
	passLog();
	addnewliveunitpage.enterSerialNumber(h2.get("SerialNumber"));
	passLog();
	addnewliveunitpage.SelectClient(h2.get("Client"));
	passLog();
	addnewliveunitpage.enterClientAssetID(h2.get("ClientAssetID"));
	passLog();
	addnewliveunitpage.enterName(h2.get("Name"));
	passLog();
	addnewliveunitpage.SelectSubscriptionType(h2.get("SubscriptionType"));
	passLog();
	addnewliveunitpage.SelectLocation(h2.get("Location"));
	passLog();
	addnewliveunitpage.SelectOwnedbyClient(h2.get("OwnedbyClient"));
	passLog();
	addnewliveunitpage.enterWorkOrderNumber(h2.get("WorkOrderNumber"));
	passLog();
	addnewliveunitpage.SelectBillOfLadingMonth(h2.get("BillOfLadingMonth"));
	passLog();
	addnewliveunitpage.SelectBillOfLadingYear(h2.get("BillOfLadingYear"));
	passLog();
	addnewliveunitpage.SelectBillOfLadingDay(h2.get("BillOfLadingDay"));
	passLog();
	addnewliveunitpage.SelectWarrantyEndDay(h2.get("WarrantyEndDay"));
	passLog();
	addnewliveunitpage.SelectWarrantyEndMonth(h2.get("WarrantyEndMonth"));
	passLog();
	addnewliveunitpage.SelectWarrantyEndYear(h2.get("WarrantyEndYear"));
	passLog();
	addnewliveunitpage.SelectSLA(h2.get("SLA"));
	passLog();
	addnewliveunitpage.SelectDeterrentProfile(h2.get("DeterrentProfile"));
	passLog();
	addnewliveunitpage.SelectAnnouncementProfile(h2.get("AnnouncementProfile"));
	passLog();	
	addnewliveunitpage.SelectPatrolServer(h2.get("PatrolServer"));
	passLog();
	addnewliveunitpage.ClickonDisableCameraPatrolwhenD3SecurityArmed("ON");
	passLog();
	addnewliveunitpage.ClickonCustomerHardwareReserveHolding("ON");
	passLog();
	addnewliveunitpage.enterGPSLatitude(h2.get("GPSLatitude"));
	passLog();
	addnewliveunitpage.enterGPSLongitude(h2.get("GPSLongitude"));
	passLog();
	addnewliveunitpage.ClickonAutoRetrieveGPSCoordinates("ON");
	passLog();
	addnewliveunitpage.ClickonShowTankLevelsScreen("ON");
	passLog();
	addnewliveunitpage.SelectAntennaType(h2.get("AntennaType"));
	passLog();
	addnewliveunitpage.ClickonUsesaBooster("ON");
	passLog();
	addnewliveunitpage.SelectPowerTimer(h2.get("PowerTimer"));
	passLog();
	addnewliveunitpage.SelectBatteriesCellVoltage(h2.get("BatteriesCellVoltage"));
	passLog();
	addnewliveunitpage.enterNumberOfBatteries(h2.get("NumberOfBatteries"));
	passLog();
	addnewliveunitpage.SelectDateLiveUnitwasInstalledDay(h2.get("DateLiveUnitwasInstalledDay"));
	passLog();
	addnewliveunitpage.SelectDateLiveUnitwasInstalledMonth(h2.get("DateLiveUnitwasInstalledMonth"));
	passLog();
	addnewliveunitpage.SelectDateLiveUnitwasInstalledYear(h2.get("DateLiveUnitwasInstalledYear"));
	passLog();
	addnewliveunitpage.SelectDropDownDateLiveUnitwasLastServicedDay(h2.get("DateLiveUnitwasLastServicedDay"));
	passLog();
	addnewliveunitpage.SelectDropDownDateLiveUnitwasLastServicedMonth(h2.get("DateLiveUnitwasLastServicedMonth"));
	passLog();
	addnewliveunitpage.SelectDropDownDateLiveUnitwasLastServicedYear(h2.get("DateLiveUnitwasLastServicedYear"));
	passLog();
	addnewliveunitpage.SelectDropDownDateWhenLiveUnitisEstimatedtobeRemovedDay(h2.get("DateWhenLiveUnitisEstimatedtobeRemovedDay"));
	passLog();
	addnewliveunitpage.SelectDropDownDateWhenLiveUnitisEstimatedtobeRemovedMonth(h2.get("DateWhenLiveUnitisEstimatedtobeRemovedMonth"));
	passLog();
	addnewliveunitpage.SelectDropDownDateWhenLiveUnitisEstimatedtobeRemovedYear(h2.get("DateWhenLiveUnitisEstimatedtobeRemovedYear"));
	passLog();
	addnewliveunitpage.SelectDropDownDateLiveUnitwasRemovedDay(h2.get("DateLiveUnitwasRemovedDay"));
	passLog();
	addnewliveunitpage.SelectDropDownDateLiveUnitwasRemovedMonth(h2.get("DateLiveUnitwasRemovedMonth"));
	passLog();
	addnewliveunitpage.SelectDropDownDateLiveUnitwasRemovedYear(h2.get("DateLiveUnitwasRemovedYear"));
	passLog();
	addnewliveunitpage.SelectDropDownExpectedReturnDateDay(h2.get("ExpectedReturnDateDay"));
	passLog();
	addnewliveunitpage.SelectDropDownExpectedReturnDateMonth(h2.get("ExpectedReturnDateMonth"));
	passLog();
	addnewliveunitpage.SelectDropDownExpectedReturnDateYear(h2.get("ExpectedReturnDateYear"));
	passLog();
	addnewliveunitpage.enterSecurityReportSchedule(h2.get("SecurityReportSchedule"));
	passLog();
	addnewliveunitpage.enterSecurityNotificationSchedule(h2.get("SecurityNotificationSchedule"));
	passLog();
	addnewliveunitpage.enterSecurityDeterentSchedule(h2.get("SecurityDeterentSchedule"));
	passLog();
	addnewliveunitpage.enterContactName(h2.get("ContactName"));
	passLog();
	addnewliveunitpage.enterContactPhone(h2.get("ContactPhone"));
	passLog();
	addnewliveunitpage.enterContactMobile(h2.get("ContactMobile"));
	passLog();
	addnewliveunitpage.enterContactEmail(h2.get("ContactEmail"));
	passLog();
	addnewliveunitpage.enterContactAddress(h2.get("ContactAddress"));
	passLog();
	addnewliveunitpage.enterNotes(h2.get("Notes"));
	passLog();
	addnewliveunitpage.clickonAddNewLiveUnit();
	try {
	addnewliveunitpage.acceptAlert();
	}
	catch (Throwable e) {
		
	}
	passLog();
	
	s_assert = new SoftAssert();
	String actualTheLiveUnitwassuccessfullyadded=addnewliveunitpage.verifyTheLiveUnitwassuccessfullyadded();
	s_assert.assertEquals(actualTheLiveUnitwassuccessfullyadded, "The Live Unit was successfully added!");
	passLog();
	}
	@DataProvider
	public Object[][] setData1()
{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("AddNewLIveUnit", "AddNewLiveUnit", xls);
	  
}
}