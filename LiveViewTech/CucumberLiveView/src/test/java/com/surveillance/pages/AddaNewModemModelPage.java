package com.surveillance.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AddaNewModemModelPage {
	PropertySingleton _instance = null;

	public AddaNewModemModelPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("BoxPage");
	
	public AddaNewModemModelPage clickonHardwareModels()
	{
		keywords.jsClick("xpath", _instance.getValue("AddaNewModemModelPage.BTN_HardwareModels"));
		return this;
	}
	public AddaNewModemModelPage clickonModems()
	{
		keywords.jsClick("xpath", _instance.getValue("AddaNewModemModelPage.BTN_Modems"));
		return this;
	}
	public AddaNewModemModelPage clickonAddaNewModemModel()
	{
		keywords.jsClick("xpath", _instance.getValue("AddaNewModemModelPage.BTN_AddaNewModemModel"));
		return this;
	}
	public AddaNewModemModelPage enterManufacturer(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.edit_Manufacturer"), value);
		return this;
}
	public AddaNewModemModelPage enterModel(String value) throws Exception 
	{
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.edit_Model"), value);
		return this;
}
	public AddaNewModemModelPage ClickonEthernet(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Ethernet"), value);
		return this;
	}
	public boolean verifyEthernetIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Ethernet"));
		return enable;
	}
	public AddaNewModemModelPage Clickon80211a(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211a"), value);
		return this;
	}
	public boolean verify80211aIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211a"));
		return enable;
	}
	public AddaNewModemModelPage Clickon80211b(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211b"), value);
		return this;
	}
	public boolean verify80211bIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211b"));
		return enable;
	}
	public AddaNewModemModelPage Clickon80211g(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211g"), value);
		return this;
	}
	public boolean verify80211gIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211g"));
		return enable;
	}
	public AddaNewModemModelPage Clickon80211n(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211n"), value);
		return this;
	}
	public boolean verify80211nIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_80211n"));
		return enable;
	}
	public AddaNewModemModelPage ClickonPCMCIA(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_PCMCIA"), value);
		return this;
	}
	public boolean verifyPCMCIAIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_PCMCIA"));
		return enable;
	}
	public AddaNewModemModelPage ClickonExpressCard(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_ExpressCard"), value);
		return this;
	}
	public boolean verifyExpressCardIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_ExpressCard"));
		return enable;
	}
	public AddaNewModemModelPage ClickonUSB(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_USB"), value);
		return this;
	}
	public boolean verifyUSBIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_USB"));
		return enable;
	}
		public boolean verifyVerizonWireless3GIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_VerizonWireless3G"));
		return enable;
	}
	public AddaNewModemModelPage ClickonVerizonWireless3G(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_VerizonWireless3G"), value);
		return this;
	}
 public AddaNewModemModelPage ClickonSprint3G(String value) throws Exception {
	keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Sprint3G"), value);
	return this;
}
 public boolean verifySprint3GIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Sprint3G"));
		return enable;
	}
 public AddaNewModemModelPage ClickonCoaxial(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Coaxial"), value);
		return this;
	}
 public boolean verifyCoaxialIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Coaxial"));
		return enable;
	}
 public AddaNewModemModelPage ClickonCanopy900Mhz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy900Mhz"), value);
		return this;
	}
 public boolean verifyCanopy900MhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy900Mhz"));
		return enable;
	}
 public AddaNewModemModelPage ClickonCanopy24Ghz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy24Ghz"), value);
		return this;
	}
 public boolean verifyCanopy24GhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy24Ghz"));
		return enable;
	}
 public AddaNewModemModelPage ClickonCanopy51Ghz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy51Ghz"), value);
		return this;
	}
 public boolean verifyCanopy51GhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy51Ghz"));
		return enable;
	}
 public AddaNewModemModelPage ClickonCanopy52Ghz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy52Ghz"), value);
		return this;
	}
 public boolean verifyCanopy52GhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy52Ghz"));
		return enable;
	}
 public AddaNewModemModelPage ClickonCanopy54Ghz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy54Ghz"), value);
		return this;
	}
 public boolean verifyCanopy54GhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy54Ghz"));
		return enable;
 }
 public AddaNewModemModelPage ClickonCanopy57Ghz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy57Ghz"), value);
		return this;
	}
 public boolean verifyCanopy57GhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy57Ghz"));
		return enable;
}
 public AddaNewModemModelPage ClickonCanopy59Ghz(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy59Ghz"), value);
		return this;
	}
 public boolean verifyCanopy59GhzIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_Canopy59Ghz"));
		return enable;
}
 public AddaNewModemModelPage ClickonDSLRJ11(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_DSLRJ11"), value);
		return this;
	}
 public boolean verifyDSLRJ11IsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_DSLRJ11"));
		return enable;
}
 public AddaNewModemModelPage ClickonUnionWireless(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_UnionWireless"), value);
		return this;
	}
 public boolean verifyUnionWirelessIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_UnionWireless"));
		return enable;
}
 public AddaNewModemModelPage ClickonVerizonWirelessLTE(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue(" AddaNewModemModelPage.CheckBox_VerizonWirelessLTE"), value);
		return this;
	}

 public boolean verifyVerizonWirelessLTEIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_VerizonWirelessLTE"));
		return enable;
}
 public AddaNewModemModelPage ClickonATT3G(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_ATT3G"), value);
		return this;
	}
 public boolean verifyATT3GIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_ATT3G"));
		return enable;
}
 public AddaNewModemModelPage ClickonATTLTE(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_ATTLTE"), value);
		return this;
	}
 public boolean verifyATTLTEIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_ATTLTE"));
		return enable;
}
 public AddaNewModemModelPage ClickonSupportsHTTP(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_SupportsHTTP"), value);
		return this;
	}
 public boolean verifySupportsHTTPIsEnable() throws Exception {
		boolean enable=keywords.isEnabled("xpath", _instance.getValue("AddaNewModemModelPage.CheckBox_SupportsHTTP"));
		return enable;
}
 public AddaNewModemModelPage enterStreetAddress(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_StreetAddress"), value);
		return this;
}
 public AddaNewModemModelPage enterCity(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_City"), value);
		return this;
}
 public AddaNewModemModelPage SelectState(String Data) throws Throwable{
		keywords.SelectDropDown("xpath", _instance.getValue("AddaNewModemModelPage.DropDown_State"), Data);
		return this;
	}
 public AddaNewModemModelPage enterZip(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_Zip"), value);
		return this;
}
 public AddaNewModemModelPage SelectCountry(String Data) throws Throwable{
		keywords.SelectDropDown("xpath", _instance.getValue("AddaNewModemModelPage.DropDown_Country"), Data);
		return this;
	}
 public AddaNewModemModelPage enterSalesContact(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_SalesContact"), value);
		return this;
}
 public AddaNewModemModelPage enterSalesPhone(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_SalesPhone"), value);
		return this;
}
 public AddaNewModemModelPage enterSalesEmail(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_SalesEmail"), value);
		return this;
}
 public AddaNewModemModelPage enterSupportContact(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_SupportContact"), value);
		return this;
}
 public AddaNewModemModelPage enterSupportPhone(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_SupportPhone"), value);
		return this;
}
 public AddaNewModemModelPage enterSupportEmail(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_SupportEmail"), value);
		return this;
}
 public AddaNewModemModelPage clickonCancel()
	{
		keywords.jsClick("xpath", _instance.getValue("AddaNewModemModelPage.BTN_Cancel"));
		return this;
	}
	public AddaNewModemModelPage clickonAddNewModemModel()
	{
		keywords.jsClick("xpath", _instance.getValue("AddaNewModemModelPage.BTN_AddNewModemModel"));
		return this;
	}
	 public AddaNewModemModelPage enterNotes(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddaNewModemModelPage.Edit_Notes"), value);
		return this;
}
//	public AddaNewModemModelPage clickonAddaNewModemModel()
//	{
//		keywords.jsClick("xpath", _instance.getValue("AddaNewModemModelPage.BTN_AddaNewModemModel"));
//		return this;
//	}
	public String verifyTheModemManufacturerwasNOTaddedPleasetryagain() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("AddaNewModemModelPage.LBL_TheModemManufacturerwasNOTaddedPleasetryagain"));
		return Data;
	}
	public String verifyTheModemModelmustnotbeblank() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("AddaNewModemModelPage.LBL_TheModemModelmustnotbeblank"));
		return Data;
	}
	public String verifyTheModemManufacturerwassuccessfullyadded() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("AddaNewModemModelPage.LBL_TheModemManufacturerwassuccessfullyadded"));
		return Data;
	}

}
