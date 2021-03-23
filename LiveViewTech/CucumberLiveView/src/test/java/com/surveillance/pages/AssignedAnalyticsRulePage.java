package com.surveillance.pages;
import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AssignedAnalyticsRulePage {
	
		
		PropertySingleton _instance = null;

		public AssignedAnalyticsRulePage() 
		{
			_instance = PropertySingleton.getInstance();
		} 

public GenericKeywords keywords = new GenericKeywords("BoxPage");

public AssignedAnalyticsRulePage clickonAddAssignedAnalyticsRule()
	{
		keywords.jsClick("xpath", _instance.getValue("AssignedAnalyticsRulePage.BTN_AddAssignedAnalyticsRule"));
	    return this;
	}
	public AssignedAnalyticsRulePage enterName(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_Name"), value);
		return this;
		}
	public AssignedAnalyticsRulePage SelectAnalyticsDevice(String Data) throws Throwable
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AssignedAnalyticsRulePage.DropDown_AnalyticsDevice"), Data);
		return this;
	}
	public AssignedAnalyticsRulePage SelectPreset(String Data) throws Throwable
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AssignedAnalyticsRulePage.DropDown_Preset"), Data);
		return this;
	}
	public AssignedAnalyticsRulePage enterCameraStreamID(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_CameraStreamID"), value);
		return this;
		}
	public AssignedAnalyticsRulePage enterCawamoServiceID(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_CawamoServiceID"), value);
		return this;
		}
	public AssignedAnalyticsRulePage enterEdgeID(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_EdgeID"), value);
		return this;
		}
	public AssignedAnalyticsRulePage enterInclusionArea(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_InclusionArea"), value);
			return this;
			}
	public AssignedAnalyticsRulePage enterExclusionArea(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_ExclusionArea"), value);
		return this;
		}
	public AssignedAnalyticsRulePage enterSchedule(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_Schedule"), value);
		return this;
		}
	public AssignedAnalyticsRulePage enterNotes(String value) throws Exception
	{
		keywords.enterData("xpath", _instance.getValue("AssignedAnalyticsRulePage.Edit_Notes"), value);
		return this;
		}
	public AssignedAnalyticsRulePage clickonSave()
		{
			keywords.jsClick("xpath", _instance.getValue("AssignedAnalyticsRulePage.BTN_Save"));
		    return this;
		}
}
