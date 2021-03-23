package cucmberDemo1;

import com.surveillance.Test.BaseTest;
import com.surveillance.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	LoginPage loginPage=new LoginPage();
	BaseTest baseTest=new BaseTest();
	
	@Given("User able enter the User Name \"(.*?)\"$")
	public void user_able_enter_the_User_Name(String sheeetName) throws Exception
	{
		loginPage.enterLoginEmail(sheeetName);
	    
	}

	@Given("User able enter the User Name using {string}")
	public void user_able_enter_the_User_Name_using(String string) {
	    
		System.out.println("Sheet name:"+string);
	    
	}
	
	@Given("user able to click on the Login button")
	public void user_able_to_click_on_the_Login_button() throws Throwable {
	    
		loginPage.clickOnLogin();
		baseTest.passLog("user able to click on the Login button");
	}

	@When("User able to enter password")
	public void user_able_to_enter_password() {
	    
	    
	}
	
	@Given("User able to enter the {string} in Login page")
	public void user_able_to_enter_the_in_Login_page(String string) {
	    
		System.out.println("data : "+string);
	}
	
	@Given("User able to enter the User Name")
	public void user_able_to_enter_the_User_Name() throws Exception 
	{
		
		String data=loginPage.keywords.getDataFromWorkBook.get("Email");
		System.out.println("User Name data: "+data);
		loginPage.enterLoginEmail(data);
		baseTest.passLog("User able to enter the User Name");
		
	}

	@Given("User able to enter the Password")
	public void user_able_to_enter_the_Password() throws Exception 
	{
		String data=loginPage.keywords.getDataFromWorkBook.get("Password");
		System.out.println("Data : "+data);
		loginPage.enterPassword(data);
		baseTest.passLog("User able to enter the Password");
	}
	
	@Given("User able to enter the User Name as {string} in Login page")
	public void user_able_to_enter_the_User_Name_as_in_Login_page(String string) throws Throwable 
	{
System.out.println("user Name : "+string);
		loginPage.enterLoginEmail(string);
	    baseTest.passLog();
	    
	}

	@Given("User able to enter the Password as {string} in Login page")
	public void user_able_to_enter_the_Password_as_in_Login_page(String string) throws Exception 
	{
		System.out.println("Password : "+string);
		loginPage.enterPassword(string);
		baseTest.passLog();
	    
	}

	@Given("User able to open the browser and enter the URL")
	public void user_able_to_open_the_browser_and_enter_the_URL() 
	{
	    
	}
}
