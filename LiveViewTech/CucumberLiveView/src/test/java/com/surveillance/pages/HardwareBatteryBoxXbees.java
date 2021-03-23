package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class HardwareBatteryBoxXbees {
	PropertySingleton _instance = null;

	public HardwareBatteryBoxXbees() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("HardwareBatteryBoxXbees");
	
	public HardwareBatteryBoxXbees clickonBatteryBoxXbees()
	{
		keywords.jsClick("xpath", _instance.getValue("HardwareBatteryBoxXbees.BTN_BatteryBoxXbees"));
		return this;
	}
	public HardwareBatteryBoxXbees clickonBackToIndex()
	{
		keywords.jsClick("xpath", _instance.getValue("HardwareBatteryBoxXbees.BTN_BackToIndex"));
		return this;
	}
	 public HardwareBatteryBoxXbees SelectManufacturer(String Data) throws Throwable{
			keywords.SelectDropDown("xpath", _instance.getValue("HardwareBatteryBoxXbees.DropDown_Manufacturer"), Data);
			return this;
		}
	 public HardwareBatteryBoxXbees enterSerial(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("HardwareBatteryBoxXbees.Edit_Serial"), value);
			return this;
	}
	 public HardwareBatteryBoxXbees SelectOwner(String Data) throws Throwable{
			keywords.SelectDropDown("xpath", _instance.getValue("HardwareBatteryBoxXbees.DropDown_Owner"), Data);
			return this;
		}

		public HardwareBatteryBoxXbees clickonSave()
		{
			keywords.jsClick("xpath", _instance.getValue("HardwareBatteryBoxXbees.BTN_Save"));
			return this;
		}
		public HardwareBatteryBoxXbees clickonHardware()
		{
			keywords.jsClick("xpath", _instance.getValue("HardwareBatteryBoxXbees.BTN_Hardware"));
			return this;
		}
	public HardwareBatteryBoxXbees enterBatteryBoxXBees(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("HardwareBatteryBoxXbees.Edit_BatteryBoxXBees"), value);
		return this;
		}
	public HardwareBatteryBoxXbees clickonSearch()
	{
		keywords.jsClick("xpath", _instance.getValue("HardwareBatteryBoxXbees.BTN_Search"));
		return this;
	}
	public HardwareBatteryBoxXbees clickonNewBatteryBoxXbee()
	{
		keywords.jsClick("xpath", _instance.getValue("HardwareBatteryBoxXbees.BTN_NewBatteryBoxXbee"));
		return this;
	}
	public String verifyYouarenotauthorized() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("HardwareBatteryBoxXbees.LBL_Youarenotauthorized"));
		return Data;
	}
	public String verifySerialisrequired() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("HardwareBatteryBoxXbees.LBL_Serialisrequired"));
		return Data;
	}
	public String verifyManufacturerisrequired() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("HardwareBatteryBoxXbees.LBL_Manufacturerisrequired"));
		return Data;
	}
	public String verifyModelisrequired() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("HardwareBatteryBoxXbees.LBL_Modelisrequired"));
		return Data;
	}

	
	}
