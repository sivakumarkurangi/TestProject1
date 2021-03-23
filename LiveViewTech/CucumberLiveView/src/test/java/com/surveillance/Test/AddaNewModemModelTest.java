package com.surveillance.Test;
import java.util.Hashtable;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.surveillance.pages.AddaNewModemModelPage;
import com.surveillance.pages.AdminPage;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;
public class AddaNewModemModelTest  extends BaseTest{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	LoginTest loginTest=new LoginTest();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	AdminPage adminPage=new AdminPage();
	AddaNewModemModelPage addaNewModemModelPage=new AddaNewModemModelPage();
	public AddaNewModemModelTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);		
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddaNewModemModelTest1(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add a New Modem Model Test ");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addaNewModemModelPage.clickonHardwareModels();
	passLog();
	addaNewModemModelPage.clickonModems();
	passLog();
	addaNewModemModelPage.clickonAddaNewModemModel();
	passLog();
	addaNewModemModelPage.enterManufacturer(h2.get("Manufacturer"));
	passLog();
	addaNewModemModelPage.enterModel(h2.get("Model"));
	passLog();
	addaNewModemModelPage.ClickonEthernet("ON");
	passLog();
	addaNewModemModelPage.Clickon80211a("ON");
	passLog();
	addaNewModemModelPage.Clickon80211b("ON");
	passLog();
	addaNewModemModelPage.Clickon80211g("ON");
	passLog();
	addaNewModemModelPage.Clickon80211n("ON");
	passLog();
	addaNewModemModelPage.ClickonPCMCIA("ON");
	passLog();
	addaNewModemModelPage.ClickonExpressCard("ON");
	passLog();
	addaNewModemModelPage.ClickonUSB("ON");
	passLog();
	addaNewModemModelPage.ClickonVerizonWireless3G("ON");
	passLog();
	addaNewModemModelPage.ClickonVerizonWireless3G("ON");
	passLog();
	addaNewModemModelPage.ClickonSprint3G("ON");
	passLog();
	addaNewModemModelPage.ClickonCoaxial("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy900Mhz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy24Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy51Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy52Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy54Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy57Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy59Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonDSLRJ11("ON");
	passLog();
	addaNewModemModelPage.ClickonUnionWireless("ON");
	passLog();
	addaNewModemModelPage.ClickonATT3G("ON");
	passLog();
	addaNewModemModelPage.ClickonATTLTE("ON");
	passLog();
	addaNewModemModelPage.ClickonSupportsHTTP("ON");
	passLog();
	addaNewModemModelPage.enterStreetAddress(h2.get("StreetAddress"));
	passLog();
	addaNewModemModelPage.enterCity(h2.get("City"));
	passLog();
	addaNewModemModelPage.SelectState(h2.get("State"));
	passLog();
	addaNewModemModelPage.enterZip(h2.get("Zip"));
	passLog();
//	addaNewModemModelPage.SelectCountry(h2.get("Country"));
//	passLog();
	addaNewModemModelPage.enterSalesContact(h2.get("SalesContact"));
	passLog();
	addaNewModemModelPage.enterSalesPhone(h2.get("SalesPhone"));
	passLog();
	addaNewModemModelPage.enterSalesEmail(h2.get("SalesEmail"));
	passLog();
	addaNewModemModelPage.enterSupportContact(h2.get("SupportContact"));
	passLog();
	addaNewModemModelPage.enterSupportPhone(h2.get("SupportPhone"));
	passLog();
	addaNewModemModelPage.enterSupportEmail(h2.get("SupportEmail"));
	passLog();
	addaNewModemModelPage.enterNotes(h2.get("Notes"));
	passLog();
	addaNewModemModelPage.clickonAddNewModemModel();
	passLog();
	s_assert = new SoftAssert();
	String actualTheModemManufacturerwassuccessfullyadded=addaNewModemModelPage.verifyTheModemManufacturerwassuccessfullyadded();
	s_assert.assertEquals(actualTheModemManufacturerwassuccessfullyadded, "The Modem Manufacturer was successfully added!");
	passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddaNewModemModelTestErrorvalidation(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add a New Modem Model Test Error Validation");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addaNewModemModelPage.clickonHardwareModels();
	passLog();
	addaNewModemModelPage.clickonModems();
	passLog();
	addaNewModemModelPage.clickonAddaNewModemModel();
	passLog();
	addaNewModemModelPage.clickonAddNewModemModel();
	passLog();
	s_assert = new SoftAssert();
	String actualTheModemManufacturerwasNOTaddedPleasetryagain=addaNewModemModelPage.verifyTheModemManufacturerwasNOTaddedPleasetryagain();
	s_assert.assertEquals(actualTheModemManufacturerwasNOTaddedPleasetryagain, "The Modem Manufacturer was NOT added. Please try again.");
	passLog();
	String actualTheModemModelmustnotbeblank=addaNewModemModelPage.verifyTheModemModelmustnotbeblank();
	s_assert.assertEquals(actualTheModemModelmustnotbeblank, "The Modem Model must not be blank.");
	passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddaNewModemModelTestWithCancelBUtton(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add a New Modem Model Test With With Cancel BUtton");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addaNewModemModelPage.clickonHardwareModels();
	passLog();
	addaNewModemModelPage.clickonModems();
	passLog();
	addaNewModemModelPage.clickonAddaNewModemModel();
	passLog();
	addaNewModemModelPage.enterManufacturer(h2.get("Manufacturer"));
	passLog();
	addaNewModemModelPage.enterModel(h2.get("Model"));
	passLog();
	addaNewModemModelPage.ClickonEthernet("ON");
	passLog();
	addaNewModemModelPage.Clickon80211a("ON");
	passLog();
	addaNewModemModelPage.Clickon80211b("ON");
	passLog();
	addaNewModemModelPage.Clickon80211g("ON");
	passLog();
	addaNewModemModelPage.Clickon80211n("ON");
	passLog();
	addaNewModemModelPage.ClickonPCMCIA("ON");
	passLog();
	addaNewModemModelPage.ClickonExpressCard("ON");
	passLog();
	addaNewModemModelPage.ClickonUSB("ON");
	passLog();
	addaNewModemModelPage.ClickonVerizonWireless3G("ON");
	passLog();
	addaNewModemModelPage.ClickonVerizonWireless3G("ON");
	passLog();
	addaNewModemModelPage.ClickonSprint3G("ON");
	passLog();
	addaNewModemModelPage.ClickonCoaxial("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy900Mhz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy24Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy51Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy52Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy54Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy57Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonCanopy59Ghz("ON");
	passLog();
	addaNewModemModelPage.ClickonDSLRJ11("ON");
	passLog();
	addaNewModemModelPage.ClickonUnionWireless("ON");
	passLog();
	addaNewModemModelPage.ClickonATT3G("ON");
	passLog();
	addaNewModemModelPage.ClickonATTLTE("ON");
	passLog();
	addaNewModemModelPage.ClickonSupportsHTTP("ON");
	passLog();
	addaNewModemModelPage.enterStreetAddress(h2.get("StreetAddress"));
	passLog();
	addaNewModemModelPage.enterCity(h2.get("City"));
	passLog();
	addaNewModemModelPage.SelectState(h2.get("State"));
	passLog();
	addaNewModemModelPage.enterZip(h2.get("Zip"));
	passLog();
//	addaNewModemModelPage.SelectCountry(h2.get("Country"));
//	passLog();
	addaNewModemModelPage.enterSalesContact(h2.get("SalesContact"));
	passLog();
	addaNewModemModelPage.enterSalesPhone(h2.get("SalesPhone"));
	passLog();
	addaNewModemModelPage.enterSalesEmail(h2.get("SalesEmail"));
	passLog();
	addaNewModemModelPage.enterSupportContact(h2.get("SupportContact"));
	passLog();
	addaNewModemModelPage.enterSupportPhone(h2.get("SupportPhone"));
	passLog();
	addaNewModemModelPage.enterSupportEmail(h2.get("SupportEmail"));
	passLog();
	addaNewModemModelPage.enterNotes(h2.get("Notes"));
	passLog();
	addaNewModemModelPage.clickonCancel();
	passLog();
}
	@Test(priority = 0, dataProvider = "setData1")
	public void AddaNewModemModelTestverifyMOdemModelElements(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add a New Modem Model Test verify MOdem Model Elements");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	addaNewModemModelPage.clickonHardwareModels();
	passLog();
	addaNewModemModelPage.clickonModems();
	passLog();
	addaNewModemModelPage.clickonAddaNewModemModel();
	passLog();
	s_assert = new SoftAssert();
	s_assert.assertTrue(addaNewModemModelPage.verifyUnionWirelessIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyEthernetIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verify80211aIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verify80211bIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verify80211gIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verify80211nIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyPCMCIAIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyExpressCardIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyUSBIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyVerizonWireless3GIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyVerizonWirelessLTEIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifySprint3GIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCoaxialIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy900MhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy24GhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy51GhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy52GhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy54GhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy57GhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyCanopy59GhzIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyDSLRJ11IsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyUnionWirelessIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyATT3GIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifyATTLTEIsEnable());
	s_assert.assertTrue(addaNewModemModelPage.verifySupportsHTTPIsEnable());
	}
	
	@DataProvider
	public Object[][] setData1(){
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("AddaNewModemModelPage", "AddaNewModemModelPage", xls);  
}
}
