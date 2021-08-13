package listenerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

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
