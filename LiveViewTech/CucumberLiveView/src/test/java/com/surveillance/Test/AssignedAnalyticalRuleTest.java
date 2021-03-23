package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.AssignedAnalyticsRulePage;
import com.surveillance.pages.CameraPage;
import com.surveillance.pages.HomePage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class AssignedAnalyticalRuleTest extends BaseTest 
{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	CameraPage cameraPage =new CameraPage();
	AssignedAnalyticsRulePage assignedAnalyticsRulepage=new AssignedAnalyticsRulePage();
	public AssignedAnalyticalRuleTest() throws Throwable  
	{
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
		
	}
	@Test(priority = 1,dataProvider = "setData1")
	public void AssignedAnalyticalRule(Hashtable<String, String> h2) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  Popup window cancel option");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnCameras();
		passLog();
//		cameraPage.SelectLiveViewTechnologies("LiveView Technologies");
//		passLog();
		cameraPage.clickOnLiveUnit();
		passLog();
//		cameraPage.enterFilterLiveUnits("- TDC00268");
//		passLog();
//		cameraPage.clickSearchForFirstElement();
//		passLog();
		cameraPage.clickOnSelectCameraFirstLInk();
		passLog();
		cameraPage.clickOnSelectSubCameraFirstLInk();
		passLog();
		cameraPage.clickOnAdditionalButtons();
		passLog();
		cameraPage.clickOnGoToLiveUnit();
		passLog();
		cameraPage.enterAnalyticsDevice(h2.get("AnalyticsDevice"));
		passLog();
		cameraPage.clickonAddAnalyticsDevice();
		passLog();
		cameraPage.clickOnCameraLink();
		passLog();
		assignedAnalyticsRulepage.clickonAddAssignedAnalyticsRule();
		passLog();
		assignedAnalyticsRulepage.enterName(h2.get("Name"));
		passLog();
		assignedAnalyticsRulepage.SelectAnalyticsDevice(h2.get("AnalyticsDevice"));
		passLog();
		assignedAnalyticsRulepage.SelectPreset(h2.get("Preset"));
		passLog();
		assignedAnalyticsRulepage.enterCameraStreamID(h2.get("CameraStreamID"));
		passLog();
		assignedAnalyticsRulepage.enterCawamoServiceID(h2.get("CawamoServiceID"));
		passLog();
		assignedAnalyticsRulepage.enterEdgeID(h2.get("EdgeID"));
		passLog();
		assignedAnalyticsRulepage.enterInclusionArea(h2.get("InclusionArea"));
		passLog();
		assignedAnalyticsRulepage.enterExclusionArea(h2.get("ExclusionArea"));
		passLog();
		assignedAnalyticsRulepage.enterSchedule(h2.get("Schedule"));
		passLog();
		assignedAnalyticsRulepage.enterNotes(h2.get("Notes"));
		passLog();
		assignedAnalyticsRulepage.clickonSave();
		passLog();
}
	 @DataProvider
	   	public Object[][] setData1() {
	   		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
	   		return ReadData.getData("AssignedAnalyticsRule", "AssignedAnalyticsRule", xls);
	   	}
}
