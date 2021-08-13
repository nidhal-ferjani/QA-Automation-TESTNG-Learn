package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener implements IInvokedMethodListener, ITestListener, ISuiteListener {
	
    @Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    	System.out.println("BeforeInvocation : " + testResult.getTestClass().getName() + " ====> " + method.getTestMethod().getMethodName() );
	 
	}

    @Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    	System.out.println("AfterInvocation : " + testResult.getTestClass().getName() + " ====> " + method.getTestMethod().getMethodName() );
	 
	}
    
    @Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		System.out.println("onTestStart ===> Test Name : " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess ===> Test Name : " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure ===> Test Name : " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// Before <test> tag xml File

		System.out.println("onStart ===> Test Tag Name : " + context.getName());
		ITestNGMethod[] methods = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag  : ");
		for (ITestNGMethod iTestNGMethod : methods) {
			System.out.println(iTestNGMethod.getMethodName());

		}

	}

	@Override
	public void onFinish(ITestContext context) {

		// After <test> tag xml File

		System.out.println("onFinish ===> Test Tag Name : " + context.getName());
	}

	
	@Override
	public void onStart(ISuite suite) {
		// When <suite> tag starts
		System.out.println("onStart =====> BeforeSuite Start : " + suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		// When <suite> tag Completed
		System.out.println("onFinish =====> AfterSuite Finish : " + suite.getName());
	}

}
