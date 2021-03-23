package com.surveillance.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.HomePageTestPage;
import com.surveillance.pages.RelayProfilesPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class RelayProfilesTest extends BaseTest {
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	LoginTest loginTest=new LoginTest();
	RelayProfilesPage relayProfilesPage=new RelayProfilesPage();
	String RelayName="LiveView";
	public RelayProfilesTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddRelayProfilesTest(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add RelayProfiles Test ");
		loginTest.logintest(h2);
		passLog();
	    homepagetestpage.clickOnSYSTEMADMIN();
	    passLog();
	    relayProfilesPage.clickonRelayProfiles();
	    passLog();
	    relayProfilesPage.clickonAddaRelayProfile();
	    passLog();
	   RelayName=RelayName+ new  SimpleDateFormat("YYYYMMDDHHmmss").format(new Date());
	    relayProfilesPage.enterName(RelayName);
	    passLog();
	    relayProfilesPage.selectHardwareType(h2.get("HardwareType"));
	    passLog();
	    relayProfilesPage.enterDigitalInput1Name(h2.get("DigitalInput1Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput1HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput1RelayNumber(h2.get("DigitalInput1RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput1EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput2Name(h2.get("DigitalInput2Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput2HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput2RelayNumber(h2.get("DigitalInput2RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput2EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput3Name(h2.get("DigitalInput3Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput3HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput3RelayNumber(h2.get("DigitalInput3RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput3EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterNotes(h2.get("Notes"));
	    passLog();
	    relayProfilesPage.clickonAddNewRelayProfile();
	    passLog();
	    
	    	}
	
	@Test(priority = 0, dataProvider = "setData1",dependsOnMethods = "AddRelayProfilesTest")
	public void AddRelayProfilesTestWIthCancel(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add RelayProfiles Test With Cancel BUtton");
		loginTest.logintest(h2);
		passLog();
	    homepagetestpage.clickOnSYSTEMADMIN();
	    passLog();
	    relayProfilesPage.clickonRelayProfiles();
	    passLog();
	    relayProfilesPage.clickonAddaRelayProfile();
	    passLog();
	    relayProfilesPage.enterName(RelayName);
	    passLog();
	    relayProfilesPage.selectHardwareType(h2.get("HardwareType"));
	    passLog();
	    relayProfilesPage.enterDigitalInput1Name(h2.get("DigitalInput1Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput1HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput1RelayNumber(h2.get("DigitalInput1RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput1EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput2Name(h2.get("DigitalInput2Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput2HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput2RelayNumber(h2.get("DigitalInput2RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput2EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput3Name(h2.get("DigitalInput3Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput3HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput3RelayNumber(h2.get("DigitalInput3RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput3EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterNotes(h2.get("Notes"));
	    passLog();
	    relayProfilesPage.clickonCancel();
	    
	}@Test(priority = 0, dataProvider = "setData1")
	public void AddRelayProfilesTestWithValidation(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add RelayProfiles Test with validation");
		loginTest.logintest(h2);
		passLog();
	    homepagetestpage.clickOnSYSTEMADMIN();
	    passLog();
	    relayProfilesPage.clickonRelayProfiles();
	    passLog();
	    relayProfilesPage.clickonAddaRelayProfile();
	    passLog();
	    relayProfilesPage.enterName(h2.get("Name"));
	    passLog();
	    relayProfilesPage.selectHardwareType(h2.get("HardwareType"));
	    passLog();
	    relayProfilesPage.enterDigitalInput1Name(h2.get("DigitalInput1Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput1HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput1RelayNumber(h2.get("DigitalInput1RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput1EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput2Name(h2.get("DigitalInput2Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput2HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput2RelayNumber(h2.get("DigitalInput2RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput2EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput3Name(h2.get("DigitalInput3Name"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput3HighAsserting("ON");
	    passLog();
	    relayProfilesPage.enterDigitalInput3RelayNumber(h2.get("DigitalInput3RelayNumber"));
	    passLog();
	    relayProfilesPage.ClickonDigitalInput3EmailWhenAsserted("ON");
	    passLog();
	    relayProfilesPage.enterNotes(h2.get("Notes"));
	    passLog();
	    relayProfilesPage.clickonAddNewRelayProfile();
	    passLog();
	    s_assert = new SoftAssert();
		String actualTheRelayProfilewassuccessfullyadded=relayProfilesPage.verifyTheRelayProfilewassuccessfullyadded();
		s_assert.assertEquals(actualTheRelayProfilewassuccessfullyadded,"The Relay Profile was successfully added!");
		passLog();
	    }
	@Test(priority = 0, dataProvider = "setData1")
	public void AddRelayProfilesTestforSearch(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add RelayProfiles Test for Search");
		loginTest.logintest(h2);
		passLog();
	    homepagetestpage.clickOnSYSTEMADMIN();
	    passLog(); 
	    relayProfilesPage.clickonRelayProfiles();
	    passLog();
	    relayProfilesPage.enterFilter(h2.get("Filter"));
	    passLog();
	    relayProfilesPage.selectResultsperPage(h2.get("ResultsperPage"));
	    passLog();
	    }
	
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddRelayProfilesTestEditHomepage(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add RelayProfiles Test Edit Homepage");
		loginTest.logintest(h2); 
		passLog();
	    homepagetestpage.clickOnSYSTEMADMIN();
	    passLog();
	    relayProfilesPage.clickonRelayProfiles();
	    passLog();
	    relayProfilesPage.enterFilter(h2.get("Filter"));
	    passLog();
	    relayProfilesPage.clickonHomepageEdit();
	passLog();
	relayProfilesPage.clickonEditForRelayProfile();
	passLog();
	 s_assert = new SoftAssert();
		String actualTheRelayProfilewasupdated=relayProfilesPage.verifyTheRelayProfilewasupdated();
		s_assert.assertEquals(actualTheRelayProfilewasupdated,"The Relay Profile was updated!");
		passLog();
		relayProfilesPage.enterNewNote(h2.get("NewNote"));
		passLog();
		relayProfilesPage.clickonAddNote();
		passLog();
		
	}
	
	
	@Test(priority = 0, dataProvider = "setData1",dependsOnMethods = "AddRelayProfilesTest")
	public void AddRelayProfilesTestBackBUtton(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add RelayProfiles Test Back Button");
		loginTest.logintest(h2); 
		passLog();
	    homepagetestpage.clickOnSYSTEMADMIN();
	    passLog();
	    relayProfilesPage.clickonRelayProfiles();
	    passLog();
	    relayProfilesPage.enterFilter(RelayName);
	    passLog();
	    relayProfilesPage.clickonHomepageEdit();
	passLog();
	
	}
	
	
	@DataProvider
	public Object[][] setData1() {
		
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("RelayProfile", "RelayProfile", xls);
	}
}
