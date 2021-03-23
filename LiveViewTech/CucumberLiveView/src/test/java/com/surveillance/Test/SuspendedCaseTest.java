package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.AddNewUserPage;
import com.surveillance.pages.HomePage;
import com.surveillance.pages.LoginPage;
import com.surveillance.pages.SuspendedCasepage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class SuspendedCaseTest extends BaseTest {
	LoginPage login=new LoginPage();
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	AddNewUserPage addNewUserPage=new AddNewUserPage();
	SuspendedCasepage suspendedpagecase=new SuspendedCasepage();
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public SuspendedCaseTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	
	@Test(priority = 0, dataProvider = "setData1")
	public void SuspendedCaseTestEdit(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("SuspendedCaseTestWithEdit");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		addNewUserPage.enterFilter(h2.get("Filter"));
		passLog();
		suspendedpagecase.clickonEdit();
		passLog();
		addNewUserPage.selectExpMonth(h2.get("LoginExpirationMonth"));
		passLog();
		addNewUserPage.selectExpDay(h2.get("LoginExpirationDay"));
		passLog();
		addNewUserPage.selectExpYear(h2.get("LoginExpirationYear"));
		passLog();
		addNewUserPage.clickOnUpdateUser();
		passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void SuspendedCaseTestUpdatedValidation(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("SuspendedCaseTestUpdatedValidation");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		addNewUserPage.enterFilter(h2.get("Filter"));
		passLog();
		suspendedpagecase.clickonEdit();
		passLog();
		addNewUserPage.selectExpMonth(h2.get("LoginExpirationMonth"));
		passLog();
		addNewUserPage.selectExpDay(h2.get("LoginExpirationDay"));
		passLog();
		addNewUserPage.selectExpYear(h2.get("LoginExpirationYear"));
		passLog();
		addNewUserPage.clickOnUpdateUser();
		passLog();
		s_assert = new SoftAssert();
		String actualTheUserwasupdated=suspendedpagecase.verifyTheUserwasupdated();
		s_assert.assertEquals(actualTheUserwasupdated,"The User was updated!");
		passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void SuspendedCaseTestWIthNotification(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("SuspendedCaseTestWithNotification");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		addNewUserPage.enterFilter(h2.get("Filter"));
		passLog();
		suspendedpagecase.clickonEdit();
		passLog();
		addNewUserPage.selectExpMonth(h2.get("LoginExpirationMonth"));
		passLog();
		addNewUserPage.selectExpDay(h2.get("LoginExpirationDay"));
		passLog();
		addNewUserPage.selectExpYear(h2.get("LoginExpirationYear"));
		passLog();
		addNewUserPage.clickOnUpdateUser();
		passLog();
	suspendedpagecase.clickonNotifications();
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("SuspendedCase", "SuspendedCase", xls);
	}
}
