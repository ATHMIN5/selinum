package athm.d7;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class listener1 implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Sorry, Test failed");
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
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
