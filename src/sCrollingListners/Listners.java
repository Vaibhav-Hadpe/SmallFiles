package sCrollingListners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener
{
  @Override
   public void onTestSuccess(ITestResult result) 
   {
	Reporter.log("TC is Passed Screenshot Taken", true);
	ITestListener.super.onTestSuccess(result);
   }
  @Override
	public void onTestFailure(ITestResult result) 
    {
	    Reporter.log("TC is Failed Screenshot Taken", true);
		ITestListener.super.onTestFailure(result);
	}
}
