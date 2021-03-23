package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.AddNewUserPage;
import com.surveillance.pages.AdminPage;
import com.surveillance.pages.CreateNewClientPage;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.pages.UseradminLabelPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class UseradminLabelTest extends BaseTest {
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	LoginTest loginTest=new LoginTest();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	AdminPage adminPage=new AdminPage();
	UseradminLabelPage useradminlabelpage=new UseradminLabelPage();
	public UseradminLabelTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);		
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void UseradminLabelTestwithLabels(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("User admin Label Test with Labels");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnUSERADMIN();
	passLog();
	s_assert = new SoftAssert();
	String actualUserAdministrations=useradminlabelpage.verifyUserAdministrations();
	s_assert.assertEquals(actualUserAdministrations, "User Administrations");
	passLog();
	String actualUsers=useradminlabelpage.verifyUsers();
	s_assert.assertEquals(actualUsers, "Users");
	passLog();
	String actualClients=useradminlabelpage.verifyClients();
	s_assert.assertEquals(actualClients, "Clients");
	passLog();
	String actualRoles=useradminlabelpage.verifyRoles();
	s_assert.assertEquals(actualRoles, "Roles");
	passLog();
	String actualPolicies=useradminlabelpage.verifyPolicies();
	s_assert.assertEquals(actualPolicies, "Policies");
	passLog();
	String actualPolicyGroups=useradminlabelpage.verifyPolicyGroups();
	s_assert.assertEquals(actualPolicyGroups, "Policy Groups");
	passLog();
	String actualLegend=useradminlabelpage.verifyLegend();
	s_assert.assertEquals(actualLegend, "Legend");
	passLog();
	String actualCameraRights=useradminlabelpage.verifyCameraRights();
	s_assert.assertEquals(actualCameraRights, "Camera Rights");
	passLog();
	String actualNotifications=useradminlabelpage.verifyNotifications();
	s_assert.assertEquals(actualNotifications, "Notifications");
	passLog();
	String actualResetPassword=useradminlabelpage.verifyResetPassword();
	s_assert.assertEquals(actualResetPassword, "Reset Password");
	passLog();
	}
//	@Test(priority = 0, dataProvider = "setData1")
	public void UseradminLabelTestuser(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("User admin Label Test user");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnUSERADMIN();
	passLog();
	adminPage.clickOnUsersLink();
	passLog();
	String actualUserFilter=useradminlabelpage.verifyUserFilter();
	s_assert.assertEquals(actualUserFilter, "Filter");
	passLog();
	String actualUserResultsperPage=useradminlabelpage.verifyUserResultsperPage();
	s_assert.assertEquals(actualUserResultsperPage, "Results per Page");
	passLog();
	String actualAllUsers=useradminlabelpage.verifyAllUsers();
	s_assert.assertEquals(actualAllUsers, "All Users");
	passLog();
	String actualExpiredUsers=useradminlabelpage.verifyExpiredUsers();
	s_assert.assertEquals(actualExpiredUsers, "ExpiredUsers");
	passLog();
	String actualNonexpiredUsers=useradminlabelpage.verifyNonexpiredUsers();
	s_assert.assertEquals(actualNonexpiredUsers, "Non-expired Users");
	passLog();
//	String actualEmailAddress=useradminlabelpage.verifyEmailAddress();
//	s_assert.assertEquals(actualEmailAddress, "Email Address");
//	passLog();
//	String actualUserName=useradminlabelpage.verifyUserName();
//	s_assert.assertEquals(actualUserName, "Name");
//	passLog();
	String actualUserClient=useradminlabelpage.verifyUserClient();
	s_assert.assertEquals(actualUserClient, "Client");
	passLog();
	String actualUserRole=useradminlabelpage.verifyUserRole();
	s_assert.assertEquals(actualUserRole, "Role");
	passLog();
	String actualUserActions=useradminlabelpage.verifyUserActions();
	s_assert.assertEquals(actualUserActions, "Actions");
	passLog();
	String actualAddaNewUser=useradminlabelpage.verifyAddaNewUser();
	s_assert.assertEquals(actualAddaNewUser, "Add a New User");
	passLog();
	String actualAddMultipleUsers=useradminlabelpage.verifyAddMultipleUsers();
	s_assert.assertEquals(actualAddMultipleUsers, "Add Multiple Users");
	passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void UseradminLabelTestClient(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("User admin Label Test Client");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnUSERADMIN();
	passLog();
    adminPage.clickonClients();
    passLog();
	String actualAddaNewClient=useradminlabelpage.verifyAddaNewClient();
	s_assert.assertEquals(actualAddaNewClient, "Add a New Client");
	passLog();
	String actualClientFilter=useradminlabelpage.verifyClientFilter();
	s_assert.assertEquals(actualClientFilter, "Filter");
	passLog();
	String actualClientResultsperPage=useradminlabelpage.verifyClientResultsperPage();
	s_assert.assertEquals(actualClientResultsperPage, "Results per Page");
	passLog();
	String actualClientOnlyActive=useradminlabelpage.verifyClientOnlyActive();
	s_assert.assertEquals(actualClientOnlyActive, "Only Active");
	passLog();
	Thread.sleep(5000);
	passLog();
	String actualClientName=useradminlabelpage.verifyClientName();
	s_assert.assertEquals(actualClientName, "Name");
	passLog();
	String actualClientDistributor=useradminlabelpage.verifyClientDistributor();
	s_assert.assertEquals(actualClientDistributor, "Distributor");
	passLog();
	String actualClientCity=useradminlabelpage.verifyClientCity();
	s_assert.assertEquals(actualClientCity, "City");
	passLog();
	String actualClientState=useradminlabelpage.verifyClientState();
	s_assert.assertEquals(actualClientState, "State");
	passLog();
	String actualClientCountry=useradminlabelpage.verifyClientCountry();
	s_assert.assertEquals(actualClientCountry, "Country");
	passLog();
	String actualClientActions=useradminlabelpage.verifyClientActions();
	s_assert.assertEquals(actualClientActions, "Actions");
	passLog();
	}
	@Test(priority = 0, dataProvider = "setData1")
	public void UseradminLabelTestRoles(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("User admin Label Test Roles");
	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnUSERADMIN();
	passLog();
	adminPage.clickonRoles();
	passLog();
	String actualRolesViewAllRoles=useradminlabelpage.verifyRolesViewAllRoles();
	s_assert.assertEquals(actualRolesViewAllRoles, "View All Roles");
	passLog();
	String actualRolesName=useradminlabelpage.verifyRolesName();
	s_assert.assertEquals(actualRolesName, "Name");
	passLog();
	String actualRolesDescription=useradminlabelpage.verifyRolesDescription();
	s_assert.assertEquals(actualRolesDescription, "Description");
	passLog();
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("Logintest", "LoginTC", xls);
	}
}
	