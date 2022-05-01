package TestAutomation;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listeners implements ITestListener{//implementation is must.
	
	

	public void onTestStart(ITestResult result)//ITestResult is Interface.it will get us the Result of test.& with the help of that result we can recognize the Name and other thing. 
	{  
	System.out.println("Test is Started :- "+result.getName());//getName is the method of ITestResult.it will get us the Name of result that have start.  
	}  
	  
	 
	public void onTestSuccess(ITestResult result) 
	{  
	System.out.println("Success of test cases and its details are :- "+result.getName());  
	}  
	  
	
	public void onTestFailure(ITestResult result) 
	{  
	System.out.println("Hello this failed :- "+result.getName());

	}  
	  
	
	public void onTestSkipped(ITestResult result) 
	{  
	System.out.println("Skip of test cases and its details are :- "+result.getName());  
	}  
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)//SuccessPercentage is use when you have no of assertion and some of it get fail then it will Run.
	{  
	
	
	}  
	  
	 
	public void onStart(ITestContext context)//it will Run at the start of Test class.
	{  
	 
	}  
	  
	 
	public void onFinish(ITestContext context)//it will Run at the Finish of Test class.
	{  
 
	}  

}
