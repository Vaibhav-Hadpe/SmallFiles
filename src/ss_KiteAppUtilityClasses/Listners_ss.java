package ss_KiteAppUtilityClasses;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ss_KiteAppBaseClasses.LaunchSitess;

public class Listners_ss implements ITestListener
{
	LaunchSitess base=new LaunchSitess();//object created for Base class and use obj to call screenshot method.
 @Override
    public void onTestSuccess(ITestResult result)
     {
	   Reporter.log("TC is Passed and Name of TC is "+result.getName(), true);
     }
  
  @Override
	public void onTestFailure(ITestResult result)
    {
	  Reporter.log("TC is Failed and Name of TC is "+result.getName(), true);
	  
	  String TCName = result.getName();//This Step Gives Name of screenshot as TCName.
	  try 
	  {
		base.takescreenshot(TCName);
	  } 
	  catch (IOException e) 
	  {
		
		e.printStackTrace();
	  }
	}
  @Override
	public void onTestSkipped(ITestResult result) 
    {
	  Reporter.log("TC is Skiped and Name of TC is "+result.getName(), true);
	}
}
