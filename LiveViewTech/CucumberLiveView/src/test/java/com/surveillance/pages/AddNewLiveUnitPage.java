package com.surveillance.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AddNewLiveUnitPage {
	
		PropertySingleton _instance = null;

		public AddNewLiveUnitPage() 
		{
			_instance = PropertySingleton.getInstance();
		}

		public GenericKeywords keywords = new GenericKeywords("BoxPage");
		
		public AddNewLiveUnitPage clickonInstallations()
		{
			keywords.jsClick("xpath", _instance.getValue("AddLIveUnitPage.BTN_Installations"));
			return this;
		}
		public AddNewLiveUnitPage clickonLiveUnits() 
		{
			keywords.jsClick("xpath", _instance.getValue("AddLIveUnitPage.BTN_LiveUnits"));
			return this;
		}
		public AddNewLiveUnitPage clickonAddaNewLiveUnit()
		{
			keywords.jsClick("xpath", _instance.getValue("AddLIveUnitPage.BTN_AddaNewLiveUnit"));
			return this;
		}
		public AddNewLiveUnitPage enterSerialNumber(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_SerialNumber"), new SimpleDateFormat("YYYYMMDDMMHHmmss").format(new Date()));
			return this;
	}
		public AddNewLiveUnitPage SelectClient(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_Client"), Data);
			return this;
		}
		public AddNewLiveUnitPage clickonAddNewLiveUnit()
		{
			keywords.jsClick("xpath", _instance.getValue("AddLIveUnitPage.BTN_AddNewLiveUnit"));
			return this;
		}
		
		public AddNewLiveUnitPage clickonCancel()
		{
			keywords.jsClick("xpath", _instance.getValue("AddLIveUnitPage.BTN_Cancel"));
			return this;
		}
		public AddNewLiveUnitPage enterClientAssetID(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_ClientAssetID"), value);
			return this;
	}
		public AddNewLiveUnitPage enterName(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_Name"), value);
			return this;
	}
		public AddNewLiveUnitPage SelectSubscriptionType(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_SubscriptionType"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectLocation(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_Location"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectOwnedbyClient(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_OwnedbyClient"), Data);
			return this;
		}
		public AddNewLiveUnitPage enterWorkOrderNumber(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_WorkOrderNumber"), value);
			return this;
	}
		public AddNewLiveUnitPage SelectBillOfLadingMonth(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_BillOfLadingMonth"), Data);
			return this;
		}

		public AddNewLiveUnitPage SelectBillOfLadingDay(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_BillOfLadingDay"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectBillOfLadingYear(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_BillOfLadingYear"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectWarrantyEndMonth(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_WarrantyEndMonth"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectWarrantyEndDay(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_WarrantyEndDay"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectWarrantyEndYear(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_WarrantyEndYear"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectSLA(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_SLA"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectDeterrentProfile(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DeterrentProfile"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectAnnouncementProfile(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_AnnouncementProfile"), Data);
			return this;
		}
		public AddNewLiveUnitPage SelectPatrolServer(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_PatrolServer"), Data);
			return this;
		}
		public AddNewLiveUnitPage ClickonDisableCameraPatrolwhenD3SecurityArmed(String value) throws Exception {
			keywords.checkClick("xpath", _instance.getValue("AddLIveUnitPage.CheckBox_DisableCameraPatrolwhenD3SecurityArmed"), value);
			return this;
		}
		public AddNewLiveUnitPage ClickonCustomerHardwareReserveHolding(String value) throws Exception {
			keywords.checkClick("xpath", _instance.getValue("AddLIveUnitPage.CheckBox_CustomerHardwareReserveHolding"), value);
			return this;
		}
		public AddNewLiveUnitPage enterGPSLatitude(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_GPSLatitude"), value);
			return this;
	}
		public AddNewLiveUnitPage enterGPSLongitude(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_GPSLongitude"), value);
		return this;
}
		public AddNewLiveUnitPage ClickonAutoRetrieveGPSCoordinates(String value) throws Exception {
	keywords.checkClick("xpath", _instance.getValue("AddLIveUnitPage.CheckBox_AutoRetrieveGPSCoordinates"), value);
	return this;
}

		public AddNewLiveUnitPage ClickonShowTankLevelsScreen(String value) throws Exception {
	keywords.checkClick("xpath", _instance.getValue("AddLIveUnitPage.CheckBox_ShowTankLevelsScreen"), value);
	return this;
}
		public AddNewLiveUnitPage SelectAntennaType(String Data) throws Throwable
{
	keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_AntennaType"), Data);
	return this;
}
		public AddNewLiveUnitPage SelectPowerTimer(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_PowerTimer"), Data);
			return this;
		}

		public AddNewLiveUnitPage ClickonUsesaBooster(String value) throws Exception {
	keywords.checkClick("xpath", _instance.getValue("AddLIveUnitPage.CheckBox_UsesaBooster"), value);
	return this;
}
		public AddNewLiveUnitPage SelectBatteriesCellVoltage(String Data) throws Throwable
{
	keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_BatteriesCellVoltage"), Data);
	return this;
}
public AddNewLiveUnitPage enterNumberOfBatteries(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_NumberOfBatteries"), value);
	return this;
}
public AddNewLiveUnitPage SelectDateLiveUnitwasInstalledMonth(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasInstalledMonth"), Data);
return this;
}
public AddNewLiveUnitPage SelectDateLiveUnitwasInstalledDay(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasInstalledDay"), Data);
return this;
}
public AddNewLiveUnitPage SelectDateLiveUnitwasInstalledYear(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasInstalledYear"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateLiveUnitwasLastServicedMonth(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasLastServicedMonth"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateLiveUnitwasLastServicedDay(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasLastServicedDay"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateLiveUnitwasLastServicedYear(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasLastServicedYear"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateWhenLiveUnitisEstimatedtobeRemovedMonth(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateWhenLiveUnitisEstimatedtobeRemovedMonth"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateWhenLiveUnitisEstimatedtobeRemovedYear(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateWhenLiveUnitisEstimatedtobeRemovedYear"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateWhenLiveUnitisEstimatedtobeRemovedDay(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateWhenLiveUnitisEstimatedtobeRemovedDay"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateLiveUnitwasRemovedMonth(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasRemovedMonth"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateLiveUnitwasRemovedDay(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasRemovedDay"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownDateLiveUnitwasRemovedYear(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_DateLiveUnitwasRemovedYear"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownExpectedReturnDateMonth(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_ExpectedReturnDateMonth"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownExpectedReturnDateDay(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_ExpectedReturnDateDay"), Data);
return this;
}
public AddNewLiveUnitPage SelectDropDownExpectedReturnDateYear(String Data) throws Throwable
{
keywords.SelectDropDown("xpath", _instance.getValue("AddLIveUnitPage.DropDown_ExpectedReturnDateYear"), Data);
return this;
}
public AddNewLiveUnitPage enterSecurityReportSchedule(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_SecurityReportSchedule"), value);
	return this;
}
public AddNewLiveUnitPage enterSecurityNotificationSchedule(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_SecurityNotificationSchedule"), value);
	return this;
}
public AddNewLiveUnitPage enterSecurityDeterentSchedule(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_SecurityDeterentSchedule"), value);
	return this;
}
public AddNewLiveUnitPage enterContactName(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_ContactName"), value);
	return this;
}

public AddNewLiveUnitPage enterContactPhone(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_ContactPhone"), value);
	return this;
}
public AddNewLiveUnitPage enterContactMobile(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_ContactMobile"), value);
	return this;
}
public AddNewLiveUnitPage enterContactAddress(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_ContactAddress"), value);
	return this;
}
public AddNewLiveUnitPage enterContactEmail(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_ContactEmail"), value);
	return this;
}
public AddNewLiveUnitPage enterNotes(String value) throws Exception {
	keywords.enterData("xpath", _instance.getValue("AddLIveUnitPage.Edit_Notes"), value);
	return this;
}
public String verifyTheLiveUnitwassuccessfullyadded() throws Exception {
	String Data= keywords.getText("xpath", _instance.getValue("AddLIveUnitPage.LBL_TheLiveUnitwassuccessfullyadded"));
	return Data;
}

public void acceptAlert()
{
	keywords.handleAlert("accept");
}

public void dismissAlert()
{
	keywords.handleAlert("dismiss");
}
}
