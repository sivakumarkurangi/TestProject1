package cucmberDemo1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.pages.LoginPage;
import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions ( 
        features ="./featureFiles/LiveViewRunner.feature",
//		features = "classpath:features",
//		 features =Constants.features,
        glue = {"cucmberDemo1"}
//        ,tags = {Constants.tags}
        )
public class LoginTest extends BaseTest
{
	int scenarioCount=1;
	LoginPage login=new LoginPage();
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	private TestNGCucumberRunner testNGCucumberRunner;
	public LoginTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass1() throws Exception 
	{    
    System.out.println("Start");
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.setProperty("cucumber.options", "--features ./featureFiles/ --tags ~@ignore");
        System.out.println("Befor class is done");
}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	
	}

	

	public void logintest(Hashtable<String, String> h2) throws Exception 
	{
		
		System.out.println("userEmail "+h2.get("Email"));
		login.enterLoginEmail(h2.get("Email"));
		login.clickOnLogin();
		login.enterPassword(h2.get("Password"));
		login.clickOnLogin();
		
		System.out.println("dONE");
		
		
	}
	
	
	@Test(priority = 0, dataProvider = "setData1")
	public void loginWithValidCredentials(Hashtable<String, String> h2) throws Throwable 
	{
		int size= getScenario().length;
		System.out.println("getScenario().length : "+size);
		Object[][] o1=getScenario();
		for(int i=0;i< size;i++)
		{
			PickleEventWrapper		eventwrapper=(PickleEventWrapper) o1[i][0];
		String scenarioName=	eventwrapper.getPickleEvent().pickle.getName();
			if(scenarioName.equals("Login with valid credentials"))
			{
				System.out.println("Test sceanrio name @: "+eventwrapper.getPickleEvent().pickle.getName());
		    	String SheetName="Logintest";
//		    	String ScenarioName=eventwrapper.getPickleEvent().pickle.getName();
		    	System.out.println("String SheetName : "+ SheetName);
//		    	GenericKeywords.workBook=new Xls_Reader(System.getProperty("user.dir")+"/TestData/"+"TestData"+".xlsx");
		    	GenericKeywords.getDataFromWorkBook=h2;
		     		
		   		extentLoggerECP = parentExtentLogger.createNode(scenarioName+"_"+scenarioCount);
		    			scenarioCount=scenarioCount+1;
		    	
		    		System.out.println("GenericKeywords.dataRowNumber : "+GenericKeywords.dataRowNumber);
		    	  	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
			
		
			break;
			}
			}
		 
				
	}
	

	
	
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("Logintest", "LoginTC", xls);
	}
	
	public Object[][] getScenario() throws IOException {
//    	System.out.println("@Dataprovider : "+cucumberFeature.toString());
//        return testNGCucumberRunner.provideFeatures();  
    	
    	
    	System.out.println("Scenario length :"+testNGCucumberRunner.provideScenarios().length);
    	Object[][] o1= 	testNGCucumberRunner.provideScenarios();
    	
    	Object[][] o2;
    	ArrayList<ArrayList> list=new ArrayList<>();
    	for(int i=0;i<o1.length;i++)
    	{
    		
        	System.out.println("Size : "+o1[0].length);
//        		System.out.println("@Dataprovider : "+o1[i][1].toString().replace("\"", ""));
//        		System.out.println("MainSuiteRunner.featureDescript\'[ion : "+MainSuiteRunner.featureDescription);
        		if(o1[i][1].toString().replace("\"", "").equals("Title of your featureI want to use this template for my feature file"))
        		{
        			System.out.println("Matching");
        		ArrayList list1=new ArrayList<>();	
        		list1.add(o1[i][0]);
        		list1.add(o1[i][1]);
//        		System.out.println("o1[i][0] : "+o1[i][0]);
//        		System.out.println("o1[i][0] : "+o1[i][1]);
        		list.add(list1);
        		} 
        		else{
        			System.out.println("not matching");
        		}
              	
    	}
    	o2=new Object[list.size()][2];
    	for(int i=0;i<list.size();i++)
    	{
    		o2[i][0]=list.get(i).get(0);
    		o2[i][1]=list.get(i).get(1);
    	}
    	
    	System.out.println("Updated list size : "+o2.length);
    	 return o2;
    }
}
