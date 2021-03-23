package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class SuspendedCasepage {
PropertySingleton _instance = null;
	
	public SuspendedCasepage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("SuspendedCasepage");
	
	
	
	public SuspendedCasepage clickonEdit()
	{
		keywords.jsClick("xpath", _instance.getValue("Suspendedcase_BTN.Edit"));
		return this;
	}
	public SuspendedCasepage clickonNotifications()
	{
		keywords.jsClick("xpath", _instance.getValue("Suspendedcase_BTN.Notifications"));
		return this;
	}
	public SuspendedCasepage clickonUpdateUser()
	{
		keywords.jsClick("xpath", _instance.getValue("Suspendedcase_BTN.UpdateUser"));
		return this;
	}
	public String verifyTheUserwasupdated() throws Exception {
		String Data= keywords.getText("xpath", _instance.getValue("Suspendedcase_LBL.TheUserwasupdated"));
		return Data;
	}
	
	}


