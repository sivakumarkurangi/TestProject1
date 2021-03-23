package cucmberDemo1;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
@CucumberOptions ( 
        features ="./featureFiles/LiveViewRunner.feature",
//		features = "classpath:features",
//		 features =Constants.features,
        glue = {"cucmberDemo1"}
//        ,tags = {Constants.tags}
        ) 
		/*,plugin= { "pretty",
                "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" },
        monochrome = true)*/

public class LiveViewRunner 
{
	private TestNGCucumberRunner testNGCucumberRunner;
	@BeforeClass(alwaysRun = true)
    public void setUpClass1() throws Exception 
	{    
    System.out.println("Start");
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.setProperty("cucumber.options", "--features ./featureFiles/ --tags ~@ignore");
        System.out.println("Befor class is done");
}
	
	 @Test(dataProvider = "features")    
	 public void loginWithInvalidCredentials(int a,int b) throws Throwable 
	    {
		 System.out.println("Start Test");
		int size= getScenario().length;
		Object[][] o1=getScenario();
		for(int i=0;i< size;i++)
		{
			PickleEventWrapper		eventwrapper=(PickleEventWrapper) o1[i][0];
		String scenarioName=	eventwrapper.getPickleEvent().pickle.getName();
			if(scenarioName.equals("Title of your scenario"))
			{
				testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
			}
		}
		 
				
		}
	
	
	 @DataProvider//(parallel=true)
	    public Object[][] features() throws IOException {
/*//	    	System.out.println("@Dataprovider : "+cucumberFeature.toString());
//	        return testNGCucumberRunner.provideFeatures();  
	    	
	    	
	    	System.out.println("Scenario length :"+testNGCucumberRunner.provideScenarios().length);
	    	Object[][] o1= 	testNGCucumberRunner.provideScenarios();
	    	
	    	Object[][] o2;
	    	ArrayList<ArrayList> list=new ArrayList<>();
	    	for(int i=0;i<o1.length;i++)
	    	{
	    		
	        	System.out.println("Size : "+o1[0].length);
//	        		System.out.println("@Dataprovider : "+o1[i][1].toString().replace("\"", ""));
//	        		System.out.println("MainSuiteRunner.featureDescription : "+MainSuiteRunner.featureDescription);
	        		if(o1[i][1].toString().replace("\"", "").equals("Title of your featureI want to use this template for my feature file"))
	        		{
	        			System.out.println("Matching");
	        		ArrayList list1=new ArrayList<>();	
	        		list1.add(o1[i][0]);
	        		list1.add(o1[i][1]);
//	        		System.out.println("o1[i][0] : "+o1[i][0]);
//	        		System.out.println("o1[i][0] : "+o1[i][1]);
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
	    	
	    	System.out.println("Updated list size : "+o2.length);*/
		 Object[][] o2=new Object[1][2];
		 o2[0][0]=10;
		 o2[0][1]=20;
		 
	    	 return o2;
	    }
	 
	 
	 public Object[][] getScenario() throws IOException {
//	    	System.out.println("@Dataprovider : "+cucumberFeature.toString());
//	        return testNGCucumberRunner.provideFeatures();  
	    	
	    	
	    	System.out.println("Scenario length :"+testNGCucumberRunner.provideScenarios().length);
	    	Object[][] o1= 	testNGCucumberRunner.provideScenarios();
	    	
	    	Object[][] o2;
	    	ArrayList<ArrayList> list=new ArrayList<>();
	    	for(int i=0;i<o1.length;i++)
	    	{
	    		
	        	System.out.println("Size : "+o1[0].length);
//	        		System.out.println("@Dataprovider : "+o1[i][1].toString().replace("\"", ""));
//	        		System.out.println("MainSuiteRunner.featureDescription : "+MainSuiteRunner.featureDescription);
	        		if(o1[i][1].toString().replace("\"", "").equals("Title of your featureI want to use this template for my feature file"))
	        		{
	        			System.out.println("Matching");
	        		ArrayList list1=new ArrayList<>();	
	        		list1.add(o1[i][0]);
	        		list1.add(o1[i][1]);
//	        		System.out.println("o1[i][0] : "+o1[i][0]);
//	        		System.out.println("o1[i][0] : "+o1[i][1]);
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
