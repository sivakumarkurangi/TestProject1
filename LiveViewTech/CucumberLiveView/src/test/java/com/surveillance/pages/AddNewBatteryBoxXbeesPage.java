package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AddNewBatteryBoxXbeesPage {
	PropertySingleton _instance = null;

	public AddNewBatteryBoxXbeesPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("AddNewBatteryBoxXbeesPage");
	
	public AddNewBatteryBoxXbeesPage clickonBatteryBoxXbees()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewBatteryBoxXbees.BTN_BatteryBoxXbees"));
		return this;
	}
	public AddNewBatteryBoxXbeesPage clickonNewBatteryBoxXBeeManufacturer()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewBatteryBoxXbees.BTN_NewBatteryBoxXBeeManufacturer"));
		return this;
	}
	 public AddNewBatteryBoxXbeesPage enterBatteryBoxXBeeManufacturers(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_BatteryBoxXBeeManufacturers"), value);
			return this;
	}
	 public AddNewBatteryBoxXbeesPage clickonSearch()
		{
			keywords.jsClick("xpath", _instance.getValue("AddNewBatteryBoxXbees.BTN_Search"));
			return this;
		}
	 public AddNewBatteryBoxXbeesPage clickonBackToIndex()
		{
			keywords.jsClick("xpath", _instance.getValue("AddNewBatteryBoxXbees.BTN_BackToIndex"));
			return this;
		}
		public AddNewBatteryBoxXbeesPage enterManufacturer(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_Manufacturer"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterModel(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_Model"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterStreet(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_Street"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterCity(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_City"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterState(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_State"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterZip(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_Zip"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterCountry(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_Country"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterSalesContact(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_SalesContact"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterSalesPhone(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_SalesPhone"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterSalesEmail(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_SalesEmail"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterSupportContact(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_SupportContact"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterSupportPhone(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_SupportPhone"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage enterSupportEmail(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("AddNewBatteryBoxXbees.Edit_SupportEmail"), value);
			return this;
	}
		public AddNewBatteryBoxXbeesPage clickonSave()
		{
			keywords.jsClick("xpath", _instance.getValue("AddNewBatteryBoxXbees.BTN_Save"));
			return this;
		}
		public String verifyManufacturerisrequired() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("AddNewBatteryBoxXbees.LBL_Manufacturerisrequired"));
			return Data;
		}
		public String verifyModelisrequired() throws Exception {
			String Data= keywords.getText("xpath", _instance.getValue("AddNewBatteryBoxXbees.LBL_Modelisrequired"));
			return Data;
		}
}
