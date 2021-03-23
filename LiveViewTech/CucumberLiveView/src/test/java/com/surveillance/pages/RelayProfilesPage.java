package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class RelayProfilesPage {
	PropertySingleton _instance = null;

	public RelayProfilesPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("BoxPage");
	
	public RelayProfilesPage clickonBackendadmin()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.Backendadmin"));
		return this;
	}
	public RelayProfilesPage clickonRelayProfiles()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.RelayProfiles"));
		return this;
	}
	public RelayProfilesPage clickonAddaRelayProfile()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.AddaRelayProfile"));
		return this;
	}
	public RelayProfilesPage enterName(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.Name"),data);
		return this;
	}
	public RelayProfilesPage selectHardwareType(String data) throws Throwable
	{
		keywords.SelectDropDown("xpath", _instance.getValue("RelayProfiles_DropDown.HardwareType"),data);
		return this;
	}
	public RelayProfilesPage enterDigitalInput1Name(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.DigitalInput1Name"),data);
		return this;
	}
	public RelayProfilesPage ClickonDigitalInput1HighAsserting(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("RelayProfiles_CheckBox.DigitalInput1HighAsserting"), value);
		return this;
	}
	public RelayProfilesPage enterDigitalInput1RelayNumber(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.DigitalInput1RelayNumber"),data);
		return this;
	}
	
	public RelayProfilesPage ClickonDigitalInput1EmailWhenAsserted(String value) throws Exception 
	{
		keywords.checkClick("xpath", _instance.getValue("RelayProfiles_CheckBox.DigitalInput1EmailWhenAsserted"), value);
		return this;
	}
	public RelayProfilesPage enterDigitalInput2Name(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.DigitalInput2Name"),data);
		return this;
	}
	public RelayProfilesPage ClickonDigitalInput2HighAsserting(String value) throws Exception 
	{
		keywords.checkClick("xpath", _instance.getValue("RelayProfiles_CheckBox.DigitalInput2HighAsserting"), value);
		return this;
	}
	public RelayProfilesPage enterDigitalInput2RelayNumber(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.DigitalInput2RelayNumber"),data);
		return this;
	}
	public RelayProfilesPage ClickonDigitalInput2EmailWhenAsserted(String value) throws Exception 
	{
		keywords.checkClick("xpath", _instance.getValue("RelayProfiles_CheckBox.DigitalInput2EmailWhenAsserted"), value);
		return this;
	}
	public RelayProfilesPage enterDigitalInput3Name(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.DigitalInput3Name"),data);
		return this;
	}
	public RelayProfilesPage ClickonDigitalInput3HighAsserting(String value) throws Exception 
	{
		keywords.checkClick("xpath", _instance.getValue("RelayProfiles_CheckBox.DigitalInput3HighAsserting"), value);
		return this;
	}
	public RelayProfilesPage enterDigitalInput3RelayNumber(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.DigitalInput3RelayNumber"),data);
		return this;
	}
	public RelayProfilesPage ClickonDigitalInput3EmailWhenAsserted(String value) throws Exception 
	{
		keywords.checkClick("xpath", _instance.getValue("RelayProfiles_CheckBox.DigitalInput3EmailWhenAsserted"), value);
		return this;
	}
	public RelayProfilesPage enterNotes(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.Notes"),data);
		return this;
	}
	public RelayProfilesPage clickonCancel()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.Cancel"));
		return this;
	}
	public RelayProfilesPage clickonAddNewRelayProfile()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.AddNewRelayProfile"));
		return this;
	}
	public String verifyTheRelayProfilewassuccessfullyadded() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("RelayProfiles_LBL.TheRelayProfilewassuccessfullyadded"));
		return Data;
	}
	public RelayProfilesPage enterFilter(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.Filter"),data);
		return this;
	}
	public RelayProfilesPage selectResultsperPage(String data) throws Throwable
	{
		keywords.SelectDropDown("xpath", _instance.getValue("RelayProfiles_DropDown.ResultsperPage"),data);
		return this;
	}
	public RelayProfilesPage clickonAddNote()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.AddNote"));
		return this;
	}
	public RelayProfilesPage clickonEditForRelayProfile()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.EditForRelayProfile"));
		return this;
	}
	public String verifyTheRelayProfilewasupdated() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("RelayProfiles_LBL.TheRelayProfilewasupdated"));
		return Data;
	}
	public RelayProfilesPage clickonBack()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.Back"));
		return this;
	}
	public RelayProfilesPage clickonDelete()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.Delete"));
		return this;
	}
	public RelayProfilesPage clickonUpdateEdit()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.UpdateEdit"));
		return this;
	}
	public RelayProfilesPage clickonHomepageCopy()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.HomepageCopy"));
		return this;
	}
	public RelayProfilesPage clickonHomepageDelete()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.HomepageDelete"));
		return this; 
	}
	public RelayProfilesPage clickonHomepageEdit()
	{
		keywords.jsClick("xpath", _instance.getValue("RelayProfiles_BTN.HomepageEdit"));
		return this;
	}
	public RelayProfilesPage enterNewNote(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("RelayProfiles_Edit.NewNote"),data);
		return this;
	}
}
